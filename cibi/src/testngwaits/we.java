package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class we {
	/*testng waits/webdriver synchronisation
	 * 
	 * conditional wait            : explicit wait 
	 * unconditional wait          : implicit wait
	 * 
	 * 
	 * implicit wait: once it is declared all the code which is present after it will take the time limit
	 * 
	 * code is correctm if it executes within time limit, it will not wait for completion of time limit
	 * code is wrong, it will wait for completion of time limit, then it will throw up error 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.google.com");
		c.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(c.getTitle());//5
		System.out.println(c.getCurrentUrl());//5
		WebElement ele = c.findElementByLinkText("Imageklkls");//5
		ele.click();//5
		c.quit();//5
	}
}
