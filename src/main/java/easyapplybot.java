import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class easyapplybot {
	String userName = "hayman-35@hotmail.com";
	String password = "wafahay123";
	String fileName = "output.csv";
	String position = "";
	String location = "";
	WebDriver driver = new ChromeDriver();
	float maxSearchTime = 10 * 60 * 60;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		easyapplybot bot = new easyapplybot();
		bot.StartLinkedin();
	}
	
	
	public void StartLinkedin() {
		driver.get("https://www.linkedin.com/login?trk=guest_homepage-basic_nav-header-signin");
		WebElement userFieldElement = driver.findElement(By.id("username"));
		WebElement passFieldElement = driver.findElement(By.id("password"));
		WebElement loginBtnElement = driver.findElement(By.cssSelector(".btn__primary--large"));
		userFieldElement.sendKeys(userName);
		userFieldElement.sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		passFieldElement.sendKeys(password);
		loginBtnElement.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public WebElement GetEasyApplyBtn() {
		WebElement button = driver.findElement(By.xpath("//button[contains(@class, \"jobs-apply\")]/span[1]"));
		return button;
	}

}
