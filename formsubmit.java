import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormSubmit {
public static void main(String[] args) {
	String chromeDriverlocation = "C:/ChromeDrivers/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromeDriverlocation);
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.practiceselenium.com/practice-form.html");
	String pageTitle = driver.getTitle();
    driver.findElement(By.name("firstname")).sendKeys("Naresh");
    driver.findElement(By.name("lastname")).sendKeys("Surya");
    driver.findElement(By.id("sex-0")).click();
    driver.findElement(By.id("exp-1")).click();
    driver.findElement(By.id("datepicker")).sendKeys("01-01-2018");
    driver.findElement(By.id("tea2")).click();
    driver.findElement(By.id("tool-1")).click();
    Select work = new Select(driver.findElement(By.id("selenium_commands")));
    work.selectByIndex(2);
    driver.findElement(By.xpath("//button[@id='submit']")).click();
    String url = driver.getCurrentUrl();
    if(url.contains("welcome.html"))
    {
	  System.out.println("Navigated to HomePage");
    }
    driver.quit();
 }
}
