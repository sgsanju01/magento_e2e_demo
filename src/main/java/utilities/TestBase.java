package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	
	public static WebDriver driver;
	private static final Logger logger = 
			LogManager.getLogger(TestBase.class);
	
	public static Properties prop;
	static {
		try {
			prop = loadProperties();
		} catch (IOException e) {
			logger.error("Error loading config.properties", e);
            e.printStackTrace();
		}
	}
	
	private static Properties loadProperties() throws IOException {
		prop = new Properties();
		String filepath = "src/test/resources/config.properties";
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		return prop;
	}
	
	public static String getProperties(String key) {
		return prop.getProperty(key);
	}
	
	
	
	//choose browser to perform driver action
	public static void setup(String browser) {

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			throw new IllegalArgumentException("Invalid browser name: " + browser);

		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.info("Driver setup completed for browser");
		
	}
	
	//to quit browser 
	public static void teardown() {
		if (driver != null) {
			driver.quit();
			logger.info("Driver teardown completed");

		}
	}
    
}
