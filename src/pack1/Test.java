package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver(); //create object driver
		//ChromeDriver driver1 = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //open webpage
		
		driver.manage().window().maximize(); //maximize window
		
		String titlepage = driver.getTitle();
		System.out.println("le titre est: "+titlepage);
		if (titlepage.equals("OrangeHRM")) {
			System.out.println("le test est reussi");
		}
		else
			System.out.println("le test a echoue");
		
		
		String urlpage = driver.getCurrentUrl();
		System.out.println("le url est: "+urlpage);
		if (urlpage.equals("https://opensource-demo.orangehrmlive.com/")) {
			System.out.println("le test est reussi");
		}
		else
			System.out.println("le test a echoue");
		
		/*
		String codeSource = driver.getPageSource();
		System.out.println("le code source est le suivant: "+codeSource);
		if(codeSource.contains("OrangeHRM)){
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
			}
		*/

	}

}
