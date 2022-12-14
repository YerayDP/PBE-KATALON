import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pbe-devs-at.4a-side.zone/')

WebUI.setText(findTestObject('Object Repository/Page_Porsche/input_Name_username'), 'porsche1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Porsche/input_Password_password'), 'I/nOddCPbI9O/y2tIGKjNw==')

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Porsche - Worldwide/div_Iberia'))

WebUI.selectOptionByValue(findTestObject('Page_Porsche/select_M1                    M2            _7fab48'), 'dealersView_v2.php?surveyOrder=7&fm=7&sm=8&idRegion=3', 
    false)

WebUI.click(findTestObject('Object Repository/Page_Porsche/a_CP Almeria (ES)'))

WebUI.closeBrowser()

