package webDriver1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser_HW {
	public static void main(String[] args) {
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name: ");
		String browser = sc.next();
		//String browser = sc.nextLine().equalsIgnoreCase(null));
		switch(browser) {
		case "chrome": 
		driver = new ChromeDriver();
		break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Wrong browser!");
		}		
	}
}
