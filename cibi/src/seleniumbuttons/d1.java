package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class d1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	
		ChromeDriver ob=new ChromeDriver();
		ob.navigate().to("https://www.twinbirds.co.in");
		
		ob.findElementByLinkText("KIDS").click();
	   
	}
}
