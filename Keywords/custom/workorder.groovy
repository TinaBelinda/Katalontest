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
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class Workorder {

	@Keyword
	def workorder1() {


		WebUI.click(findTestObject("Object Repository/Workorder/Menuicon"))
		WebUI.click(findTestObject("Object Repository/Workorder/workordericon"))
		WebUI.click(findTestObject("Object Repository/Workorder/Workordersub"))
		WebUI.click(findTestObject("Object Repository/Workorder/Add button"))
		WebUI.sendKeys(findTestObject("Object Repository/Workorder/Description"),'Test')
		WebUI.click(findTestObject("Object Repository/Workorder/Workordertype"))
		WebUI.click(findTestObject("Object Repository/Workorder/Workordertypevalue"))
		WebUI.click(findTestObject("Object Repository/Workorder/workorderpriority"))
		WebUI.click(findTestObject("Object Repository/Workorder/workorderpriorityvalue"))
		WebUI.click(findTestObject("Object Repository/Workorder/workordergroup"))
		WebUI.click(findTestObject("Object Repository/Workorder/workordergroupvalue"))
		WebUI.click(findTestObject("Object Repository/Workorder/WOinformation tab"))
		//WebUI.scrollToElement(findTestObject("Object Repository/Workorder/Asset/Asset morebutton"),GlobalVariable.timeOut)
		WebUI.click(findTestObject("Object Repository/Workorder/Asset/Asset morebutton"))
		WebUI.click(findTestObject("Object Repository/Workorder/Asset/Asset link button"))
		WebUI.click(findTestObject("Object Repository/Workorder/Asset/Asset Id"))
		WebUI.click(findTestObject("Object Repository/Workorder/Asset/Asset replace button"))
		//WebUI.scrollToElement(findTestObject("Object Repository/Workorder/Personnel/Personnel more button"), GlobalVariable.timeOut)
		WebUI.click(findTestObject("Object Repository/Workorder/Personnel/Personnel more button"))
		WebUI.click(findTestObject("Object Repository/Workorder/Personnel/Personnel link button"))
		WebUI.click(findTestObject("Object Repository/Workorder/Personnel/Personnel ID"))
		WebUI.click(findTestObject("Object Repository/Workorder/Personnel/Personnel replace button"))
		WebUI.click(findTestObject("Object Repository/Workorder/Inventory/Inventory more button"))
		WebUI.click(findTestObject("Object Repository/Workorder/Inventory/Inventory link button"))
		WebUI.click(findTestObject("Object Repository/Workorder/Inventory/Inventory ID"))
		WebUI.click(findTestObject("Object Repository/Workorder/Inventory/Inventory replace button"))
		//WebUI.scrollToElement(findTestObject('Object Repository/Workorder/save workorder'), GlobalVariable.timeOut)
		WebUI.click(findTestObject("Object Repository/Workorder/save workorder"))
	}
}
