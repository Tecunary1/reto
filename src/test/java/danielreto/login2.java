package danielreto;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class login2 {

	private  WebDriver driver;
	By registerPageLocator = By.xpath("//img [@src='/web/images/ohrm_logo.png']"); 
	   By username = By.name("username");
       By password = By.name("password");
    
   
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test
	public void testLogin21() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		
		
		}
		
	
	
	@After
	public void teardown() {
		
	}
	
}
