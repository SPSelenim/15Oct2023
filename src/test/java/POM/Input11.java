package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input11 {

	public WebDriver driver = null;
	public 	String myApplication = "file:///D:/Satish/05DemoApps/demo.html";

	public void inputload() {
		try {

			System.setProperty("webdriver.chrome.driver", "D:\\Satish\\05DemoApps\\ChromeDriver\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get(myApplication);
	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
