package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	//Variables, property, fields
	//Methods - statements

	public static void main(String[] args) {
		
		//This constructor is responsible for launching the chrome browser:
		WebDriver driver = new ChromeDriver();
		
		//.get() method to get to a specific website:
		driver.get("https://www.google.com/");
		
		//Maximize the window:
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		driver.close();
		
		

	}

}
