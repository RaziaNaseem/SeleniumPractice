import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Admin\\OneDrive\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		String optionValue = driver.findElement(By.cssSelector("#checkBoxOption1")).getAttribute("value");

		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByValue(optionValue);

		driver.findElement(By.id("name")).sendKeys(optionValue);
		driver.findElement(By.id("alertbtn")).click();
		String alertBoxText = driver.switchTo().alert().getText();

		String text = alertBoxText.split(" ")[1].split(",")[0];

		if (text.contentEquals(optionValue))
			System.out.println(text + " is present in alertbox");
		else
			System.out.println(text + " is not present in alertbox");
		driver.close();

	}

}
