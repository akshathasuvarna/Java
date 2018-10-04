package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import generic.Auto_constants;
import generic.Excel;

public class Add implements Auto_constants{
	static {
		System.setProperty(key, value);
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String us=Excel.abc(excelpath, "Sheet1", 0, 0);
		
		String pwd=Excel.abc(excelpath, "Sheet1", 1, 0);
		String a=Excel.abc(excelpath, "Sheet1", 2, 0);
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-user']")).click();
		driver.findElement(By.xpath("(//a[@class='desktop-linkButton'])[2]")).click();
		driver.findElement(By.name("email")).sendKeys(us);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
	Thread.sleep(5000);
	 driver.findElement(By.linkText("Kids")).click();;
	//Actions d=new Actions(driver);
	//Thread.sleep(5000);
	//d.moveToElement(ele).perform();
	driver.findElement(By.linkText("Dresses")).click();
	driver.close();


	}

}
