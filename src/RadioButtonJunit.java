import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonJunit {
	private static WebDriver driver;
	private static List<WebElement> sex;
	public List<WebElement> exp;
	
	public void expSelection(){
		exp = driver.findElements(By.name("exp"));
		
		for(int i=0;i<exp.size();i++){
			String sValue = exp.get(i).getAttribute("id");
			
			if(sValue.equals("exp-2")){
				exp.get(i).click();
				break;
			}
			
		}
		
	}
	


	
	
	@Before
	public void startUp(){
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}


	@Test
	public void test() throws Exception{
		sex = driver.findElements(By.name("sex"));
		boolean sexSelected=true;
		sexSelected = sex.get(0).isSelected();
		
		if(sexSelected){
			sex.get(1).click();
		
		}else{
			sex.get(0).click();
		}
		
		expSelection();
	}
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	  }
	
}


