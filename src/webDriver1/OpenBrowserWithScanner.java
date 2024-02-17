package webDriver1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserWithScanner {

	public static void main(String[] args) {
		WebDriver driver;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser type (chrome/firefox/edge):");
       String browserType = scanner.nextLine().toLowerCase();
        
        //String browserType = scanner.nextLine().equalsIgnoreCase(null);

        // Set the path to the WebDriver executable based on the browser type
       // WebDriver driver;
        switch (browserType) {
            case "chrome":
                //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "edge":
                //System.setProperty("webdriver.edge.driver", "path/to/msedgedriver");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Unsupported browser type. Exiting...");
                //scanner.close();
               // return;
        }

        // Get the URL to open from the user
        //System.out.println("Enter the URL to open:");
        //String url = scanner.nextLine();

        // Open the specified website
       // driver.get("https://www.mycontactform.com/samples.php");

        // Perform any other actions or tests...

        // Close the browser
        //driver.quit();

        // Close the scanner
        //scanner.close();
	}

}
