package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Tuna@321");
	    driver.findElement(By.name("login")).click();
	    System.out.println(driver.getTitle());
	    
	}
}
