package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tamilmatrimony {
	public static void main(String[] args) {
		//launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the  appllication url
		driver.get("https://tamilmatrimony.in/");
		//to maximize the browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement findElement = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
	    Select Dropdown=new Select(findElement);
	    Dropdown.selectByVisibleText("Myself");
	    driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Dinesh");
	    driver.findElement(By.xpath("//input[@id='gendermale']")).click();
	    WebElement date = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select Dropdowm0=new Select(date);
		Dropdowm0.selectByVisibleText("15");
		WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select Dropdowm1=new Select(month);
		Dropdowm1.selectByVisibleText("Mar");
		WebElement year = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select Dropdowm2=new Select(year);
		Dropdowm2.selectByVisibleText("2002");
		WebElement Religion = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select Dropdowm3=new Select(Religion);
		Dropdowm3.selectByVisibleText("Hindu");
		WebElement mothertongue = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select Dropdowm4=new Select(mothertongue);
		Dropdowm4.selectByVisibleText("Tamil");
		WebElement caste = driver.findElement(By.xpath("//select[@id='CASTE_NORMAL']"));
		Select Dropdowm5=new Select(caste);
		Dropdowm5.selectByVisibleText("Kongu Vellala Gounder");
		WebElement country = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select Dropdowm6=new Select(country);
		Dropdowm6.selectByVisibleText("India");
		WebElement countrycode = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
		Select Dropdowm7=new Select(countrycode);
		Dropdowm7.selectByVisibleText("+91");
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9047224259");
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("dkchellamuthu3731@gmail.com");
		driver.close();


}
}
