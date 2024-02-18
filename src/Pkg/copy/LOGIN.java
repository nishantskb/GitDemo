package Pkg.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN {

	public static void main(String[] args) {
	
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ankit\\Documents\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.className("hidden-sm")).click();
		driver.findElement(By.className("search_btn") ).click();
		

	}

}
