import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Admin\\OneDrive\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("can");
		Thread.sleep(3000);
		int size = driver.findElements(By.cssSelector("ul[id='ui-id-1'] li")).size();
		
		for(int i=0;i<size;i++)
		{
			String listText= driver.findElements(By.cssSelector("ul[id='ui-id-1'] li")).get(i).getText();
			if(listText.equalsIgnoreCase("Canada"))
					{
				driver.findElements(By.cssSelector("ul[id='ui-id-1'] li")).get(i).click();
				break;
					}
		}
		
		
		System.out.println("Selected text is " + driver.findElement(By.id("autocomplete")).getAttribute("value"));
		driver.close();

	}

}
