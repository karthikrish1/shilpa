package seleniumnavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("http://www.google.com");//1
	Thread.sleep(3000);
	c.findElementByLinkText("Images").click();//2
	c.navigate().back();//
	Thread.sleep(3000);
	c.navigate().forward();
	
}
}
