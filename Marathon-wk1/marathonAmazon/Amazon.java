package marathonAmazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.xpath("//span[text()='Continue shopping']")).click();
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("Bags for Boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement Searchvalue = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
        String SearchPrint = Searchvalue.getText();
        System.out.println(SearchPrint);
        
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
        driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        String result1= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])[1]")).getText();
        System.out.println(result1);
        
        String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
        
        
		
		
		// TODO Auto-generated method stub

	}

}
