import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

/**
 * Created by vijayb on 5/28/2014.
 */

////System.setProperty("webdriver.chrome.driver", "src/test/resources/ExternalDrivers/chromedriver.exe");
////driver = {
////    def chrome = new ChromeDriver()
////    chrome.manage().window().maximize()
////    return chrome
////}
//
//
////environments {
//
////    firefox {
////        driver = { def firefox = new FirefoxDriver()
////            firefox.manage().window().maximize()
////            return firefox
////        }
////    }
////    chrome
//environments{
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/ExternalDrivers/chromedriver.exe");
////        driver = {
////            def chrome = new ChromeDriver()
////            chrome.manage().window().maximize()
////            return chrome
////        }
//    }

//}
/* Or
driver = { new FirefoxDriver() }
driver = "org.openqa.selenium.firefox.FirefoxDriver"
driver = "firefox"
 */

//waiting {
////    timeout = 10
////    retryInterval = 0.5
//}
//Both values are optional and in seconds. If unspecified, the values of 5 for timeout and 0.1 for retryInterval.
//http://www.gebish.org/manual/current/configuration.html#configuration

/*
Driver Caching

Geb’s ability to cache a driver and re-use it for the lifetime of the JVM
(i.e. the implicit driver lifecycle) can be disabled by setting the cacheDriver config option to false.
However, if you do this you become responsible for quitting every driver that is created at the appropriate time.
 */

//reportOnTestFailureOnly = false
//reportsDir = new File("C:\\Vijay\\Projects\\MyFirstGradle\\Reports.html")

environments {

    firefox {
        driver = { def firefox = new FirefoxDriver()
            firefox.manage().window().maximize()
            return firefox
        }
    }
   chrome{
    System.setProperty("webdriver.chrome.driver", "src/test/resources/ExternalDrivers/chromedriver.exe");
        driver = {
            def chrome = new ChromeDriver()
            chrome.manage().window().maximize()
            return chrome
        }
}

}