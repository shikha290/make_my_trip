package caseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class case1 {
	WebDriver Driver;
	@BeforeTest
	public void c0() {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://www.makemytrip.com/");
		Driver.manage().window().maximize();

	}
	@Test
	public void c1() throws InterruptedException {
	Thread.sleep(15000);
	Driver.findElement(By.linkText("Holiday Packages")).click();
	Thread.sleep(3000);
	Driver.findElement(By.xpath("//*[@type='text']")).click();
	Driver.findElement(By.xpath("//*[@data-testid='Bangalore']")).click();
	Thread.sleep(6000);
	Driver.findElement(By.xpath("//*[@for='toCity']")).click();
	Thread.sleep(6000);
	Driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys("singapore");
	Thread.sleep(6000);
	Driver.findElement(By.xpath("//div[text()='Singapore']")).click();
	Thread.sleep(6000);
	Driver.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
//	Driver.findElement(By.id("//*[@id='search_button']")).click();
	Thread.sleep(6000);
//	Driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
//	Thread.sleep(10000);
	Driver.findElement(By.xpath("//*[@id='departure_date']")).click();
	Thread.sleep(6000);
	Driver.findElement(By.xpath("//div[@aria-label='Fri Nov 11 2022']")).click();
	Thread.sleep(8000);
	Driver.findElement(By.xpath("//*[@class='primaryBtn big fill btn btn-top-nav btn-lg']")).click();
	Thread.sleep(6000);
	WebElement slider=Driver.findElement(By.xpath("//*[@class='flexOne makeFlex']/div[3]//div/div//div/div[5]"));
	Thread.sleep(6000);
	Actions ac=new Actions(Driver);
	Thread.sleep(7000);
	ac.dragAndDropBy(Driver.findElement(By.xpath("//*[@aria-valuenow='10']")), -170, 0).build().perform();
	Thread.sleep(6000);
	Driver.findElement(By.linkText("Singapore")).click();
	Thread.sleep(6000);
	
	
//	Driver.findElement(By.xpath("//*[@id='fromCity']")).click();
//	Driver.findElement(By.xpath("//*[text()='Bangalore']")).click();
	
	
//	Driver.findElement(By.id("toCity")).click();
//	Thread.sleep(3000);
//	Driver.findElement(By.xpath("//*[@class='dest-search-input']")).sendKeys("Singapore");
//	Driver.findElement(By.xpath("//div[text()='Singapore']")).click();
//	Thread.sleep(3000);
	
	
	}
	@AfterTest
	public void c3() throws InterruptedException {
//		Thread.sleep(3000);
		Driver.close();
	}
}