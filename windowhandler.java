package Naresh;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhand {
public static void main(String[] args) {
	String chromeDriverlocation = "C:/ChromeDriver/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromeDriverlocation);
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
	String pageTitle = driver.getTitle();
	driver.findElement(By.xpath("//button[.='New Browser Tab']")).click();

	Set a = driver.getWindowHandles();
	if(a.size() == 2) 
	{
		System.out.println("Opened Two Tabs");
	}

	for (String handle1 : driver.getWindowHandles()) {
		 
		
    	driver.switchTo().window(handle1);
    	System.out.println(driver.getTitle());
    	}
	}
}
