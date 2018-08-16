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

public class Verify_EmpDepartments extends base
{
	public WebDriver driver;
	int count, count1, count2,count3,count4,count5,count6,count7,count8;
	public WebElement element,menuitems,Eng,Operations,Partnergrowth,Prod,Rec;
    public List<WebElement> AllTab_EmployeeList,datadepartment,EngDept,MarkDept,OpDept,Cofounder,PartnerGrowth,Product,Recruiting;
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
    public void Verify_DataDeptNames() throws Exception
    {
		Verify_Employee_Departments dep = new Verify_Employee_Departments(driver);
    	Actions action = new Actions(driver);
    	datadepartment = dep.getallTabs_DeptNamesList();
    	count1 = datadepartment.size();
        System.out.println("Data department employees list:"+count1);

        Thread.sleep(5000);
        
        List<WebElement> Data_Dept = dep.getallTabs_DataDeptNames();
        int count1 = Data_Dept.size();
        System.out.println("Data Department list size from Data Department:"+count1);
  		log.info("Counted Data Dept Employees list in All Tabs");

        List<String> d = new ArrayList<String>();

        	    	for(WebElement alltabDataDept : Data_Dept)
        		     {
        		    	 d.add(alltabDataDept.getText());
        		    	 System.out.println("Data Department employee list from All Tabs:"+alltabDataDept.getText());
        		     }
        			 WebElement Operationstab = dep.getData_Tab();
        			 action.moveToElement(Operationstab).click().build().perform();
        			 List<WebElement> DataDept_Dep = dep.getDataTab_DeptNames();
        		  	 log.info("Data Tab department names printed");
        			 int count2 = DataDept_Dep.size();
        			 System.out.println("Data Department list size from Data Department:"+count2);
        			 List<String> gender = new ArrayList<String>();
        			   	 
        					for(WebElement G1 :DataDept_Dep) 
        					{
        					        gender.add(G1.getText());
        					        System.out.println("Data Department Employee list from Data Tab:"+G1.getText());
        					}
        	   	            System.out.println(DataDept_Dep.containsAll(Data_Dept));
        					Assert.assertEquals(DataDept_Dep, Data_Dept);
        			  		log.info("Data Tab deparmtent naes and All tab department names are verified");

    	
    }
	
	@Test
	public void verify_EngDeptNames()
	{

		Verify_Employee_Departments dep = new Verify_Employee_Departments(driver);

		List<WebElement> EngDept = dep.getallTabs_EngDeptNamesList();
		int count = EngDept.size();
  		log.info("Enginerring department names are counted from ALl tabs");
	    System.out.println("All tab engineering department  names count:"+count);
	    
		Actions action = new Actions(driver);

	    
	    List<WebElement> EngDepartment = dep.getallTabs_EngDeptNames();
	    List<String> gen1 = new ArrayList<String>();

	    	    	for(WebElement w : EngDepartment)
	    		     {
	    		    	 gen1.add(w.getText());
	    		    	 System.out.println("Engineering Department names from All Tabs:"+w.getText());
	    		     }
	    	    	
	    
	    			 WebElement Engtab = dep.EngData_Tab();
	    		  	log.info("Entered into Data Tab");

	    			 action.moveToElement(Engtab).click().build().perform();
	    			 List<WebElement> EngDep = dep.getEngTab_DeptNames();	    	    
	    			 List<String> gender = new ArrayList<String>();
	    			   	 
	    					for(WebElement G1 : EngDep) 
	    					{
	    					        gender.add(G1.getText());
	    					        System.out.println("Engeineering  Department names from Eng Tab:"+G1.getText());
	    					}
	    	   	            System.out.println(EngDep.containsAll(EngDepartment));
	    					Assert.assertEquals(EngDep, EngDepartment);
	    					

	}

	@Test
	public void Verify_Marketing_DeptNames()
	{
		Verify_Employee_Departments dep = new Verify_Employee_Departments(driver);

		List<WebElement> AllTab_MarketingEmpList = dep.getallTabs_MarketingDeptNamesList();
		int count2 = AllTab_MarketingEmpList.size();
	    System.out.println("All tabs Marketing dept names count:"+count2);
		Actions action = new Actions(driver);

	    
	    List<WebElement> Marketing_Dept = dep.getallTabs_MarketingDeptNames();
	    List<String> Market = new ArrayList<String>();

	    	    	for(WebElement Marketing : Marketing_Dept)
	    		     {
	    		    	 Market.add(Marketing.getText());
	    		    	 System.out.println("Marketing Department department names from All Tabs:"+Marketing.getText()+"\t");
	    		     }
	    	    	
	    
	    			 WebElement Marketingtab = dep.MarketingData_Tab();
	    		  		log.info("Entered into the marketing department");

	    			 action.moveToElement(Marketingtab).click().build().perform();
	    			 List<WebElement> Marketing_Dep =dep.getMarketingTab_DeptNames();
	    			 
	    			 List<String> gender = new ArrayList<String>();
	    			   	 
	    					for(WebElement G1 :Marketing_Dep) 
	    					{
	    					        gender.add(G1.getText());
	    					        System.out.println("Marketing  Department department names from Marketing Tab:"+G1.getText());
	    					}
	    	   	            System.out.println(Marketing_Dep.containsAll(Marketing_Dept));
	    					Assert.assertEquals(Marketing_Dep, Marketing_Dept);
	    					
	}

