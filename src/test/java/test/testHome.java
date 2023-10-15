package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Input;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testHome extends Input {

	
/*@BeforeTest
	  public void fTearSet() {
		Input ii=new Input();
		ii.inputload();
		this.driver=driver;
	  
}*/
	
	@Test
  public void f() {
//15Oct
		WebDriver driver1=null;
		Input ii=new Input();
	ii.inputload();
	driver1=ii.driver;
	
		driver1.manage().window().maximize();
	  System.out.println("testHome : "+this.getClass().getSimpleName());
	  driver1.manage().window().maximize();	
	  try {
			
	  System.out.println("Maximized");
	  driver1.findElement(By.id("fname")).sendKeys("Hello1");
	  driver1.findElement(By.id("lname")).sendKeys("Hello1");
		Thread.sleep(2000);

	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
	System.out.println(e.getMessage());}
	driver1.quit();
	}
	
	/*@AfterTest
	  public void fClose() {
		 driver.close();
		 }*/
	
}
