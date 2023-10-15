package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.Input;

public class testGit {
  @Test
  public void f() {
	  System.out.println("testHome : "+this.getClass().getSimpleName());  
	  WebDriver driver1=null;
		Input ii=new Input();
	ii.inputload();
	driver1=ii.driver;
	
		driver1.manage().window().maximize();
	  System.out.println("testHome : "+this.getClass().getSimpleName());
	  driver1.manage().window().maximize();	
	  try {
			
	  System.out.println("Maximized");
	  driver1.findElement(By.xpath("//a[@name='Mylink2']")).click();
			  Thread.sleep(2000);

	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
	System.out.println(e.getMessage());}
	driver1.quit();
	}

  }

