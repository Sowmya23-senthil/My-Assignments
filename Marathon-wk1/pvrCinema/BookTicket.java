package pvrCinema;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class BookTicket {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("//span[text()='SEKHAR KAMMULA S KUBERA']")).click();
		driver.findElement(By.xpath("//span[text()='03:00 PM']")).click();

		//driver.findElement(By.xpath("//button[@class()='p-button-label p-c']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'quick-lefts')]//button")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		WebElement seat = driver.findElement(By.xpath("//span[@id='CL.CLUB|J:15']"));
		seat.click();
		System.out.println(seat.getText());

		WebElement total = driver.findElement(By.xpath("//div[@class='grand-prices']"));
		System.out.println(total.getText());
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		WebElement close = driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]"));
		boolean checkclose = close.isDisplayed();
		System.out.println(checkclose);
		close.click();
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
	}
}


