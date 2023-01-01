import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Admin\\OneDrive\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> price = driver.findElements(By.xpath("//table[@class=\"table-display\"]/tbody/tr/td[3]"));
		

		System.out.println(price.get(2));
		*/
		
		/*
		List<Integer> priceValue = new ArrayList<Integer>();
 		price.stream().map(s -> priceValue.add(Integer.parseInt(s.getText())));
 		Thread.sleep(5000);
 		
 	    priceValue.stream().sorted().forEach(s->System.out.println(s));
 	    
 	    */
		
		Stream.of("razia","naseem","shayaan","Izhaan","javed","razia").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
 		
 		//map(Wrapper::new).sorted().forEach(s->System.out.println(s));
 		///collect(Collectors.toList());
 		//sorted().forEach(s->System.out.println(s));
		
		//int rows = driver.findElements(By.xp`ath`("//table[@class=\"`table-display\"]/tbody/tr")).size();
		//System.out.println( " No of rows are :"+ rows + "\ncolumns : " +columns);
		
		
		//driver.close();
		
		
		
	}

}
