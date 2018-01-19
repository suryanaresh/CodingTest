import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorTags {
public static void main(String[] args) {
	String chromeDriverlocation = "C:/ChromeDrivers/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromeDriverlocation);
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.inmar.com/");
	String pageTitle = driver.getTitle();
	int tagsCount = driver.findElements(By.tagName("a")).size();
	for(int j=1;j<=tagsCount;j++)
	{
		System.out.println(driver.findElement(By.xpath("//a["+j+"]")).getText());
	}	
	driver.quit();
}
}
