package Branch_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_TabsPage 
{
	public WebDriver driver;
	By TeamLink = By.linkText("Team");
	By AllTab  = By.xpath("(//div[@class='image-block'])");
	By DataTab =By.xpath("//div[@class='col-xs-12']/ul/li[2]");
	By DataDepartment =By.xpath("//div[@class='info-block']/h4[contains(text(), 'Data')]");
	By EngineeringTab =By.xpath("//div[@class='col-xs-12']/ul/li[3]");
	By EngineeringDepartment =By.xpath("//div[@class='info-block']/h4[contains(text(), 'Engineering')]");
	By MarketingTab =By.xpath("//div[@class='col-xs-12']/ul/li[4]");
	By MarketingDepartment =By.xpath("//div[@class='info-block']/h4[contains(text(), 'Marketing')]");
	By OperationsTab =By.xpath("//div[@class='col-xs-12']/ul/li[5]");
	By OperationsDepartment =By.xpath("//div[@class='info-block']/h4[contains(text(), 'Operations')]");
	By PartnerGrowthTab =By.xpath("//div[@class='col-xs-12']/ul/li[6]");
	By PartnerGrowthDepartment =By.xpath("//div[@class='info-block']/h4[contains(text(), 'Partner')]");
	By ProductTab =By.xpath("//div[@class='col-xs-12']/ul/li[7]");
	By ProductDepartment =By.xpath("//div[@class='info-block']/h4[contains(text(), 'Product')]");
	By RecruitingTab =By.xpath("//div[@class='col-xs-12']/ul/li[8]");
	By RecruitingDepartment =By.xpath("//div[@class='info-block']/h4[contains(text(), 'Recruiting')]");
    By cofounder = By.xpath("//div[@class='info-block']/h4[contains(text(), 'Co-Founder')]");


	public Verify_TabsPage(WebDriver driver)
	{
	this.driver=driver;
	}

	public WebElement getTeamlink()
	{
		return driver.findElement(TeamLink);
	}
	public List<WebElement> getallTabs()
	{
	return driver.findElements(AllTab);
	}
	public WebElement getDataTab()
	{
	return driver.findElement(DataTab);
	}
	public List<WebElement> getData()
	{
	return driver.findElements(DataDepartment );
	}
	public WebElement getEngTab()
	{
	return driver.findElement(EngineeringTab);
	}
	public List<WebElement> getEngineeringData()
	{
	return driver.findElements(EngineeringDepartment);
	}

	public WebElement getMarketingTab()
	{
	return driver.findElement(MarketingTab);
	}
	public List<WebElement> getMarketingData()
	{
	return driver.findElements(MarketingDepartment);
	}
	public WebElement getOperationsTab()
	{
	return driver.findElement(OperationsTab);
	}
	public List<WebElement> getOperationsData()
	{
	return driver.findElements(OperationsDepartment);
	}
	public WebElement getPartnerGrowthTab()
	{
	return driver.findElement(PartnerGrowthTab);
	}
	public List<WebElement> getPartnerGrowthData()
	{
	return driver.findElements(PartnerGrowthDepartment);
	}

	public WebElement getProductTab()
	{
	return driver.findElement(ProductTab);
	}
	public List<WebElement> getProductData()
	{
	return driver.findElements(ProductDepartment);
	}

	public WebElement getRecruitingTab()
	{
	return driver.findElement(RecruitingTab);
	}
	public List<WebElement> getRecruitingData()
	{
	return driver.findElements(RecruitingDepartment);
	}
	
	public List<WebElement> getcoFounder()
	{
		return driver.findElements(cofounder);
	}

}
