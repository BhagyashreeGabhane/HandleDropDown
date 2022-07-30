package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapZoom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\a.vimanNagar\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://zoom.us/signup");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
          //month
		d.findElement(By.xpath("//*[@class='zm-select-span__inner is-placeholder']")).click();
		
		d.findElement(By.xpath("//*[@id='select-item-select-0-9' and @aria-label='Oct' ]")).click();
		Thread.sleep(2000);
		//date
		d.findElement(By.xpath("//*[@id='select-1' and @class='zm-select-span__inner is-placeholder']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='select-item-select-1-5']")).click();
		Thread.sleep(2000);
		//year
		//d.findElement(By.xpath("//*[@id='select-2' and @aria-label='Year,year' ]")).click();
		//Thread.sleep(2000);
		//d.findElement(By.xpath("//*[@id='select-item-select-2-4' and @aria-label='1906' ]")).click();
		
		
	}

}
