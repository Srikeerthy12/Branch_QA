package Branch_QA;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class Verify_EmployeeN extends base
{
	public WebElement element,datatab,Engtab;
	public List<WebElement>  datadept_names,DataDepartment1,images,EngDepartment,EngDep,DataDep;
	
	public static Logger log =LogManager.getLogger(base.class.getName());
   	
	@BeforeMethod
   	public void initialize() throws IOException
   	{
   	
   		 driver =initializeDriver();
   		 log.info("Driver is initialized");
   		 driver.get(prop.getProperty("url"));
   		 log.info("Navigated to Team page");
	 
   	}
	@Test
	public void verifyDataDept_names()
	{
	  Verify_EmployeeNames  emp = new Verify_EmployeeNames(driver);

		element = emp.getTeamlink();
   		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	
		datadept_names = emp.getallTabs_EmpNamesList();
		int count = datadept_names.size();
        System.out.println("All tab data department employee names count:"+count);
		Actions action = new Actions(driver);
		
        DataDepartment1 = emp.getallTabs_DataEmpNames();
        List<String> gen1 = new ArrayList<String>();
        for(WebElement w : DataDepartment1)
        {
         gen1.add(w.getText());
         System.out.println("Data Department employee list from All Tabs:"+w.getText()+"\t");
         }
        
         datatab = emp.getData_Tab();
         action.moveToElement(datatab).click().build().perform();
         DataDep = emp.getDataTab_EmpNames();    	    
         List<String> gender = new ArrayList<String>();
         for(WebElement G1 : DataDep) 
        					{
        					        gender.add(G1.getText());
        					        System.out.println("Data Department Employee list from Data Tab:"+G1.getText());
        					}
        	   	            System.out.println(DataDep.containsAll(DataDepartment1));
        					Assert.assertEquals(DataDep, DataDepartment1);
        				
        	}
	
	

@Test
public void verify_EngDept_Names()
{

	  Verify_EmployeeNames  emp = new Verify_EmployeeNames(driver);
	  element = emp.getTeamlink();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", element);


	images = emp.getallTabs_EngEmpNamesList();
	int count1 = images.size();
    System.out.println("All tab engineering department employee names count:"+count1);
    EngDepartment = emp.getallTabs_EngEmpNames();
    List<String> gen1 = new ArrayList<String>();

    	    	for(WebElement engd : EngDepartment)
    		     {
    		    	 gen1.add(engd.getText());
    		    	 System.out.println("Engineering Department employee list from All Tabs:"+engd.getText());
    		     }
    	    	
    
    			 Engtab = emp.EngData_Tab();
    				Actions action = new Actions(driver);
    			 action.moveToElement(Engtab).click().build().perform();
    			  EngDep = emp.getEngTab_EmpNames();	    	    
    			 List<String> gender = new ArrayList<String>();
    			   	 
    					for(WebElement G1 : EngDep) 
    					{
    					        gender.add(G1.getText());
    					        System.out.println("Engeineering  Department Employee list from Eng Tab:"+G1.getText());
    					}
    	   	            System.out.println(EngDep.containsAll(EngDepartment));
    					Assert.assertEquals(EngDep, EngDepartment);
    					

}
@Test
public void Verify_Marketing_Dept_Names()
{
	  Verify_EmployeeNames  emp = new Verify_EmployeeNames(driver);
	  element = emp.getTeamlink();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", element);


	List<WebElement> AllTab_MarketingEmpList = emp.getallTabs_MarketingEmpNamesList();
	int count2 = AllTab_MarketingEmpList.size();
    System.out.println("All tabs Marketing Employee list count:"+count2);
    
	Actions action = new Actions(driver);

    
    List<WebElement> Marketing_Dept = emp.getallTabs_MarketingEmpNames();
    List<String> Market = new ArrayList<String>();

    	    	for(WebElement Marketing : Marketing_Dept)
    		     {
    		    	 Market.add(Marketing.getText());
    		    	 System.out.println("Marketing Department employee list from All Tabs:"+Marketing.getText()+"\t");
    		     }
    	    	
    
    			 WebElement Marketingtab = emp.MarketingData_Tab();
    			 action.moveToElement(Marketingtab).click().build().perform();
    			 List<WebElement> Marketing_Dep = emp.getMarketingTab_EmpNames();  	    
    			 List<String> gender = new ArrayList<String>();
    			   	 
    					for(WebElement G1 :Marketing_Dep) 
    					{
    					        gender.add(G1.getText());
    					        System.out.println("Marketing  Department Employee list from Marketing Tab:"+G1.getText());
    					}
    	   	            System.out.println(Marketing_Dep.containsAll(Marketing_Dept));
    					Assert.assertEquals(Marketing_Dep, Marketing_Dept);
    					
}

@Test
public void Verify_Operations_Dept_Emp_names()
{
	  Verify_EmployeeNames  emp = new Verify_EmployeeNames(driver);
	  element = emp.getTeamlink();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", element);

	
	List<WebElement> AllTab_OperationsEmpList = emp.getallTabs_OperationsEmpNamesList();
	int count3 = AllTab_OperationsEmpList.size();
    System.out.println("All tabs operations Employee list count:"+count3);
    
	Actions action = new Actions(driver);

    
    List<WebElement> Operations_Dept = emp.getallTabs_OperationsEmpNames();
    List<String> Market = new ArrayList<String>();

    	    	for(WebElement Operations : Operations_Dept)
    		     {
    		    	 Market.add(Operations.getText());
    		    	 System.out.println("Operations Department employee list from All Tabs:"+Operations.getText()+"\t");
    		     }
    	    	
    
    			 WebElement Operationstab = emp.OperationsData_Tab();
    			 action.moveToElement(Operationstab).click().build().perform();
    			 List<WebElement> Operations_Dep = emp.getOperationsTab_EmpNames();	    	    
    			 List<String> gender = new ArrayList<String>();
    			   	 
    					for(WebElement G1 :Operations_Dep) 
    					{
    					        gender.add(G1.getText());
    					        System.out.println("Operations  Department Employee list from Marketing Tab:"+G1.getText());
    					}
    	   	            System.out.println(Operations_Dep.containsAll(Operations_Dept));
    					Assert.assertEquals(Operations_Dep, Operations_Dept);
    					
}

@Test
public void Verify_Partner_Growth_Dept_EmpNames()
{
	  Verify_EmployeeNames  emp = new Verify_EmployeeNames(driver);
	  element = emp.getTeamlink();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", element);


	List<WebElement> AllTab_PartnergrowthEmpList = emp.getallTabs_PartnergrowthEmpNamesList();
	int count4 = AllTab_PartnergrowthEmpList.size();
    System.out.println("All tabs partnergrowth Employee list count:"+count4);
    
	Actions action = new Actions(driver);

    
    List<WebElement> prtnergrowth_Dept = emp.getallTabs_PartnergrowthEmpNames();
    List<String> Market = new ArrayList<String>();

    	    	for(WebElement partnergrowth : prtnergrowth_Dept)
    		     {
    		    	 Market.add(partnergrowth.getText());
    		    	 System.out.println("partnergrowth Department employee names from All Tabs:"+partnergrowth.getText()+"\t");
    		     }
    	    	
    
    			 WebElement partnergrowthtab = emp.PartnergerowthData_Tab();
    			 action.moveToElement(partnergrowthtab).click().build().perform();
    			 List<WebElement> partnergrowth_Dep = emp.getPartnergrowthTab_EmpNames();	    	    
    			 List<String> gender = new ArrayList<String>();
    			   	 
    					for(WebElement G1 :partnergrowth_Dep) 
    					{
    					        gender.add(G1.getText());
    					        System.out.println("partnergrowth  Department Employee names from partner growth Tab:"+G1.getText());
    					}
    	   	            System.out.println(partnergrowth_Dep.containsAll(prtnergrowth_Dept));
    					Assert.assertEquals(partnergrowth_Dep, prtnergrowth_Dept);	
}
        
	@Test
	public void Verify_Product_Dept_Names()
	{
		  Verify_EmployeeNames  emp = new Verify_EmployeeNames(driver);

		List<WebElement> AllTab_ProductEmpList = emp.getallTabs_ProductEmpNamesList();
		int count5 = AllTab_ProductEmpList.size();
	    System.out.println("All tabs Product Employee names  count:"+count5);
	    
		Actions action = new Actions(driver);

	    
	    List<WebElement> product_Dept = emp.getallTabs_ProductEmpNames();
	    List<String> product = new ArrayList<String>();

	    	    	for(WebElement prod : product_Dept)
	    		     {
	    		    	 product.add(prod.getText());
	    		    	 System.out.println("product Department employee names from All Tabs:"+prod.getText()+"\t");
	    		     }
	    	    	
	    
	    			 WebElement producttab =emp.ProductData_Tab();
	    			 action.moveToElement(producttab).click().build().perform();
	    			 List<WebElement> prod_Dep = emp.getProductTab_EmpNames();	    	    
	    			 List<String> gender = new ArrayList<String>();
	    			   	 
	    					for(WebElement G1 :prod_Dep) 
	    					{
	    					        gender.add(G1.getText());
	    					        System.out.println("product  Department Employee names from partner growth Tab:"+G1.getText());
	    					}
	    	   	            System.out.println(prod_Dep.containsAll(product_Dept));
	    					Assert.assertEquals(prod_Dep, product_Dept);    	
		
	}
	
	@Test
	public void Verify_Recruiting_Dept_EMpNames()
	{
		  Verify_EmployeeNames  emp = new Verify_EmployeeNames(driver);

		
		List<WebElement> AllTab_RecruitingEmpList = emp.getallTabs_RecruitingNamesList();
		int count6 = AllTab_RecruitingEmpList.size();
	    System.out.println("All tabs recruiting Employee names  count:"+count6);
	    
		Actions action = new Actions(driver);

	    
	    List<WebElement> recruit_Dept = emp.getallTabs_RecruitingEmpNames();
	    List<String> recruiting = new ArrayList<String>();

	    	    	for(WebElement rec : recruit_Dept)
	    		     {
	    	    		recruiting.add(rec.getText());
	    		    	 System.out.println("recruiting Department employee names from All Tabs:"+rec.getText()+"\t");
	    		     }
	    	    	
	    
	    			 WebElement recruitingtab = emp.RecruitingData_Tab();
	    			action.moveToElement(recruitingtab).click().build().perform();
	    			 List<WebElement> Recruiting_Dep = emp.getRecruitingTab_EmpNames();	    	    
	    			 List<String> gender = new ArrayList<String>();
	    			   	 
	    					for(WebElement G1 :Recruiting_Dep) 
	    					{
	    					        gender.add(G1.getText());
	    					        System.out.println("recruiting  Department Employee names from partner growth Tab:"+G1.getText());
	    					}
	    	   	            System.out.println(Recruiting_Dep.containsAll(recruit_Dept));
	    					Assert.assertEquals(Recruiting_Dep, recruit_Dept);
	    					
	    				      

	}
	
	
	@AfterMethod
	public void Closebrowser()
	{
		driver.quit();
	}
	

	}


