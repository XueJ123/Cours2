package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver1 = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");//same as line19+20
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		WebElement logbtn = driver.findElement(By.id("btnLogin"));
		logbtn.click();
		WebElement lienwelcome = driver.findElement(By.id("welcome"));
		lienwelcome.click();
		
		Thread.sleep(4000);
		
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
		
	}
}
