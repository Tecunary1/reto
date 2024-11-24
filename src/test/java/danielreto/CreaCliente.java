package danielreto;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreaCliente {

	private  WebDriver driver;
	  /*  caso de prueba1*/
	By registerPageLocator = By.xpath("//img [@src='/web/images/ohrm_logo.png']"); 
    By username = By.name("username");
    By password = By.name("password");
    By Login =  By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    /*  caso de prueba2*/
	By Reclutamiento =  By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span");
    By CreaCliente =  By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By firstName = By.name("firstName");
    By middleName =By.name("middleName");
    By lastName =By.name("lastName");
    By prueba = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]");
   
    By email =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");
    By contacto = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
    By Save = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]");
		  
    /*  caso de prueba3*/
    
	
    
    @Before
	public void setup() {;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		 /*  caso de prueba 1 */
		Thread.sleep(2000);
		driver.findElement(registerPageLocator).isDisplayed();
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		Thread.sleep(2000);
		driver .findElement(Login).click();		
	    /*  caso de prueba2 */
		
		Thread.sleep(2000);
		driver.findElement(Reclutamiento).click();	
		Thread.sleep(2000);
		driver.findElement(CreaCliente).click();
		Thread.sleep(3000);
		driver.findElement(firstName).sendKeys("1 nombre");
		driver.findElement(middleName).sendKeys("2nombre");
		driver.findElement(lastName).sendKeys("apellido");
		Thread.sleep(2000);
		driver.findElement(prueba).click();
		Thread.sleep(2000);
		driver.findElement(email).sendKeys("Admin@admin.com");
		driver.findElement(contacto).sendKeys("3114520506");
		//driver.findElement(Save).click();
		
		 /*  caso de prueba3*/
		
		
		}
	
	
	@After
	public void teardown() {
		//driver.quit(); 
	}
	
}
