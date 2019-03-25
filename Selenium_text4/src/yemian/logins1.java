package yemian;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logins1 {

	public static WebDriver driver;
	public static String url;
	@Test
	public void caozuo() throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys("hujianming");	
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		WebElement x=driver.findElement(By.name("usertype"));
		Select y=new Select(x);
		y.selectByIndex(2);
		Thread.sleep(6000);
		WebElement k=driver.findElement(By.className("tm_btn"));
		k.click();
		
		
		
	}
}
