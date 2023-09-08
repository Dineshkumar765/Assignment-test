package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		//launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the  appllication url
		driver.get("https://www.facebook.com/");
		//to maximize the browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Diensh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9047224259");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("3731");
		WebElement findElement = driver.findElement(By.xpath("//select[@id='day']"));
		Select Dropdowm=new Select(findElement);
		Dropdowm.selectByVisibleText("15");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select Dropdowm1=new Select(month);
		Dropdowm1.selectByVisibleText("Mar");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select Dropdowm2=new Select(year);
		Dropdowm2.selectByVisibleText("2002");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.close();
		
		
	}

}