	@Test
	public void Verify_Operations_Deptnames()
	{
		Verify_Employee_Departments dep = new Verify_Employee_Departments(driver);

		
		List<WebElement> AllTab_OperationsEmpList = dep.getallTabs_OperationsDeptNamesList();
		int count3 = AllTab_OperationsEmpList.size();
	    System.out.println("All tabs operations Department names count:"+count3);
	    
		Actions action = new Actions(driver);

	    
	    List<WebElement> Operations_Dept = dep.getallTabs_OperationsDeptNames();
	    List<String> Market = new ArrayList<String>();

	    	    	for(WebElement Operations : Operations_Dept)
	    		     {
	    		    	 Market.add(Operations.getText());
	    		    	 System.out.println("Operations Department department names from All Tabs:"+Operations.getText()+"\t");
	    		     }
	    	    	
	    
	    			 WebElement Operationstab = dep.OperationsData_Tab();
	    		  	 log.info("Entered into the operations department");

	    			 action.moveToElement(Operationstab).click().build().perform();
	    			 List<WebElement> Operations_Dep = dep.getOperationsTab_DeptNames();    	    
	    			 List<String> gender = new ArrayList<String>();
	    			   	 
	    					for(WebElement G1 :Operations_Dep) 
	    					{
	    					        gender.add(G1.getText());
	    					        System.out.println("Operations  Department names from operations  Tab:"+G1.getText());
	    					}
	    	   	            System.out.println(Operations_Dep.containsAll(Operations_Dept));
	    					Assert.assertEquals(Operations_Dep, Operations_Dept);
	    					
	}

	@Test
	public void Verify_Partner_Growth_DeptNames()
	{
		
		Verify_Employee_Departments dep = new Verify_Employee_Departments(driver);

		List<WebElement> AllTab_PartnergrowthEmpList = dep.getallTabs_PartnergrowthDeptNamesList();
		int count4 = AllTab_PartnergrowthEmpList.size();
	    System.out.println("All tabs partnergrowth department names  count:"+count4);
	    
		Actions action = new Actions(driver);

	    
	    List<WebElement> prtnergrowth_Dept = dep.getallTabs_PartnergrowthDeptNames();
	    List<String> Market = new ArrayList<String>();

	    	    	for(WebElement partnergrowth : prtnergrowth_Dept)
	    		     {
	    		    	 Market.add(partnergrowth.getText());
	    		    	 System.out.println("partnergrowth Department  names from All Tabs:"+partnergrowth.getText()+"\t");
	    		     }
	    	    	
	    
	    			 WebElement partnergrowthtab = dep.PartnergerowthData_Tab();
	    		  		log.info("Entered into the partner growth department");
	    			 action.moveToElement(partnergrowthtab).click().build().perform();
	    			 List<WebElement> partnergrowth_Dep = dep.getPartnergrowthTab_DeptNames();	    	    
	    			 List<String> gender = new ArrayList<String>();
	    			   	 
	    					for(WebElement G1 :partnergrowth_Dep) 
	    					{
	    					        gender.add(G1.getText());
	    					        System.out.println("partnergrowth  Department  names from partner growth Tab:"+G1.getText());
	    					}
	    	   	            System.out.println(partnergrowth_Dep.containsAll(prtnergrowth_Dept));
	    					Assert.assertEquals(partnergrowth_Dep, prtnergrowth_Dept);	
	}
	        
		@Test
		public void Verify_Product_DeptNames()
		{
			Verify_Employee_Departments dep = new Verify_Employee_Departments(driver);

			List<WebElement> AllTab_ProductEmpList = dep.getallTabs_ProductDeptNamesList();
					int count5 = AllTab_ProductEmpList.size();
		    System.out.println("All tabs Product  names  count:"+count5);
		    
			Actions action = new Actions(driver);

		    
		    List<WebElement> product_Dept = dep.getallTabs_ProductDeptNames();
		    List<String> product = new ArrayList<String>();

		    	    	for(WebElement prod : product_Dept)
		    		     {
		    		    	 product.add(prod.getText());
		    		    	 System.out.println("product Department  names from All Tabs:"+prod.getText()+"\t");
		    		     }
		    	    	
		    
		    			 WebElement producttab = dep.ProductData_Tab();
		    		  		log.info("Entered into the Product department");
		    			 action.moveToElement(producttab).click().build().perform();
		    			 List<WebElement> prod_Dep = dep.getProductTab_DeptNames();	    	    
		    			 List<String> gender = new ArrayList<String>();
		    			   	 
		    					for(WebElement G1 :prod_Dep) 
		    					{
		    					        gender.add(G1.getText());
		    					        System.out.println("product  Department names from partner growth Tab:"+G1.getText());
		    					}
		    	   	            System.out.println(prod_Dep.containsAll(product_Dept));
		    					Assert.assertEquals(prod_Dep, product_Dept);    	
			
		}
		
		@Test
		public void Verify_Recruiting_DeptNames()
		{
			Verify_Employee_Departments dep = new Verify_Employee_Departments(driver);

			
			List<WebElement> AllTab_RecruitingEmpList = dep.getallTabs_RecruitingDeptList();
			int count6 = AllTab_RecruitingEmpList.size();
		    System.out.println("All tabs recruiting  names  count:"+count6);
		    
			Actions action = new Actions(driver);

		    
		    List<WebElement> recruit_Dept = dep.getallTabs_RecruitingDeptNames();
		    List<String> recruiting = new ArrayList<String>();

		    	    	for(WebElement rec : recruit_Dept)
		    		     {
		    	    		recruiting.add(rec.getText());
		    		    	 System.out.println("recruiting Department  names from All Tabs:"+rec.getText()+"\t");
		    		     }
		    	    	
		    
		    			 WebElement recruitingtab = dep.RecruitingData_Tab();
		    		  		log.info("Entered into the recruiting department");
		    			 action.moveToElement(recruitingtab).click().build().perform();
		    			 List<WebElement> Recruiting_Dep = dep.getRecruitingTab_DeptNames();	    	    
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
	public void browserclose()
	{
		driver.close();
		
	}

}
