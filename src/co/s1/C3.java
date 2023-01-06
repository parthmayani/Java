package co.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3 {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\driver\\C\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("parthnmayani@gmail.com");
	driver.findElement(By.name("password")).sendKeys("parthnmayani4485");
	Thread.sleep(3000);
	driver.findElement(By.id("_acan _aiit _acap _aijb _acas _aj1-")).click();
	
}

}
