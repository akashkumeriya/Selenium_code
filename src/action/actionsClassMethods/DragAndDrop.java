package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		Actions act=new Actions(driver);				
				
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");				
						
		driver.manage().window().maximize();				
						
		WebElement roam =driver.findElement(By.id("box6"));				
						
		WebElement italy= driver.findElement(By.xpath("//*[@id=\"box106\"]"));				
						
		act.dragAndDrop(roam, italy).perform();				
						
		Thread.sleep(2000);				
		
	}
}
