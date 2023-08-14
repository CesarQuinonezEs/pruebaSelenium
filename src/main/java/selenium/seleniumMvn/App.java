package selenium.seleniumMvn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class App 
{
    public static void main( String[] args )
    {
    	ChromeDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("ebay");
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/a/h3")).click();
			WebElement element  = (new WebDriverWait(driver, Duration.ofSeconds(30))).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gh-ac\"]")));
			element.click();
			element.sendKeys("watch");
			element.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"item59a4e2b39e\"]/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"binBtn_btn_1\"]")).click();
			//driver.findElement(By.xpath("//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[1]/div")).click();
			/*driver.findElement(By.xpath("//*[@id=\"SearchWidgetAndCarousel\"]/div/div[1]/mbs-search-widget/div/div[2]/div[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"fnameOrigin\"]")).sendKeys("tijuana");
			driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/shared-destinations-dialog/div/div[2]/div/ul/li[1]/div[1]")).sendKeys(Keys.ENTER);
			*/
			driver.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			driver.close();
		}
    }
}
