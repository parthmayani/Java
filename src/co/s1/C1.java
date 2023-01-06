package co.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\driver\\C\\chromedriver.exe");
		
		
	WebDriver driver=new ChromeDriver();
	//driver.get("https://google.com");
	//driver.findElement(By.className("gb_j")).click();
	//Thread.sleep(20000);
	// driver.findElements(By.className("mobile-tablet-only"));
	System.out.println(driver.manage().window().getSize());
	Thread.sleep(5000);
	Dimension d = new Dimension(50,20);
	driver.manage().window().setSize(d);
	System.out.println(driver.manage().window().getSize());
	
	driver.manage().window().getPosition();
	Thread.sleep(5000);
	Point p = new Point(400,400);
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getPosition());
	}

}
