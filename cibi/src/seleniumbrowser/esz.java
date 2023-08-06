package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class esz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.google.com");
		
		// create an object for dimension
		// pass desired height and width in it
		// apply it on the window
		
		Dimension d= new Dimension(300,500);
		c.manage().window().setSize(d);
	}
}
