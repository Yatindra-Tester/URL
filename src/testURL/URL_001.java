package testURL;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.CSVUtils;
import utility.Constant;

public class URL_001 {
	
	public static String URL1 = Constant.URL1;
	public static String URL2 = Constant.URL2;
	public static String URL3 = Constant.URL3;
	public static String URL4 = Constant.URL4;
	public static String URL5 = Constant.URL5;
	public static String URL6 = Constant.URL6;
	public static String URL7 = Constant.URL7;
	public static String URL8 = Constant.URL8;
	public static String URL9 = Constant.URL9;
	public static String URL10 = Constant.URL10;
	public static String URL11 = Constant.URL11;
	public static String URL12 = Constant.URL12;
	
	public static String ChromeDriverServer = Constant.ChromeDriverServer;
	public static String filelocation = Constant.Path_TestData;
	
	public static WebDriver driver;

    public static void main(String[] args) throws Exception {
    	System.setProperty("webdriver.chrome.driver", ChromeDriverServer);
        driver = new ChromeDriver();       
        driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
		 WebDriverWait wait = new WebDriverWait(driver, 15);
			FileWriter writer = new FileWriter(filelocation);
	
// For the 1st URL		
			try{
		  driver.get(URL1);
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		  WebElement Email = driver.findElement(By.name("email"));
		  WebElement Password = driver.findElement(By.name("password"));
		  WebElement Login_btn = driver.findElement(By.xpath("//button[@type='submit']")); 
		  Email.sendKeys("yatindra@moogilu.com");
		  Password.sendKeys("123456");
		  Select role = new Select(driver.findElement(By.id("role_id")));
		  role.selectByVisibleText("Test Role");
		  long start1 = System.currentTimeMillis();
		  Login_btn.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3.ng-binding")));
		  String ManageText = driver.findElement(By.cssSelector("h3.ng-binding")).getText();
		  ManageText.contentEquals("Management Dashboard");
		  long finish1 = System.currentTimeMillis();
		  long totalTime1 = finish1 - start1; 
		  System.out.println(URL1 + " --- " + "Total Time for Login - "+totalTime1);
		//  String totalTime1 = Long.toString(totalTime);

		 // Input Result in the New File	  	  
		  
		  
		  CSVUtils.writeLine(writer, Arrays.asList("url", "working_status", "pageload_time_millisecond"));
		  CSVUtils.writeLine(writer, Arrays.asList(""+URL1+"", "URL Working", ""+totalTime1+""));
			}
			catch (Exception err){
				
		 CSVUtils.writeLine(writer, Arrays.asList(""+URL1+"", "Failed", "Failed"));
		
				
			}
		   
		  
	  // To Test Second URL
		try{
			
		
		  long start2 = System.currentTimeMillis();
		  driver.get(URL2);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn.btn-lg.btn-primary.ng-scope")));
		  long finish2 = System.currentTimeMillis();
		  long totalTime2 = finish2 - start2; 
		  System.out.println(URL2 + " --- " + "Total Time for page load - "+totalTime2);
		  String NewTitle = driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary.ng-scope")).getText();
		  NewTitle.contentEquals("Create New Titile");
		  
		 	    
		  // To Input Result in the File
		  CSVUtils.writeLine(writer, Arrays.asList(""+URL2+"", "URL Working", ""+totalTime2+""));
		}
		catch (Exception err){
			 CSVUtils.writeLine(writer, Arrays.asList(""+URL2+"", "Failed", "Failed"));
			
		}
	 
		  
		// To Test 3rd URL
		try{
			
			
			  driver.get(URL3);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Op. Stats")));
			  long start3 = System.currentTimeMillis();
			  driver.findElement(By.linkText("Op. Stats")).click();
			  driver.findElement(By.xpath("(//p[@class='list-group-item-heading'])[2]"));
			  long finish3 = System.currentTimeMillis();
			  long totalTime3 = finish3 - start3; 
			  System.out.println(URL3 + " --- " + "Total Time for page load - "+totalTime3);
			  		  
			// To Input Result in the File
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL3+"", "URL Working", ""+totalTime3+""));
		}
		catch (Exception err){
			 CSVUtils.writeLine(writer, Arrays.asList(""+URL3+"", "Failed", "Failed"));
			
		} 
	  	
					
					
		  // To Test 4th URL
				try{
					
					
			  
			  driver.get(URL2);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn.btn-lg.btn-primary.ng-scope")));
			  driver.get(URL4);
			  long start4 = System.currentTimeMillis();
			  driver.findElement(By.linkText("Dashboard")).click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-touched']")));
			  long finish4 = System.currentTimeMillis();
			  long totalTime4 = finish4 - start4; 
			  System.out.println(URL4 + " --- " + "Total Time for page load - "+totalTime4);
			  
			// To Input Result in the File
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL4+"", "URL Working", ""+totalTime4+""));
				}
				catch (Exception err){
					 CSVUtils.writeLine(writer, Arrays.asList(""+URL4+"", "Failed", "Failed"));
					
				}
				
				
			  
		  // To Test 5th URL
				try{
					
					
			  long start5 = System.currentTimeMillis();
			  driver.get(URL5);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.navbar-brand")));
			  long finish5 = System.currentTimeMillis();
			  long totalTime5 = finish5 - start5; 
			  System.out.println(URL5 + " --- " + "Total Time for page load - "+totalTime5);
			  
			// To Input Result in the File
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL5+"", "URL Working", ""+totalTime5+""));
				}
				catch (Exception err){
					 CSVUtils.writeLine(writer, Arrays.asList(""+URL5+"", "Failed", "Failed"));
					
				}
			  		  
		  // To Test 6th URL
				try{
					
					
			  long start6 = System.currentTimeMillis();
			  driver.get(URL6);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#thesearchbutton")));
			  long finish6 = System.currentTimeMillis();
			  long totalTime6 = finish6 - start6; 
			  System.out.println(URL6 + " --- " + "Total Time for page load - "+totalTime6);
			  
			// To Input Result in the File
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL6+"", "URL Working", ""+totalTime6+""));
				}
				catch (Exception err){
					 CSVUtils.writeLine(writer, Arrays.asList(""+URL6+"", "Failed", "Failed"));
					
				}
		  
			  // To Test 7th URL
				try{
					
					
			  long start7 = System.currentTimeMillis();
			  driver.get(URL7);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
			  long finish7 = System.currentTimeMillis();
			  long totalTime7 = finish7 - start7; 
			  System.out.println(URL7 + " --- " + "Total Time for page load - "+totalTime7);
		  
			// To Input Result in the File
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL7+"", "URL Working", ""+totalTime7+""));
				}
				catch (Exception err){
					 CSVUtils.writeLine(writer, Arrays.asList(""+URL7+"", "Failed", "Failed"));
					
				}
		  
		  // To Test 8th URL
				try{
					
					
			  long start8 = System.currentTimeMillis();
			  driver.get(URL8);
			  long finish8 = System.currentTimeMillis();
			  long totalTime8 = finish8 - start8; 
			  System.out.println(URL8 + " --- " + "Total Time for page load - "+totalTime8);
			  
			// To Input Result in the File
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL8+"", "URL Working", ""+totalTime8+""));
				}
				catch (Exception err){
					 CSVUtils.writeLine(writer, Arrays.asList(""+URL8+"", "Failed", "Failed"));
					
				}
		  
			  // To Test 9th URL
				try{
					
					
			  long start9 = System.currentTimeMillis();
			  driver.get(URL9);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.land-logo-text")));
			  long finish9 = System.currentTimeMillis();
			  long totalTime9 = finish9 - start9; 
			  System.out.println(URL9 + " --- " + "Total Time for page load - "+totalTime9);
			  
			  // To Input Result in the File
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL9+"", "URL Working", ""+totalTime9+""));
				}
				catch (Exception err){
					 CSVUtils.writeLine(writer, Arrays.asList(""+URL9+"", "Failed", "Failed"));
				}
		  
		// To Test 10th URL
				try{
					
					
			  long start10 = System.currentTimeMillis();
			  driver.get(URL10);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='box-title']")));
			  long finish10 = System.currentTimeMillis();
			  long totalTime10 = finish10 - start10; 
			  System.out.println(URL10 + " --- " + "Total Time for page load - "+totalTime10);
		  
			  // To Input Result in the File
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL10+"", "URL Working", ""+totalTime10+""));
				}
				catch (Exception err){
					 CSVUtils.writeLine(writer, Arrays.asList(""+URL10+"", "Failed", "Failed"));	
				}
			  
		// To Test 11th URL
				try{
					
					
			  long start11 = System.currentTimeMillis();
			  driver.get(URL11);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='home_img']")));
			  long finish11 = System.currentTimeMillis();
			  long totalTime11 = finish11 - start11; 
			  System.out.println(URL11 + " --- " + "Total Time for page load - "+totalTime11);
			  
			  // To Input Result in the File
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL11+"", "URL Working", ""+totalTime11+""));
				}
				catch (Exception err){
					 CSVUtils.writeLine(writer, Arrays.asList(""+URL11+"", "Failed", "Failed"));	
				}
			  
		// To Test 12th URL
				try{
					
					
			  long start12 = System.currentTimeMillis();
			  driver.get(URL12);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@type='submit']")));
			  long finish12 = System.currentTimeMillis();
			  long totalTime12 = finish12 - start12; 
			  System.out.println(URL12 + " --- " + "Total Time for page load - "+totalTime12);
			  
			  // To Input Result in the File
			  
			  CSVUtils.writeLine(writer, Arrays.asList(""+URL12+"", "URL Working", ""+totalTime12+""));
				}
				catch (Exception err){
					 CSVUtils.writeLine(writer, Arrays.asList(""+URL12+"", "Failed", "Failed"));	
				}
			  
			  
		// To Close the Data File	  
			 
			  writer.flush();
		      writer.close();
		      
		      
		    // To Close the driver
		      
		      driver.close();
			  driver.quit();
		      
		      
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    }