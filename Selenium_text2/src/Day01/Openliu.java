package Day01;



import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;//…Ë÷√‰Ø¿¿∆˜¥Û–°
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openliu {
	@Test
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		String url="https://baidu.com";
		driver.get(url);
		
		
	}
	

}
