package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class uibank {
	public static void main(String[] args) {
		//launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the  appllication url
		driver.get("https://uibank.uipath.com/");
		//to maximize the browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//strong[text()='Get Started']")).click();
		 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Dinesh");
		 WebElement title = driver.findElement(By.xpath("//select[@id='title']"));
		    Select Dropdown=new Select(title);
		    Dropdown.selectByVisibleText("Mr");
		    driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("kumar");   
		    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("C"); 
		    WebElement gender = driver.findElement(By.xpath("//select[@id='sex']"));
		    Select Dropdown1=new Select(gender);
		    Dropdown1.selectByVisibleText("Male");
		    WebElement employmentstatus = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		    Select Dropdown2=new Select(employmentstatus);
		    Dropdown2.selectByVisibleText("Full-time");
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Dinesh");
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dkchellamuthu3731@gmail.com");
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("3731");
		    driver.close();
		    
		    
		    

}
}
