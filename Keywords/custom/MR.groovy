package custom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MR {
	@Keyword
	def MR1() {
		WebUI.click(findTestObject("Object Repository/Workorder/Menuicon"))
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Workordersub"))
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/MR menu"))
		WebUI.waitForElementNotVisible(findTestObject("Object Repository/Maintenance Request Record/MR add icon"),10)
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/MR add icon"))
		WebUI.sendKeys(findTestObject("Object Repository/Maintenance Request Record/Description"),'Test')
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Location"))
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Location value"))
		/*WebUI.click(findTestObject("Object Repository/Maintenance Request Record/costcenter"))
		 WebUI.click(findTestObject("Object Repository/Maintenance Request Record/cost center editlist values"))
		 WebUI.click(findTestObject("Object Repository/Maintenance Request Record/editlist add"))
		 WebUI.sendKeys(findTestObject("Object Repository/Maintenance Request Record/costcenter add value"),'Test')
		 WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Costcenter save"))
		 WebUI.click(findTestObject("Object Repository/Maintenance Request Record/editlist close"))*/
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Department"))
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Department value"))
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Save MR"))
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Ok Button after save"))
		WebUI.waitForPageLoad(10)
		WebUI.scrollToElement(findTestObject("Object Repository/Maintenance Request Record/Convert to Workorder"),5)
		WebUI.waitForElementVisible(findTestObject("Object Repository/Maintenance Request Record/Convert to Workorder"),5)
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Convert to Workorder"))

		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/Yes button"),5)
		WebUI.click(findTestObject("Object Repository/Maintenance Request Record/yes Button to convert"))
	}
}
