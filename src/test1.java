import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		d1.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		String msg = d1.switchTo().alert().getText();
		System.out.println(msg);
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			}
		d1.switchTo().alert().accept();
		String msg1 = d1.findElement(By.id("result")).getText();
		System.out.println(msg1);
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			}
		d1.navigate().refresh();
		d1.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			}
		d1.switchTo().alert().dismiss();
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			}
		String msg2 = d1.findElement(By.id("result")).getText();
		System.out.println(msg2);
		d1.quit();
	}

}
