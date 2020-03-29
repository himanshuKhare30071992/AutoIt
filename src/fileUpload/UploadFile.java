package fileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile 
{
	
	public static void main(String[] args) throws Exception 
	{
		
		String projectLocation;
		projectLocation = System.getProperty("user.dir");
		System.out.println("My Current Project location ---->>> "+projectLocation);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://workupload.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		Actions act = new Actions(driver);

		WebElement uploadButton = driver.findElement(By.xpath("//div[@class='fileupload-buttonbar']"));
		act.moveToElement(uploadButton).click().perform();
		Runtime.getRuntime().exec(projectLocation+"\\AutoIt_exe\\UploadFile.exe");
		
		
	}

}
