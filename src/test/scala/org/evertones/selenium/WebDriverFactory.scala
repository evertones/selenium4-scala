package org.evertones.selenium

import java.net.URL

import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.RemoteWebDriver

class WebDriverFactory {

    def createRemoteInstance(): RemoteWebDriver = {
        val capabilities = new ChromeOptions().setAcceptInsecureCerts(true)
        //val capabilities = new FirefoxOptions().setAcceptInsecureCerts(true)

        val remoteUrl    = new URL("http://localhost:4444")
        new RemoteWebDriver(remoteUrl, capabilities)
    }

}
