package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Adobe 
	{
		@Test(priority=1)
		public void register() 
		{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://account.magento.com/customer/account/create/\r\n"+ "");
			driver.findElement(By.id("firstname")).sendKeys("Rushi");
			driver.findElement(By.id("lastname")).sendKeys("P");
			driver.findElement(By.name("email")).sendKeys("nahikarnayaar1212@gmail.com");
			driver.findElement(By.id("self_defined_company")).sendKeys("YesmSytem");
			driver.findElement(By.name("password")).sendKeys("Asdfghjkl@123");
			driver.findElement(By.name("password_confirmation")).sendKeys("Asdfghjkl@123");
			Select cp = new Select(driver.findElement(By.id("company_type")));
			cp.selectByIndex(5);
			
			Select mr = new Select(driver.findElement(By.id("individual_role")));
			mr.selectByIndex(2);
			
			Select country = new Select(driver.findElement(By.id("country")));
			country.selectByValue("GB");
			driver.switchTo().defaultContent();
			
			
			
			if(!driver.findElement(By.id("agree_terms")).isSelected())
			{
				driver.findElement(By.id("agree_terms")).click();
			
			
			}
			driver.quit();
		}
		
		@Test(priority=2,enabled=false)
		public void login() {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https:www.google.com");
			driver.findElement(By.name("q")).sendKeys("adobe");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[1]/div/div[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div[1]/a/div[1]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"gnt_486\"]/a/span")).click();
			driver.findElement(By.id("EmailPage-EmailField")).sendKeys("yesm@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"EmailForm\"]/section[2]/div[2]/button/span")).click();
			String error = driver.findElement(By.xpath("//*[@id=\"EmailForm\"]/section[1]/label")).getText();
			System.out.println(error);
			driver.quit();
			
		}
		
	}

