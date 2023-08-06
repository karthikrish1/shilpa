package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class scroller {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * horizontal scroller: move along x axis, y value will be 0
		 *           right : + x
		 *           left : -x
		 *           
		 *vertical scroll: move along y axis, x value wil be 0
		 *     down : +y
		 *     up :-y
		 *  * 
		 * */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		
		ob.navigate().to("http://www.seleniumeasy.com");
		
		//page up and down
		/*ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");//down
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//up
		Thread.sleep(3000);*/
		
		ob.executeScript("window.scrollBy(0,300)");//down
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-300)");//up
		Thread.sleep(3000);
		ob.quit();
	}

}
