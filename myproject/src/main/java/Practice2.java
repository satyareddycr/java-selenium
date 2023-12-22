import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws Exception {
		// WebDriverManager.ChromeDriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement usenametxt = (driver.findElement(By.id("email")));
		if (usenametxt.isDisplayed()) {
			if (usenametxt.isEnabled()) {
				usenametxt.sendKeys("satya");
				String textis = usenametxt.getAttribute("value");
				System.out.println("textis");
				Thread.sleep(3000);
				usenametxt.clear();

			} else {
				System.out.println("not disble");

			}
		} else {
			System.out.println("not enable");

		}

	}

}
