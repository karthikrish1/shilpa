package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sl {
public static void main(String[] args) {
	
	//horizontal slider: mve along x axis, y value will be 0
	// vertical slider: move along y axis, x value will be 0
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("https://jqueryui.com/slider/");
	c.switchTo().frame(0);
	Actions ac= new Actions(c);
	WebElement ele = c.findElementById("slider");
	ac.dragAndDropBy(ele,50, 0).build().perform();
}
}
