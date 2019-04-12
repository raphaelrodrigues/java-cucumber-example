package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	
	public static WebDriver launch() {
		System.setProperty("webdriver.chrome.driver","/opt/chromedriver");
		String browser = System.getProperty("browser");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("headless", "window-size=1200,600");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		return driver;
	}
}
