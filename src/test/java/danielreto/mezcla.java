package danielreto;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mezcla {

	private  WebDriver driver;
	  /*  caso de prueba1*/
	By registerPageLocator = By.xpath("//img [@src='/web/images/ohrm_logo.png']"); 
    By username = By.name("username");
    By password = By.name("password");
    By Login =  By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    /*  caso de prueba2*/
   	By Reclutamiento =  By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span");
    By registerPage2 = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img"); 
    By CreaCliente =  By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By firstName = By.name("firstName");
    By middleName =By.name("middleName");
    By lastName =By.name("lastName");
    By prueba = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div");
    By email =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");
    By contacto = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
    By Save = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]");
    		  
    /*  caso de prueba3*/
    
    By Shortlist = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]");
    By SaveShortlist = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
    By  ScheduleInterview  = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]");
    By SaveScheduleInterview = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
  
    
    /*  caso de prueba 4 */
    By InterviewTitle =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    By Interview = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input");
    By Date = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div/input");
    By Time = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div/input");
    
    
    /*  caso de prueba 5 */
    By  MarkInterviewPassed  = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]");
    By  SaveMarkInterviewPassed  = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
    
    
  
  
    
    
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
		Thread.sleep(2000);
		 /*  caso de prueba 2 */
		if (driver.findElement(registerPage2).isDisplayed()) {
			Thread.sleep(2000);
			driver.findElement(Reclutamiento).click();	
			Thread.sleep(2000);
			driver.findElement(CreaCliente).click();
			Thread.sleep(3000);
			driver.findElement(firstName).sendKeys("primernombre");
			driver.findElement(middleName).sendKeys("segundonombre");
			driver.findElement(lastName).sendKeys("apellido");
			Thread.sleep(2000);
			driver.findElement(prueba).click();
			Thread.sleep(2000);
			driver.findElement(email).sendKeys("Admin@admin.com");
			Thread.sleep(2000);
			driver.findElement(contacto).sendKeys("3114520506");
			driver.findElement(Save).click();
			Thread.sleep(4000);
		}
		else 
				System.out.print("Register is not found");
		
	
	 /*  caso de prueba 3 */
	if (driver.findElement(Shortlist).isDisplayed()) {
		Thread.sleep(4000);
		Thread.sleep(2000);
		driver.findElement(Shortlist).click();
		Thread.sleep(4000);
		Thread.sleep(2000);
		driver.findElement(SaveShortlist).click();
		Thread.sleep(4000);
		Thread.sleep(2000);
		driver.findElement(ScheduleInterview).click();
		Thread.sleep(4000);
		
		 /*  caso de prueba 4 */
		Thread.sleep(2000);
		driver.findElement(InterviewTitle).sendKeys("InterviewTitle");
		Thread.sleep(4000);
		driver.findElement(Interview).sendKeys("James  Butler");
		Thread.sleep(4000);
		driver.findElement(Date).sendKeys("2024-11-11");
		driver.findElement(Time).sendKeys("10:00 AM");
		driver.findElement(SaveScheduleInterview).click();
		Thread.sleep(4000);
		
		 /*  caso de prueba 5 */
		Thread.sleep(4000);
		driver.findElement(MarkInterviewPassed).click();
		Thread.sleep(4000);
		driver.findElement(SaveMarkInterviewPassed).click();
		Thread.sleep(4000);
		
		
	}
	else  
		System.out.print("not is not found");
	}
	
	
	@After
	public void teardown() {
		driver.quit(); 
	}
	
}
