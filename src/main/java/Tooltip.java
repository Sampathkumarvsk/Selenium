import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//input[@id='age']"));
		System.out.println(element.getAttribute("title"));
		String tabs = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("//a[text()='Tooltips']")).sendKeys(tabs);
		
		//driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		
//		driver.get("https://jqueryui.com/tooltip/");
//		
//		WebElement logo = driver.findElement(By.xpath("//input[@id='age']"));
		System.out.println("Windows Location (x,y) " +element.getLocation());
		System.out.println("Windows Location (x) " +element.getLocation().getX());
		System.out.println("Windows Location (y) " +element.getLocation().getY());
		
		
		
		
		
		
		
	}

}
