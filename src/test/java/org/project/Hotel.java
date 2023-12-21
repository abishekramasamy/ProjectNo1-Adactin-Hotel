package org.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hotel {
	
	WebDriver driver;
	@BeforeClass
		private void tc01() {
		
	    driver = new ChromeDriver();
		driver.get(" https://adactinhotelapp.com/");
		
		}
	@Test
		private void tc02() {

		driver.findElement(By.id("username")).sendKeys("Abishek2002");
		
		driver.findElement(By.id("password")).sendKeys("5U957A",Keys.ENTER);
		
		WebElement country = driver.findElement(By.name("location"));
		
		Select select1 =new Select(country);
		
		select1.selectByValue("London");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		
		Select select2=new Select(hotels);
		
		select2.selectByIndex(2);
		
		WebElement roomtype = driver.findElement(By.name("room_type"));
		
		Select select3=new Select(roomtype);
		
		select3.selectByValue("Standard");
		
		WebElement roomno = driver.findElement(By.name("room_nos"));
		
		Select select4=new Select(roomtype);
		
		select4.deselectByVisibleText("1 - One");
		
	    WebElement checkin = driver.findElement(By.name("datepick_in"));
	    
	    WebElement checkout = driver.findElement(By.id("datepick_out"));
	    
	    WebElement adultsperroom = driver.findElement(By.id("adult_room"));
	    
	    Select select5=new Select(roomtype);
	    
	    select5.selectByVisibleText("1 - One");
	    
        WebElement childrenperroom = driver.findElement(By.id("child_room"));
	    
	    Select select6=new Select(roomtype);
	    
	    select6.selectByVisibleText("None");
	    
	    driver.findElement(By.id("radiobutton_0")).click();
	    
	    driver.findElement(By.id("continue")).click();
	    
	    driver.findElement(By.name("first_name")).sendKeys("Abishek ");
	    
	    driver.findElement(By.id("last_name")).sendKeys("Ramasamy");
	    
	    driver.findElement(By.name("address")).sendKeys("Thirumalaipatty(P.O),Sendhamengalam(T.K), Namakkal -637404");
	    
	    driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
	    
	    WebElement cctype = driver.findElement(By.name("cc_type"));
	    
        Select select7=new Select(cctype);
	    
	    select6.selectByVisibleText("American Express");
	    
	    WebElement ccexpmonth = driver.findElement(By.name("cc_exp_month"));
	    
	    Select select8=new Select(cctype);
	    
	    select8.deselectByValue("3");
	    
        WebElement ccexpyear = driver.findElement(By.name("cc_exp_month"));
	    
	    Select select9=new Select(ccexpyear);
	    
	    select8.deselectByValue("2027");
	    
	    driver.findElement(By.name("cc_cvv")).sendKeys("1234");
	    
	    driver.findElement(By.id("book_now")).click();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    WebElement orderno = driver.findElement(By.id("order_no"));
	    
	    String text = orderno.getText();
	    
	    System.out.println(text);

		}
	@AfterClass
		private void tc03() {
			driver.quit();

	}
}

			