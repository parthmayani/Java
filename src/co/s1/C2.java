package co.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\driver\\C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("parthnmayani@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Parth@123");
		driver.findElement(By.name("login")).click();
		//Thread.sleep(10000);
		driver.close();
	}

}
