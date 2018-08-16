package Branch_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_Employee_Departments
{
	public WebDriver driver;

	By AllTab_Data = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Data')]");
	By DeptNamesData = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Data')]");
	By Datadepartment_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[2]");
	By DataDept_DeptNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Data')]");
	
	By AllTab_Engineering= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Engineering')]");
	By AllTab_EngDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Engineering')]");
	By EngineeringDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[3]");
	By EngDept_DeptNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Engineering')]");
	
	By AllTab_Marketing= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Marketing')]");
	By AllTab_MarkDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Marketing')]");
	By MarketingDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[4]");
	By MarketDept_DeptNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Marketing')]");
	
	By AllTab_Operations= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Operations')]");
	By AllTab_OperationsDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Operations')]");
	By OperationsDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[5]");
	By OperationsDept_DeptNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Operations')]");
	
	By AllTab_PartnerGrowth= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Partner')]");
	By AllTab_PartnerGrowthDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Partner')]");
	By PartnerGrowthDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[6]");
	By PartnerGrowthDept_DeptNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Partner')]");
	
	By AllTab_Product= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Product')]");
	By AllTab_ProductDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Product')]");
	By ProductDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[7]");
	By ProductDept_DeptNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Product')]");
	
	By AllTab_Recruiting= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Recruiting')]");
	By AllTab_RecruitingDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Recruiting')]");
	By RecruitingDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[8]");
	By RecruitingDept_DeptNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Recruiting')]");
	
    By TeamLink = By.linkText("Team");


	public Verify_Employee_Departments(WebDriver driver)
	{
	this.driver=driver;
	}

	public WebElement getTeamlink()
	{
		return driver.findElement(TeamLink);
	}
	
	//DataDaprtment
	public List<WebElement> getallTabs_DeptNamesList()
	{
	return driver.findElements(AllTab_Data);
	}
	public List<WebElement> getallTabs_DataDeptNames()
	{
	return driver.findElements(DeptNamesData);
	}
	public WebElement getData_Tab()
	{
		return driver.findElement(Datadepartment_Tab);
	}
	public List<WebElement> getDataTab_DeptNames()
	{
	return driver.findElements(DataDept_DeptNames);
	}
	
	//Engineering Department
	public List<WebElement> getallTabs_EngDeptNamesList()
	{
	return driver.findElements(AllTab_EngDept_Size);
	}
	public List<WebElement> getallTabs_EngDeptNames()
	{
	return driver.findElements(AllTab_Engineering);
	}
	public WebElement EngData_Tab()
	{
		return driver.findElement(EngineeringDept_Tab);
	}
	public List<WebElement> getEngTab_DeptNames()
	{
	return driver.findElements(EngDept_DeptNames);
	}
	
	//Marketing Department
		public List<WebElement> getallTabs_MarketingDeptNamesList()
		{
		return driver.findElements(AllTab_MarkDept_Size);
		}
		public List<WebElement> getallTabs_MarketingDeptNames()
		{
		return driver.findElements(AllTab_Marketing);
		}
		public WebElement MarketingData_Tab()
		{
			return driver.findElement(MarketingDept_Tab);
		}
		public List<WebElement> getMarketingTab_DeptNames()
		{
		return driver.findElements(MarketDept_DeptNames);
		}
		
		//Operations department
		public List<WebElement> getallTabs_OperationsDeptNamesList()
		{
		return driver.findElements(AllTab_OperationsDept_Size);
		}
		public List<WebElement> getallTabs_OperationsDeptNames()
		{
		return driver.findElements(AllTab_Operations);
		}
		public WebElement OperationsData_Tab()
		{
			return driver.findElement(OperationsDept_Tab);
		}
		public List<WebElement> getOperationsTab_DeptNames()
		{
		return driver.findElements(OperationsDept_DeptNames);
		}
		
		//Partner growth department
		public List<WebElement> getallTabs_PartnergrowthDeptNamesList()
		{
		return driver.findElements(AllTab_PartnerGrowthDept_Size);
		}
		public List<WebElement> getallTabs_PartnergrowthDeptNames()
		{
		return driver.findElements(AllTab_PartnerGrowth);
		}
		public WebElement PartnergerowthData_Tab()
		{
			return driver.findElement(PartnerGrowthDept_Tab);
		}
		public List<WebElement> getPartnergrowthTab_DeptNames()
		{
		return driver.findElements(PartnerGrowthDept_DeptNames);
		}
		
		//product department
		public List<WebElement> getallTabs_ProductDeptNamesList()
		{
		return driver.findElements(AllTab_ProductDept_Size);
		}
		public List<WebElement> getallTabs_ProductDeptNames()
		{
		return driver.findElements(AllTab_Product);
		}
		public WebElement ProductData_Tab()
		{
			return driver.findElement(ProductDept_Tab);
		}
		public List<WebElement> getProductTab_DeptNames()
		{
		return driver.findElements(ProductDept_DeptNames);
		}
		
		//recruiting department
		public List<WebElement> getallTabs_RecruitingDeptList()
		{
		return driver.findElements(AllTab_RecruitingDept_Size);
		}
		public List<WebElement> getallTabs_RecruitingDeptNames()
		{
		return driver.findElements(AllTab_Recruiting);
		}
		public WebElement RecruitingData_Tab()
		{
			return driver.findElement(RecruitingDept_Tab);
		}
		public List<WebElement> getRecruitingTab_DeptNames()
		{
		return driver.findElements(RecruitingDept_DeptNames);
		}


}
