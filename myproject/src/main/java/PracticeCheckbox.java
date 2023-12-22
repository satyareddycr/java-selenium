import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCheckbox {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html#google_vignette");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		System.out.println("yes1");
		Thread.sleep(3000);
		// driver.findElement(By.id("spanishchbx")).click();
		Thread.sleep(3000);
		WebElement ckek = driver.findElement(By.id("frenchchbx"));
		System.out.println("yes2");
		ckek.click();
		Thread.sleep(3000);
		if (ckek.isSelected()) {
			ckek.click();
			Thread.sleep(3000);
			driver.findElement(By.id("registerbtn")).click();
			System.out.println("yes3");
			driver.findElement(By.id("msg")).getText();
			System.out.println("yes4");
			Thread.sleep(3000);
			driver.findElement(By.linkText("Click here to navigate to the home page"));
			System.out.println("yes5");
			Thread.sleep(3000);
		}
	}

}
