import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExamples {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		//driver.manage().window().maximize();
	

		// flash a particular Webelement

		// Draw broder and Screenshot
		WebElement logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		JavascriptUtil.drawBorder(driver, logo);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\logo.png");
		FileUtils.copyFile(src, trg);
		
		// Getting the title of the page		
		String title = JavascriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		// Generate Alert

		// Refresh the page

		// Scrolling

		// Zoom
		
		driver.close();

	}

}
