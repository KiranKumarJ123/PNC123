package org.example.PNC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

	private WebDriver driver;

	@Test(description="This test case will test the login feature")

	public void Login() {
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("invalidName");;
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("invalidPassword");
		driver.findElement(By.name("login")).click();
		driver.navigate().back();
//##########################################################		
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys("Apurv");
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys("Gupta");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("0123456789");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("apurv.abc.com");
		driver.findElement(By.name("address1")).clear();
		driver.findElement(By.name("address1")).sendKeys("Aaaaaaaaaaa");
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("Aaa");
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("ssss");
		driver.findElement(By.name("postalCode")).clear();
		driver.findElement(By.name("postalCode")).sendKeys("012345");
		
		driver.findElement(By.name("register")).click();
		
	}
	
	@DataProvider (name= "usernameand password")
	public String [][] credentials(){
		return new String[][] {
			new String[] {"inavalidUN", "invalidPW"},
			new String[] {"username","password"}
		};
		}
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Selenium IE Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
