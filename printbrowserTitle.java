package naresh;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class brows {
public static void main(String[] args) {
	String chromeDriverlocation = "C:/ChromeDrivers/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromeDriverlocation);
	ChromeDriver driver = new ChromeDriver();
	
	System.out.println(driver.getTitle());
}
}
