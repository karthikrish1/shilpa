package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class dele {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("http://www.google.com");
	Set<Cookie> s1 = c.manage().getCookies();
	System.out.println("Number of cookies before deletion : "+ s1.size());
	//cookies: temporary information stored by the browser
	
    c.manage().deleteAllCookies();	
	Set<Cookie> s = c.manage().getCookies();
	System.out.println("Number of cookies after deletion : "+ s.size());
	c.quit();
	
}
}
