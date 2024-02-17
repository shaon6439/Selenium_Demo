package webDriver1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSDemo {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.mycontactform.com/samples.php");
		dr.findElement(By.xpath("//input[@value='Third Option']")).click();
		TakesScreenshot shot =(TakesScreenshot) dr;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Selenium_ScreenShots\\shot.jpeg");
		//FileUtils.copyFile(src,dest);

	}

}
