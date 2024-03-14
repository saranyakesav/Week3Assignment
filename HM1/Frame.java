package week3.HM1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		WebElement	firframe=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(firframe);
		Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
					Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		WebElement msgbox=driver.findElement(By.xpath("//p[@id='demo']"));
		String msg=msgbox.getText();
	
		System.out.println("Msg===>"+msg+"\n\n");
		//Thread.sleep(2000);

		if(msg.contains("You pressed OK!"))
		{
			System.out.println("CLICKED OK ");
		}
		else {
			System.out.println("CLICKED Cancel");
		}
		
	

		
	}

}
