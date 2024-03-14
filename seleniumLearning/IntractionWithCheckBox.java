package seleniumLearning;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class IntractionWithCheckBox {
		
		
		public static void main(String[] args) {
			//Launch the Chrome browser
			ChromeDriver driver = new ChromeDriver();
			// Load the url
			driver.get("http://leaftaps.com/opentaps/control/main");
			//to maximize the window
			driver.manage().window().maximize();
			//locate the username field and type the username
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
			//enter the password
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			//Click Login button
			driver.findElement(By.className("decorativeSubmit")).click();
			//to verify the title 
			System.out.println(driver.getTitle());
			//click on crmsfa link
			driver.findElement(By.partialLinkText("CRM")).click();
			//click on leads link
			driver.findElement(By.linkText("Accounts")).click();
			//click on createAccount
			driver.findElement(By.linkText("Create Account")).click();
			//enter AccountName
			driver.findElement(By.id("accountName")).sendKeys("Kalaivani");
			//enter descripition
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			
			//locate the industry and select ComputerSoftware option by using index 
			WebElement sourceDD = driver.findElement(By.name("industryEnumId"));
			Select sec = new Select(sourceDD);
			sec.selectByIndex(3);
			
			//select S-Corporation for Ownership by using Select by visibleText
			WebElement mCDD = driver.findElement(By.id("ownershipEnumId"));
			Select sec1 = new Select(mCDD);
			sec1.selectByVisibleText("S-Corporation");
			
			//select by value for source dd
			WebElement inDD = driver.findElement(By.id("dataSourceId"));
			Select sec2 = new Select(inDD);
			sec2.selectByValue("LEAD_EMPLOYEE");
	
			WebElement mcDD = driver.findElement(By.id("marketingCampaignId"));
			Select sec3 = new Select(inDD);
			sec3.selectByValue("eCommerce Site Internal Campaign");
			
			//click Create Account 
			driver.findElement(By.className("smallSubmit")).click();
			//print the title
			System.out.println(driver.getTitle());
			
			//close the browser
			driver.close();
			
			
			
		}

	}


