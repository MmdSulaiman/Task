package orangeHRM;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Task2 {
	
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sulaiman\\eclipse-workspace\\geckodriver.exe");
	
	}

		 @Test
			@SuppressWarnings("deprecation")
			public void main() throws InterruptedException, AWTException {
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				//Login with given Credentials
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
			    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
			    String expected_title = "OrangeHRM";
				String actual_title = driver.getTitle();
				System.out.println(actual_title);
				
				// Check Point
			    if (expected_title.equals(actual_title)) {
					System.out.println("Login Successfull");
				} else {
					System.out.println("Login Failed");

				}  
		
               driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
               WebElement  fetch =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
	           String ft = fetch.getText();
		       System.out.println(ft);
		       
		       //validate for not available Employee ID
		       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("0262"); 
		       WebElement search = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		       search.click();
               WebElement gettext = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));		    
               String actual_txt = gettext.getText();
               String expected_text = "(1) Record Found";
               if (expected_text.equals(actual_txt)) {
				   System.out.println("There is one Record Found");	   
			} else {
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
				driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Tony");
				driver.findElement(By.xpath("//*[@name='middleName']")).sendKeys("Hawerd");
				driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Stark");
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
				
				//update Job 
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[6]/a")).click();
				//Joined Date
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2022-05-15");
				//Job Title
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).click();
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[18]/span")).click();
                //Job Category				
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/div/div")).click();
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[7]")).click();
				// Sub Unit
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div/div[1]"));
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div[2]/div[5]/span")).click();
				//Location
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]")).click();
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div[4]/span")).click();
				//Employment Status
			    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[7]/div/div[2]/div/div/div[1]")).click();
			    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[7]/div/div[2]/div/div[2]/div[4]/span")).click();
			    //Save
			    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button")).click();
                
			}
               driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
               driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("0261");
               driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]/i")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]")).click();
               
               //Validation
               WebElement get_text = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));		    
               String actualtxt = get_text.getText();
               String expectedtext = "No Records Found";
               if (expectedtext.equals(actualtxt)) {
				   System.out.println("The Employee ID is deleted successfully");	   
			} 
              
		 
		 }

}
