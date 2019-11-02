package AddAnItemToACart;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddingItemToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load LandingPage in FireFoxBrowser
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumWebdrivers\\geckodriver.exe");
		FirefoxDriver firefoxBrowser = new FirefoxDriver();
		firefoxBrowser.get("https://www.konga.com/" );
				
		//to maximize the browser
		firefoxBrowser.manage().window().maximize();

		//to check the actual url is displayed
		//get the title of the webpage
		System.out.println(firefoxBrowser.getTitle());

		//to enter name of item in search textbox
		firefoxBrowser.findElement(By.xpath("(//input[contains(@placeholder,'Search for products, brands and categories…')])[2]")).sendKeys("Apple MacBook Pro With Touch Bar - 15\" - Intel Core I7 - 16 GB - 256GB - Space Grey");


				
		//to click the search button
		firefoxBrowser.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[3]/div/div[2]/div/form/button")).click();  

		//sort by low to high
		firefoxBrowser.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[1]/div[1]/div/div[2]/div/ul/li[3]/a")).click();  


		//click add to cart
		firefoxBrowser.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[2]/section/div[2]/div/div/ul/li[2]/div/div/div[2]/form/div[4]/button")).click();  

		//view cart
		firefoxBrowser.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div/div[3]/a/span[1]")).click();  


		//to close the browser
		firefoxBrowser.close(); 
	

	}

}
