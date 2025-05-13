package seleniumpc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.LoggerFactory;

import com.google.j2objc.annotations.ReflectionSupport.Level;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.api.logs.Logger;

public class Practice {
	//@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	  //  Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);

     //   root.setLevel(Level.ERROR);
 
		WebDriverManager.chromedriver().setup();
		System.setProperty("wdm.logLevel", "ERROR");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://mvnrepository.com/");
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
