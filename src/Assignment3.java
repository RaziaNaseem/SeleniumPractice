import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class Assignment3 {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty ("webdriver.driver.chromedriver","C:\\Users\\Admin\\OneDrive\\chromedriver_win32");
	      WebDriver driver = new ChromeDriver();
	    
	      
	     driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	     driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	     driver.findElement(By.id("password")).sendKeys("learning");
	     driver.findElement(By.cssSelector("input[value='user']")).click();
	     
	     WebDriverWait waitVar = new WebDriverWait(driver,Duration.ofSeconds(12));
	     waitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

	      driver.findElement(By.id("okayBtn")).click();

	     driver.findElement(By.cssSelector("select[class='form-control']")).click();
	     Select dropdown = new Select (driver.findElement(By.cssSelector("select[class='form-control']")));
		 dropdown.selectByValue("consult");
		 
		 driver.findElement(By.id("signInBtn")).click();
		 waitVar.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
		 
		 List<WebElement> listOfproducts = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		 
		 for(int i=0;i<listOfproducts.size();i++)
		 {
			 listOfproducts.get(i).click();
			
		 }
	     driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();

		}
		}
