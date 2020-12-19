package org.evertones.test

import org.evertones.selenium.WebDriverFactory
import org.openqa.selenium.{By, Keys, WebDriver}
import org.scalatest.{FunSpec, GivenWhenThen, Matchers}

import scala.util.Random


class Selenium4Spec
    extends FunSpec
        with GivenWhenThen
        with Matchers {

    val webDriver: WebDriver = new WebDriverFactory().createRemoteInstance()

    describe("The test with Selenium4 {%s}".format(Random.nextInt(10000))) {
        describe("when performing a search on google") {
            it("should return some results") {
                webDriver.get("https://www.google.com")

                val input = webDriver.findElement(By.cssSelector("input[name='q']"))

                input.sendKeys("test")
                input.sendKeys(Keys.ENTER)

                val testResultsStat = webDriver.findElement(By.id("result-stats"))
                Given("Result: " + testResultsStat.toString)

                testResultsStat.toString should not be null

                webDriver.quit()
            }
        }
    }

}
