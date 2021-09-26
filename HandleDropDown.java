import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement dropCountryEle=driver.findElement(By.id("input-country"));
        Select country=new Select(dropCountryEle);
        //country.selectByVisibleText("American Samoa");
        //country.selectByValue("10");
        country.selectByIndex(15);
    }
}
