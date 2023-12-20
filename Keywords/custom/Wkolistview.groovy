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

public class Wkolistview {

	@Keyword
	def workorderlist() {


		WebUI.click(findTestObject("Object Repository/Workorder/Menuicon"))
		WebUI.click(findTestObject("Object Repository/Workorder/workordericon"))
		WebUI.click(findTestObject("Object Repository/Workorder/Workordersub"))
		WebUI.click(findTestObject("Object Repository/WKO listview/listview ellipsis"))
		WebUI.click(findTestObject("Object Repository/WKO listview/Listviewexpander"))
		WebUI.click(findTestObject("Object Repository/WKO listview/Add icon"))
		//WebUI.click(findTestObject("Object Repository/WKO listview/layout dropdown"))
		//WebUI.click(findTestObject("Object Repository/WKO listview/ID and description layout"))
		WebUI.click(findTestObject("Object Repository/WKO listview/Description"))
		WebUI.sendKeys(findTestObject("Object Repository/WKO listview/Description"),'TestListview')
		WebUI.click(findTestObject("Object Repository/WKO listview/save"))
	}
}

