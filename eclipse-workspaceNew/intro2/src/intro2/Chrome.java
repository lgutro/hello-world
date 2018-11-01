package intro2;

import java.util.HashMap;
import java.util.Map;

/* import org.openqa.selenium.By; */
/* import org.openqa.selenium.WebDriver; */
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "c:\\users\\lgutr\\downloads\\chromedriver.exe");
		/* WebDriver driver=new ChromeDriver(); */

		ChromeOptions options = new ChromeOptions();
		// disable ephemeral flash permissions flag
		options.addArguments("--disable-features=EnableEphemeralFlashPermission");
		Map<String, Object> prefs = new HashMap<>();
		// Enable flash for all sites for Chrome 69
		prefs.put("profile.content_settings.exceptions.plugins.*,*.setting", 1);

		options.setExperimentalOption("prefs", prefs);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.profilemotel.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
/* 		driver.findElement(By.xpath(("//*[@class='dwuser_xfs_v4_holder']/a"))).click(); */
		/* driver.findElement(By.linkText("You need to upgrade your Flash Player and enable Javascript to view this content »")).click(); */
		

		/* driver.findElement(By.xpath("//embed[@id='creative_menu_Menu1_swf']")); */
		
/*	System.out.println(driver.getPageSource()); 
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit(); */
	
	}

}



