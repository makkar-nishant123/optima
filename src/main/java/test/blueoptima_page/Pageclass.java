package test.blueoptima_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class Pageclass 
{
	public WebDriver driver = new ChromeDriver() ;
	WebDriverWait wait = new WebDriverWait(driver , 15); 

	public Pageclass()
	{		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver.exe");
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = ".//*[@name='username']")
	private WebElement user_name;
	@FindBy(xpath = ".//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = ".//*[@type='submit']")
	private WebElement Login;
	@FindBy(css = ".boxItem.icon.developers")
	private WebElement my_dev;
	@FindBy(xpath = ".//*[@data-target='developers']")
	private WebElement data_developers;
	@FindBy(id = "fac_dev_7409")
	private WebElement check_box;
	@FindBy(id = "highcharts-0")
	private WebElement graph;
	
	
	
	public void enter_user()
	{
		wait.until(ExpectedConditions.visibilityOf(user_name));
		user_name.sendKeys("makkar.nishant123@gmail.com");
	}
	
	public void enter_pass()
	{
		password.sendKeys("1BlU@!$#@2");
	}
	
	public void click_Login()
	{
		Login.submit();
	}
	
	public void devclickandvalidate()
	{			wait.until(ExpectedConditions.visibilityOf(my_dev));
		my_dev.click();
		wait.until(ExpectedConditions.visibilityOf(data_developers));

	}
	
	public void select_checkbox_and_graph_verify()
	{
		
		
		wait.until(ExpectedConditions.visibilityOf(graph));
	}
	
}
