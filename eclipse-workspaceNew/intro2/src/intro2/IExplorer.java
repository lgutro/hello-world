package intro2;

/* import org.openqa.selenium.By; */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IExplorer {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "c:\\users\\lgutr\\downloads\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		
		driver.get("http://www.profilemotel.com");
		System.out.println(driver.getTitle()); 	
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource()); 
		// driver.quit();
		
		
	}

}
