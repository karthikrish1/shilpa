package seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	ChromeDriver c= new ChromeDriver();
	c.get("http://www.mycontactform.com");
	
	//alert: popup, messagebox, confirm
	//c.executeScript("alert('Time out')");
	c.executeScript("window.confirm('timeout')"); //ok, cancel
	Alert al = c.switchTo().alert();
	Thread.sleep(3000);
	//al.accept();
	al.dismiss();
}
}
