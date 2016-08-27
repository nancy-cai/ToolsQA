

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {
	
	private static WebDriver driver;
	private static List<WebElement> sex;
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		sex = driver.findElements(By.name("sex"));
		
		for(int i=0; i<sex.size(); i++){
			String sValue = sex.get(i).getAttribute("value");
			
			if(sValue.equals("Female")){
				sex.get(i).click();
				break;
			}
			
		//String option = "2";	
//WebElement Continent = driver.findElement(By.cssSelector("#continents>option:nth-child("+option+")"));
	    Select continent=new Select(driver.findElement(By.name("continents")));
	    List<WebElement> conOption= continent.getOptions();
	    System.out.println(conOption);
	
	    conOption.get(i).click();
	   
		}

	}

}
