package org.evertones.test.selenium

import org.evertones.selenium.WebDriverFactory
import org.openqa.selenium.{By, Keys, WebDriver}
import org.scalatest.{BeforeAndAfterAll, FunSpec, GivenWhenThen, Matchers}

import scala.util.Random


class Selenium4Spec
    extends FunSpec
        with GivenWhenThen
        with Matchers
        with BeforeAndAfterAll {

    var webDriver: WebDriver = _

    override def beforeAll(): Unit = {
        super.beforeAll()
        println("Creating webdriver in BeforeAll")
        webDriver = new WebDriverFactory().createRemoteInstance()
    }

    override def afterAll(): Unit = {
        super.afterAll()

        println("Quiting webdriver in AfterAll")
        webDriver.quit()
    }

    describe("The test with Selenium4 {%s}".format(Random.nextInt(1000))) {
        describe("when performing a search on google {%s}".format(Random.nextInt(1000))) {
            it("should return some results {%s}".format(Random.nextInt(1000))) {
                Given("Hey....")

                webDriver.get("https://www.google.com")
                val input = webDriver.findElement(By.cssSelector("input[name='q']"))
                input.sendKeys("test")
                input.sendKeys(Keys.ENTER)

                val testResultsStat = webDriver.findElement(By.id("result-stats"))
                Given("Result: " + testResultsStat.toString)

                testResultsStat.toString should not be empty
            }
        }
    }

//
//
//    describe("The test with Selenium4 {%s}".format(Random.nextInt(10000))) {
//        describe("when performing a search on google") {
//            it("should return some results") {
//                webDriver.get("https://www.google.com")
//
//                val input = webDriver.findElement(By.cssSelector("input[name='q']"))
//
//                try Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(9))
//                catch {
//                    case e: Exception =>
//                        System.out.println("There was an error waiting... " + e.getMessage)
//                }
//
//                input.sendKeys("test")
//                input.sendKeys(Keys.ENTER)
//
//                val testResultsStat = webDriver.findElement(By.id("result-stats"))
//                Given("Result: " + testResultsStat.toString)
//
//                testResultsStat.toString should not be empty
//
//                webDriver.quit()
//            }
//        }
//    }

}
