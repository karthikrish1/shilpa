package seleniumbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("http://www.google.com");
	//create an object for point class
	//pass desired x and y value in it
	// apply it on the window
	
	Point pt= new Point(300,200);
	c.manage().window().setPosition(pt);
	
	
}
}
