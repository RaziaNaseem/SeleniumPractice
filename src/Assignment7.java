import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Admin\\OneDrive\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,600)");
		int columns = driver.findElements(By.xpath("//table[@class=\"table-display\"]/tbody/tr/th")).size();
		int rows = driver.findElements(By.xpath("//table[@class=\"table-display\"]/tbody/tr")).size();
		System.out.println( " No of rows are :"+ rows + "\ncolumns : " +columns);
		
		System.out.println("Printing 2nd row value: "+driver.findElements(By.xpath("//table[@class=\"table-display\"]/tbody/tr")).get(2).getText());
			
	}

}
