package orangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task1 {
	
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sulaiman\\eclipse-workspace\\geckodriver.exe");
	
	}
    @Test
	@SuppressWarnings("deprecation")
	public void login() throws InterruptedException, AWTException {
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
		
	    // Admin
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		WebElement add = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		add.click();
		// User Role
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]")).click();
		//Employee Name
        driver.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys("Lisa Andrews");
        //Status
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]")).click();
        // UserName
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Admin");
		// Password
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("admin123");
		// Confirm Password
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("admin123");
		Thread.sleep(1000);
		WebElement save = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
		save.click();
	    //LogOut
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	    String expectedtitle = "OrangeHRM";
		String actualtitle = driver.getTitle();
		
		// Check Point
	    if (expectedtitle.equals(actualtitle)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login Failed");

		}  
	    
	    //My Info
	    driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewMyDetails']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("firstName")).sendKeys("Tony");
	    driver.findElement(By.name("middleName")).sendKeys("Hawerd");
	    driver.findElement(By.name("lastName")).sendKeys("Stark");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("1");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("BM967N345");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input")).sendKeys("01546");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input")).sendKeys("76574935825");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[1]/div[1]")).click();
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div[2]")).click();
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]")).click();
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/span")).click();
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label")).click();
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")).click();
	    
	    //upload File
	    WebElement uploadfile=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));
	    uploadfile.click();
	    String file = "D:\\Sulaiman folder\\Resume.docx";
        StringSelection selection = new StringSelection(file);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
  	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	    //Save
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
	    System.out.println("Successfully Saved");
	    driver.quit();
	}
	
	
	
	

}
