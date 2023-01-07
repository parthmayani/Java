package co.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\driver\\C\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://in.tradingview.com/chart");
		//WebDriver c=new ChromeDriver();
		driver.manage().window().maximize();
	
		//System.out.println(driver.getTitle());
	
	// naviget to url
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_98xjxt98l7_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=11475472338956621987&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007759&hvtargid=kwd-299123108802&hydadcr=5841_2362028&gclid=CjwKCAiAzKqdBhAnEiwAePEjkq2Pwqhhy2vkQQ88-BHHEjz6niapPqs-Oa8qs2qOr3xeCih3RDjmYRoCdJUQAvD_BwE");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirts");
		driver.findElement(By.className("<input id=\"nav-search-submit-button\" type=\"submit\" class=\"nav-input nav-progressive-attribute\" value=\"Go\" tabindex=\"0\">")).click();
		
	}

}
