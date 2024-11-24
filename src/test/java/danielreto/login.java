package danielreto;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	private  WebDriver driver;
	By registerPageLocator = By.xpath("//img [@src='/web/images/ohrm_logo.png']"); 
    By username = By.name("username");
    By password = By.name("password");
    By Login =  By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(registerPageLocator).isDisplayed();
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		Thread.sleep(2000);
		driver .findElement(Login).click();		}
		
	
	
	@After
	public void teardown() {
		
	}
	
}
