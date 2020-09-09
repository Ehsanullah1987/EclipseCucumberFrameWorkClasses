package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;


public class ReportPageElements extends CommonMethods {
@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]/b")
public WebElement PIM;

@FindBy(xpath="//*[@id=\"menu_core_viewDefinedPredefined")
public WebElement Report;

@FindBy(xpath="//input[@id='search_search']")
public WebElement InvaReportName;

@FindBy(className="searchBtn")
public WebElement searchBtn;

@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td")
public WebElement NoRecord;
@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[2]")
public WebElement record;
public void ReportPageElements() {
 PageFactory.initElements(BaseClass.driver, this);
}
}