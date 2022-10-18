package org.evertones.selenium

import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.RemoteWebDriver

import java.net.URL

class WebDriverFactory {

    def createRemoteInstance(): RemoteWebDriver = {
        val capabilities = new ChromeOptions().setAcceptInsecureCerts(true)

        val remoteUrl    = new URL("http://0.0.0.0:4444")
        new RemoteWebDriver(remoteUrl, capabilities)
    }

}
