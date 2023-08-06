package seleniumget;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.google.com");
		
		//title
		System.out.println("Title is "+ c.getTitle());
		
		//url
		System.out.println("URL is "+ c.getCurrentUrl());
		
		//size: height and width
		//Dimension class
		Dimension d = c.manage().window().getSize();
		System.out.println("Width is "+ d.getWidth());
		System.out.println("Height is "+ d.getHeight());
		
		//position: x and y value of the window
		// Point 
		Point p = c.manage().window().getPosition();
		System.out.println("x value is "+ p.getX());
		System.out.println("y value is "+ p.getY());
		
		//capabilities
		Capabilities b = c.getCapabilities();
		System.out.println("Name is "+ b.getBrowserName());
		System.out.println("version is "+ b.getVersion());
		System.out.println("Os name is "+ b.getPlatform());
		
		
		
		c.quit();
	}

}
