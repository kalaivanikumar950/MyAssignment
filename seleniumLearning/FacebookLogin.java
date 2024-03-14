package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	
	public static void main(String[] args) {
		
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get(" https://en-gb.facebook.com/");
		//to maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("kalaivani");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("kalaivani@gmail.com");
		driver.findElement( By.name( "reg_email_confirmation__")).sendKeys("kalaivani@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("kalai2000");
		WebElement daydd = driver.findElement(By.id("day"));
		Select sec = new Select(daydd);
		sec.selectByIndex(13);
		WebElement monthdd = driver.findElement(By.id("month"));
		Select sec1 = new Select(monthdd);
		sec1.selectByIndex(8);
		WebElement yeardd = driver.findElement(By.id("year"));
		Select sec2 = new Select(yeardd);
		sec2.selectByValue("2000");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		driver.findElement( By.name( "websubmit")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();

		
	}

}
