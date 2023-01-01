import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class AutomationPractice {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      System.setProperty ("webdriver.driver.chromedriver","C:\\Users\\Admin\\OneDrive\\chromedriver_win32");
      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      AutomationPractice ob1 = new AutomationPractice();
      ob1.selectAndDeselectCheckBox(driver);
      ob1.countCheckBox(driver);
      
      driver.close();
      
      
	}
	
	public void countCheckBox(WebDriver driver)
    
    {
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
    }
	public void selectAndDeselectCheckBox(WebDriver driver)
	{
		WebElement checkbox1 =driver.findElement(By.cssSelector("#checkBoxOption1"));
	      checkbox1.click();
	      
	      if(checkbox1.isSelected())
	    		  {
	    	        Assert.assertTrue(true);
	    	        
	    		  }
	    
	      else
	    	  {Assert.assertFalse(false);}
	      
	      checkbox1.click();
	      System.out.println("Now not clicked" +checkbox1.isSelected());
	}

}
