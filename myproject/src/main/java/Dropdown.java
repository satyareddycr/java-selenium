import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courcseDropdown = new Select(courseElement);
		List<WebElement> courseNameDropdownOptions = courcseDropdown.getOptions();
		for (WebElement option : courseNameDropdownOptions) {
			System.out.println(option.getText());
		}
		courcseDropdown.selectByIndex(1);// Java
		Thread.sleep(3000);
		courcseDropdown.selectByValue("net"); // Dot net
		Thread.sleep(3000);
		courcseDropdown.selectByVisibleText("Javascript"); // Javascript
		Thread.sleep(3000);

		String selectedText = courcseDropdown.getFirstSelectedOption().getText();
		System.out.println("Selected visible text - " + selectedText);

		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		for (WebElement option : ideDropdownOptions) {
			System.out.println(option.getText());
		}
		ideDropdown.selectByIndex(0);// Eclipse
		Thread.sleep(3000);
		ideDropdown.selectByValue("ij"); // IntelliJ IDEA
		Thread.sleep(3000);
		ideDropdown.selectByVisibleText("NetBeans"); // NetBeans
		Thread.sleep(3000);

		ideDropdown.deselectByVisibleText("IntelliJ IDEA");

		List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions) {
			System.out.println("Selected visible text - " + selectedOption.getText());
		}
	}

}
