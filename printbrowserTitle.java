import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintBrowserTitle {
public static void main(String[] args) {
	String chromeDriverlocation = "C:/ChromeDrivers/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromeDriverlocation);
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.inmar.com/");
	System.out.println(driver.getTitle());
	driver.quit();
}
}
