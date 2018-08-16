package Branch_QA;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class Verify_SumofDepartment extends base
{
	int count, count1, count2,count3,count4,count5,count6,count7,count8;
	public WebElement element,menuitems,Eng,Operations,Partnergrowth,Prod,Rec;
    public List<WebElement> AllTab_EmployeeList,datadepartment,EngDept,MarkDept,OpDept,Cofounder,PartnerGrowth,Product,Recruiting;
    
    public static Logger log =LogManager.getLogger(base.class.getName());
   	@BeforeTest
   	public void initialize() throws IOException
   	{
   	
   		 driver =initializeDriver();
   		 log.info("Driver is initialized");
   			
   		 driver.get(prop.getProperty("url"));
   		 log.info("Navigated to Team page");
   	}
    @Test
	public void SumofDept() throws Exception
	{
		Verify_TabsPage tabs = new Verify_TabsPage(driver);
		
		element=tabs.getTeamlink();
		 log.info("Team Link page clicked");
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		

		
		AllTab_EmployeeList = tabs.getallTabs();
		 log.info("all tabs emloyee list counted");
		count = AllTab_EmployeeList.size();
        System.out.println("All tab Employye List count:"+count);
	
        
            menuitems = tabs.getDataTab();
        	Actions action = new Actions(driver);
            action.moveToElement(menuitems).click().build().perform();
        	datadepartment =tabs.getData();
        	count1 = datadepartment.size();
            System.out.println("Data department employees list:"+count1);
            Thread.sleep(5000);
        	
 
            Eng = tabs.getEngTab();
            action.moveToElement(Eng).click().build().perform();
            EngDept = tabs.getEngineeringData();
            count2 = EngDept.size();
            System.out.println("Engineering department employees list:"+count2);
            
            Thread.sleep(5000);
        
        	 WebElement Market = tabs.getMarketingTab();
             action.moveToElement(Market).click().build().perform();
             MarkDept = tabs.getMarketingData();
             count3 = MarkDept.size();
             System.out.println("Marketing department employees list:"+count3);
             Thread.sleep(5000);
         
       
        	  Operations = tabs.getOperationsTab();
             action.moveToElement(Operations).click().build().perform();
             OpDept = tabs.getOperationsData();
             count4 = OpDept.size();
             System.out.println("Operations department employees list:"+count4);

             Thread.sleep(5000);
         
        
     
    	    Partnergrowth = tabs.getPartnerGrowthTab();
    	    action.moveToElement(Partnergrowth).click().build().perform();
           PartnerGrowth = tabs.getPartnerGrowthData();
           count5 = PartnerGrowth.size();
           System.out.println("partner growth department employees list:"+count5);
           
       
       
       
    	Cofounder = tabs.getcoFounder();
    	count6 = Cofounder.size();
        System.out.println(" co-founders list:"+count6);
        

        Thread.sleep(5000);
       
        
     
    	Prod =tabs.getProductTab();
        action.moveToElement(Prod).click().build().perform();
        Product = tabs.getProductData();
        count7 = Product.size();
      	System.out.println("product department employees list:"+count7);
      	
       	Thread.sleep(5000);
       
        
   
    	   Rec = tabs.getRecruitingTab();
           action.moveToElement(Rec).click().build().perform();
       	 Recruiting = tabs.getRecruitingData();
       	count8 = Recruiting.size();
        System.out.println("Marketing department employees list:"+count8);

       	
       
       
      
    	 int count9 =  count1+count2+count3+count4+count5+count6+count7+count8;      
    	  System.out.println("sum of departments: "+count9);
   	      Assert.assertEquals(count9, count);   
   	      

	}
       
        

    @AfterMethod
	public void browserclose()
	{
		driver.close();
		
	}
	   
	    

	
		}




		
	
	


