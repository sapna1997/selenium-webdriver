import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class iFrameExample {

	@Test
	void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get("http://the-internet.herokuapp.com/iframe");
		
		//d1.findElement(By.id("mce_0_ifr"));
		
		d1.switchTo().frame("mce_0_ifr");
		d1.findElement(By.tagName("p")).clear();
		try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
		d1.findElement(By.tagName("p")).sendKeys("hii, Welcome to iFrame!");
		//System.out.println(msg);
		try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
		d1.quit();
	}

}
