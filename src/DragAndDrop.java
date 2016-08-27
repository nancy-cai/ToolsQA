import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public WebDriver driver;

	@Before
	
	public void startUp(){
		driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		String xp1="//h1[text()='Block 1']";
		WebElement source = driver.findElement(By.xpath(xp1));
		String xp2="//h1[text()='Block 3']";
		WebElement target = driver.findElement(By.xpath(xp2));
		Actions actions=new Actions(driver);
		//actions.dragAndDrop(source, target).perform();
		
		/*Action drag = actions.clickAndHold(source)
		.moveToElement(target)
		.release(target)
		.build();
		drag.perform();
		 * Note we use Action instead of Actions here, Action used only for build() method
		 * We use build() when we are performing sequence of operations and no need to use if we are performing single action
		 *https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html
		*/
		actions.clickAndHold(source)
		.moveToElement(target)
		.release(target)
		.build()
		.perform();
	}

}
