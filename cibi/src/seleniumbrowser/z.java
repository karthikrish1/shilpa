package seleniumbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class z {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("http://www.google.com");
		c.executeScript("document.body.style.zoom='200%'"); //zoom n
		Thread.sleep(3000);
		c.executeScript("document.body.style.zoom='100%'");//nrml
		Thread.sleep(3000);
		c.executeScript("document.body.style.zoom='20%'");//out
		Thread.sleep(3000);
	}

}
