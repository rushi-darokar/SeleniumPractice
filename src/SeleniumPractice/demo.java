package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Tools\\Chrome exe\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		WebElement fName = driver.findElement(By.xpath("//input[@id='firstName']"));
		fName.sendKeys("Rushi");
		
		WebElement lName =  driver.findElement(By.xpath("//input[@id='lastName']"));
		lName.sendKeys("Darokar");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("rushi@gmail.com");
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
		
		WebElement Gender = driver.findElement(By.xpath("//label[text()='Male']"));
		Gender.click();
		
		WebElement MobNo = driver.findElement(By.xpath("//input[@id='userNumber']"));
		MobNo.sendKeys("9096095293");
		
		WebElement DOB = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		DOB.sendKeys(Keys.CONTROL + "a");   
		DOB.sendKeys("10 May 1990");      
		DOB.sendKeys(Keys.ENTER);   
		
		WebElement Subject =driver.findElement(By.id("subjectsInput"));
		Subject.sendKeys("math");
		Subject.sendKeys(Keys.ENTER);
		
		WebElement Hobby = driver.findElement(By.xpath("//label[text()='Sports']"));
		Hobby.click();
		
		WebElement upload = driver.findElement(By.id("uploadPicture"));
		upload.sendKeys("C:\\Users\\Admin\\Desktop\\Java Code SS\\Selenium\\Selenium Features.PNG");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("PUNE");
		
		WebElement state = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
	}

}
