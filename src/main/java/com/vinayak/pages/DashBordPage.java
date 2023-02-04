package com.vinayak.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vinayak.base.Generic;


public class DashBordPage  extends Generic{
	
	String path =" C:\\Users\\hp elitebook\\Desktop\\pople.xlsx";
	Generic gn = new Generic();
	
	
	
	public DashBordPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	

	
	
	@FindBy(xpath="//i[@id=\"sTest-candidateIcon\"]") WebElement  candidateBtn;
	@FindBy(id="sTest-resumeParserBtn") WebElement resumeBtn;
	@FindBy(xpath ="//label[@class=\"upload control\"]//following::input[@type=\"file\"]") WebElement resumeParserUpload;
	@FindBy(xpath ="//h4[contains(text(),'Candidate Pipeline By Recruiter Assigned')]") WebElement candidatePipeline;	
	By appliedDropDown =By.xpath("(//table[@id=\"dashboard_recruiter_table\"]//following::div[@class=\"dropdown-content\"])[2]//a");
	@FindBy(xpath="(//div[@id=\"dashBoardRecruiterWidget\"]//div[@class=\"dropdown dropdown-menu-animation select-field select-dropdown is-icon-right is-mobile-modal\"])[1]")  WebElement apdBtn;
   // @FindBy(xpath="//a[@id=\"97-label\"]//span") WebElement checkBox;
    @FindBy(xpath="//label[@id=\"sTest-taskListCheckBox\"]") WebElement checkBox1;
	
	
//	public void  candidateResumeParserUpload() {
//		
//		candidateBtn.click(); log.info("click on CandidateBtn ");	
//		gn.clickOnElement(resumeBtn); //resumeBtn.click();
//		resumeParserUpload.sendKeys(path); log.info("FileUploadSuccesfully");
//		
//	}
	
	
	
	
	public void gettingStartTextIsPresenet() {
		
		gn.textIsDisplay("Getting Started");   log.info("text is Display ");
		
	}
	
	
	
	
	public void taskBottomScroll() {
		
		gn.scrollOnElement(candidatePipeline); log.info("Scroll On Element :- "+candidatePipeline);	
	}
	
	
	
	public void candidatePipelineByRecruiterAssigned() throws IOException {
		gn = new Generic();
		gn.waitInSec(2);
		gn.scrollOnElement(candidatePipeline);                           log.info("Scroll On element :- "+ candidatePipeline);
		gn.waitInSec(3);
		apdBtn.click();                                              log.info("Click On element :- "+ apdBtn);
		gn.waitInSec(2);
		gn.dropDowm(appliedDropDown, "Offered");                         log.info("Element Selected:- "+ "Selected from :- "+ appliedDropDown);
		
		
	}

	
	public void clickOnCheckBox() throws IOException {
		gn = new Generic();
		gn.waitInSec(2);
		gn.scrollOnElement(checkBox1);  
		gn.waitInSec(3);
		checkBox1.click();
		
	}
	
	

}