package Branch_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_EmployeeNames 
{

	public WebDriver driver;

	By AllTab_Data = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Data')]/../h2");
	By EmpNamesData = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Data')]/../h2");
	By Datadepartment_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[2]");
	By DataDept_EmpNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Data')]/../h2");
	
	By AllTab_Engineering= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Engineering')]/../h2");
	By AllTab_EngDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Engineering')]/../h2");
	By EngineeringDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[3]");
	By EngDept_EmpNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Engineering')]/../h2");
	
	By AllTab_Marketing= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Marketing')]/../h2");
	By AllTab_MarkDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Marketing')]/../h2");
	By MarketingDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[4]");
	By MarketDept_EmpNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Marketing')]/../h2");
	
	By AllTab_Operations= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Operations')]/../h2");
	By AllTab_OperationsDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Operations')]/../h2");
	By OperationsDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[5]");
	By OperationsDept_EmpNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Operations')]/../h2");
	
	By AllTab_PartnerGrowth= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Partner')]/../h2");
	By AllTab_PartnerGrowthDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Partner')]/../h2");
	By PartnerGrowthDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[6]");
	By PartnerGrowthDept_EmpNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Partner')]/../h2");
	
	By AllTab_Product= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Product')]/../h2");
	By AllTab_ProductDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Product')]/../h2");
	By ProductDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[7]");
	By ProductDept_EmpNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Product')]/../h2");
	
	By AllTab_Recruiting= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Recruiting')]/../h2");
	By AllTab_RecruitingDept_Size= By.xpath("//div[@class='info-block']/h4[contains(text(), 'Recruiting')]/../h2");
	By RecruitingDept_Tab = By.xpath("//div[@class='col-xs-12']/ul/li[8]");
	By RecruitingDept_EmpNames = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Recruiting')]/../h2");
	
    By TeamLink = By.linkText("Team");


	public Verify_EmployeeNames(WebDriver driver)
	{
	this.driver=driver;
	}

	public WebElement getTeamlink()
	{
		return driver.findElement(TeamLink);
	}
	
	//DataDaprtment
	public List<WebElement> getallTabs_EmpNamesList()
	{
	return driver.findElements(AllTab_Data);
	}
	public List<WebElement> getallTabs_DataEmpNames()
	{
	return driver.findElements(EmpNamesData);
	}
	public WebElement getData_Tab()
	{
		return driver.findElement(Datadepartment_Tab);
	}
	public List<WebElement> getDataTab_EmpNames()
	{
	return driver.findElements(DataDept_EmpNames);
	}
	
	//Engineering Department
	public List<WebElement> getallTabs_EngEmpNamesList()
	{
	return driver.findElements(AllTab_EngDept_Size);
	}
	public List<WebElement> getallTabs_EngEmpNames()
	{
	return driver.findElements(AllTab_Engineering);
	}
	public WebElement EngData_Tab()
	{
		return driver.findElement(EngineeringDept_Tab);
	}
	public List<WebElement> getEngTab_EmpNames()
	{
	return driver.findElements(EngDept_EmpNames);
	}
	
	//Marketing Department
		public List<WebElement> getallTabs_MarketingEmpNamesList()
		{
		return driver.findElements(AllTab_MarkDept_Size);
		}
		public List<WebElement> getallTabs_MarketingEmpNames()
		{
		return driver.findElements(AllTab_Marketing);
		}
		public WebElement MarketingData_Tab()
		{
			return driver.findElement(MarketingDept_Tab);
		}
		public List<WebElement> getMarketingTab_EmpNames()
		{
		return driver.findElements(MarketDept_EmpNames);
		}
		
		//Operations department
		public List<WebElement> getallTabs_OperationsEmpNamesList()
		{
		return driver.findElements(AllTab_OperationsDept_Size);
		}
		public List<WebElement> getallTabs_OperationsEmpNames()
		{
		return driver.findElements(AllTab_Operations);
		}
		public WebElement OperationsData_Tab()
		{
			return driver.findElement(OperationsDept_Tab);
		}
		public List<WebElement> getOperationsTab_EmpNames()
		{
		return driver.findElements(OperationsDept_EmpNames);
		}
		
		//Partner growth department
		public List<WebElement> getallTabs_PartnergrowthEmpNamesList()
		{
		return driver.findElements(AllTab_PartnerGrowthDept_Size);
		}
		public List<WebElement> getallTabs_PartnergrowthEmpNames()
		{
		return driver.findElements(AllTab_PartnerGrowth);
		}
		public WebElement PartnergerowthData_Tab()
		{
			return driver.findElement(PartnerGrowthDept_Tab);
		}
		public List<WebElement> getPartnergrowthTab_EmpNames()
		{
		return driver.findElements(PartnerGrowthDept_EmpNames);
		}
		
		//product department
		public List<WebElement> getallTabs_ProductEmpNamesList()
		{
		return driver.findElements(AllTab_ProductDept_Size);
		}
		public List<WebElement> getallTabs_ProductEmpNames()
		{
		return driver.findElements(AllTab_Product);
		}
		public WebElement ProductData_Tab()
		{
			return driver.findElement(ProductDept_Tab);
		}
		public List<WebElement> getProductTab_EmpNames()
		{
		return driver.findElements(ProductDept_EmpNames);
		}
		
		//recruiting department
		public List<WebElement> getallTabs_RecruitingNamesList()
		{
		return driver.findElements(AllTab_RecruitingDept_Size);
		}
		public List<WebElement> getallTabs_RecruitingEmpNames()
		{
		return driver.findElements(AllTab_Recruiting);
		}
		public WebElement RecruitingData_Tab()
		{
			return driver.findElement(RecruitingDept_Tab);
		}
		public List<WebElement> getRecruitingTab_EmpNames()
		{
		return driver.findElements(RecruitingDept_EmpNames);
		}
	
}