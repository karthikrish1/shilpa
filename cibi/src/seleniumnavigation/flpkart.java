package seleniumnavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class flpkart {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();

		ob.get("https://www.flipkart.com/");

		ob.manage().window().maximize();

		Thread.sleep(3000);

		ob.findElementByXPath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/div/div/input").sendKeys("iphone12");

		Thread.sleep(3000);

		ob.findElementByCssSelector("#container > div > div.q8WwEU > div > div > div > div > div.css-1dbjc4n.r-13awgt0 > div > div.css-1dbjc4n.r-13awgt0.r-1iqfa7g.r-60vfwk > div > div._2NhoPJ > header > div._3ZqtNW > div._3NorZ0 > form > div > button > svg").click();

	    //ob.findElementByLinkText("APPLE iPhone 12 (White, 64 GB)").click();

	    ob.findElementByCssSelector("div._4rR01T").click();

	    Thread.sleep(3000);

		String Parent = ob.getWindowHandle();

		Set<String> b = ob.getWindowHandles();

		Iterator<String> c = b.iterator();

		while(c.hasNext()) {

			String Child = c.next();

			if(!Parent.equals(Child))

			{

				ob.switchTo().window(Child);

				//ob.findElementByCssSelector("#container > div > div._2c7YLP.UtUXW0._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1YokD2._3Mn1Gg.col-8-12 > div:nth-child(2) > div:nth-child(2) > div > span > label > div").click();

			

				Thread.sleep(5000);
				System.out.println(ob.getTitle());
                ob.close();
				

			  }}

			ob.switchTo().window(Parent);

			 Thread.sleep(3000);

			System.out.println(ob.getTitle());

			

			

		ob.quit();

	}


	}


