package orangehrm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pkt {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the webpage
	        driver.get("https://fast.com/");

	        while (true) {
	            // Refresh the webpage every 20 seconds
	            Thread.sleep(20000); // 20000 milliseconds = 20 seconds
	            driver.navigate().refresh();
	            driver.close();
	            
	        }
	    }

	}


