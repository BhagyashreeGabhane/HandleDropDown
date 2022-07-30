package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\a.vimanNagar\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/signup");
		d.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']")).sendKeys("Bhagyashri");
		//d.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @id='u_0_d_Nq']")).sendKeys("Gabhane");
		d.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']")).sendKeys("9011109858");
		d.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @id='password_step_input']")).sendKeys("bhagyashri23@");
		WebElement wb=d.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg' and @name='birthday_day']"));
		Select s1=new Select(wb);
		s1.selectByIndex(2);
		
		WebElement wb1=d.findElement(By.xpath("//select[@name='birthday_month' and @class='_9407 _5dba _9hk6 _8esg']"));
		Select s2=new Select(wb1);
		s2.selectByVisibleText("May");
		
		WebElement wb2=d.findElement(By.xpath("//select[@name='birthday_year' and @class='_9407 _5dba _9hk6 _8esg']"));
		Select s3=new Select(wb2);
		s3.selectByValue("1995");
		//s3.deselectByVisibleText("1995");
		
		d.findElement(By.xpath("//label[text()='Male' and @class='_58mt']")).click();
		d.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @aria-label='Surname']")).sendKeys("gabhane");
		//d.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//get elements useing findelements
		List<WebElement> months=d.findElements(By.xpath("//select[@name='birthday_month' and @class='_9407 _5dba _9hk6 _8esg']"));
		for(WebElement ss:months) {
			//System.out.println(ss);
			System.out.println("************************************");
			String nameofMonths=ss.getText();
			System.out.println(nameofMonths);
			
		}
		d.quit();
		
	}

}
