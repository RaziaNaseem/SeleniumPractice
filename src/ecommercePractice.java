import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommercePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Admin\\OneDrive\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();

		String[] listOfProducts = { "Tomato", "Water Melon", "Mango", "Pista" };
		int flag = 0;
		String keyword = " ";
		//Thread.sleep(3000);
		List<WebElement> webList = driver.findElements(By.cssSelector("[class=\"product-name\"]"));
		
		for (int i = 0; i < webList.size(); i++) 
		{
			keyword = webList.get(i).getText();
			for (int j = 0; j < listOfProducts.length; j++)
			{						
			if (keyword.contains(listOfProducts[j]))
			{
				
				driver.findElements(By.cssSelector("[class=\"product-action\"] button")).get(i).click();
				flag++;
			}
			}

			if (flag == listOfProducts.length) 
			{
				System.out.println("Hurray items added");
				break;
			}
		
		}
		
		}
	
}
