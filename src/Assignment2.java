import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty ("webdriver.driver.chromedriver","C:\\Users\\Admin\\OneDrive\\chromedriver_win32");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	     driver.get("https://rahulshettyacademy.com/angularpractice/");
	    driver.findElement(By.xpath("//div/input[1]")).sendKeys("Razia");
	    driver.findElement(By.cssSelector("input[name='email']")).sendKeys("naseemrazia@gmail.com");
	    driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
	    driver.findElement(By.id("exampleCheck1")).click();
	    driver.findElement(By.id("exampleFormControlSelect1")).click();
	    Select dropdown = new Select (driver.findElement(By.id("exampleFormControlSelect1")));
	    dropdown.selectByIndex(1);
	    driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.cssSelector("input[type='date']")).sendKeys("02/17/1991");
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	    System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().split("\n")[1]);
	    
	}

}
