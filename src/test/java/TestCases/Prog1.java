package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Prog1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node0svx16qhoyufk1mwuu38xb7d5791762.node0");

		WebElement button1 = driver.findElement(By.xpath("//button[text()=\"Click Me\"][1]"));
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src=\"default.xhtml\"]"));
		driver.switchTo().frame(frame1);
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(button1).click().build().perform();
	
		
		
		
	}
	
	
	

}


