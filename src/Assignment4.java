import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			
			System.setProperty ("webdriver.driver.chromedriver","C:\\Users\\Admin\\OneDrive\\chromedriver_win32");
	      WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.findElement(By.cssSelector("a[href='/windows']")).click();
	    driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
	    Set<String> windows = driver.getWindowHandles();
		   Iterator<String> it = windows.iterator();
		   
		  
		   String parent = it.next();
		   String child = it.next();
		  
		   driver.switchTo().window(child);
		   System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		   driver.switchTo().window(parent);
		   System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		   
		   driver.quit();
		   
		   
	    
		   
	    
	}
	

}
