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

public class Login {

	@Keyword
	def loginPage() {
		
		// Login

		WebUI.openBrowser(GlobalVariable.URL)
		WebUI.maximizeWindow()
		WebUI.sendKeys(findTestObject("Object Repository/HomePage/Login/Username"), GlobalVariable.Username)
		//WebUI.sendKeys(findTestObject("Object Repository/HomePage/Login/passWord"), GlobalVariable.Password)
		WebUI.click(findTestObject("Object Repository/HomePage/Login/loginButton"))
		WebUI.click(findTestObject("Object Repository/HomePage/Login/DBselection"))
		WebUI.click(findTestObject("Object Repository/HomePage/Login/continue"))
	}

	@Keyword
	def ForgetPassword() {

		WebUI.openBrowser(GlobalVariable.URL)
		WebUI.maximizeWindow()
		WebUI.click(findTestObject("Object Repository/HomePage/Forget pass/Forgotpassword"))
		WebUI.sendKeys(findTestObject("Object Repository/HomePage/Forget pass/EmailID"), GlobalVariable.Username)
		WebUI.click(findTestObject("Object Repository/HomePage/Forget pass/submit"))
	}
}
