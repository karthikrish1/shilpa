package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) throws InterruptedException {
		
		//right click=> properties=> java buildpat=> libraris=> classpath=> add external
		// select selenium jar=> apply and clse
		
		//configure the chromedriver
		//creating an object for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.google.com");
		
		//c.manage().window().maximize();
		
		//c.manage().window().fullscreen();
		
		for(int i=0;i<4;i++)
		{
		c.navigate().refresh();
		}
		//hold
		Thread.sleep(3000);
		
		c.quit();
	}
}
