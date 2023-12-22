import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent Window Handle " + parentWindowHandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(3000);
		Set<String> WindowHandles = driver.getWindowHandles();
		for (String WindowHandle : WindowHandles) {
			if (!WindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(WindowHandle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("satya reddy");

				Thread.sleep(3000);
				driver.close();
			}

		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("satya reddy");
		Thread.sleep(3000);
		driver.quit();
	}

}
