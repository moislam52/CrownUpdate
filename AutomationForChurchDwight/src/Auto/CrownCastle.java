package Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CrownCastle {

	static WebDriver driver;
	public static void main(String[] args) {
		
		  // Set the path to the ChromeDriver executable (download and install ChromeDriver)
      //  System.setProperty("webdriver.chrome.driver", "/Users/moislam/Downloads/chromedriver_mac64/chromedriver");

        // Initialize the WebDriver
        WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    

        // Step 1: Navigate to the Checkers game website
        driver.get("https://www.gamesforthebrain.com/game/checkers/");
        

        // Step 2: Confirm that the site is up (You can add validation here)
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Checkers Game")) {
            System.out.println("Website is up.");
        } else {
            System.out.println("Website is not up.");
        }

        // Steps 3a-c: Make five legal moves as orange and restart the game after five moves
        for (int i = 0; i < 5; i++) {
            
            WebElement square = driver.findElement(By.name("space02")); 
            square.click();

            WebElement makeMoveButton = driver.findElement(By.name("space13")); 
            makeMoveButton.click();
//            
//            WebDriver driver = new ChromeDriver();
            //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

            
           
            WebElement square1 = driver.findElement(By.name("space22")); 
            square1.click();
            
            WebElement makeMoveButton1 = driver.findElement(By.name("space33")); 
            makeMoveButton1.click();
            
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            
            WebElement square2 = driver.findElement(By.name("space02")); 
            square2.click();
            WebElement makeMoveButton2 = driver.findElement(By.name("space13")); 
            makeMoveButton2.click();
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            
            
            WebElement square3 = driver.findElement(By.name("space62")); 
            square3.click();
            WebElement makeMoveButton3 = driver.findElement(By.name("space73")); 
            makeMoveButton3.click();
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            
            WebElement square4 = driver.findElement(By.name("space51")); 
            square4.click();
            WebElement makeMoveButton4 = driver.findElement(By.name("space62")); 
            makeMoveButton4.click();
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            
        

      }

       
        //driver.quit();
    }

	}

