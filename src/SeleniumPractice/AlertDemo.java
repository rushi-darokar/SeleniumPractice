package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Tools\\Chrome exe\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		button.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Rushi Darokar");
		
		Thread.sleep(2000);
		
		alert.accept();
		
		driver.close();
			
		}
}

