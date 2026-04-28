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
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

Mobile.startExistingApplication('id.cazh.cards.edu')
def driver = MobileDriverFactory.getDriver()

Mobile.waitForElementPresent(findTestObject('Registrasi dengan Google - Guru/button_google'), 20)
Mobile.tap(findTestObject('Registrasi dengan Google - Guru/button_google'), 0)

Mobile.delay(6)

driver.findElement(By.xpath('//*[@text="aorinkanendya@gmail.com"]')).click()

Mobile.setText(findTestObject('Registrasi dengan Google - Guru/masukkan_nomor_handphone'), '8', 10)

// Tekan backspace via ADB
'adb shell input keyevent 67'.execute()

Mobile.delay(1)
Mobile.hideKeyboard()

// Validasi pesan error
Mobile.delay(2)
def errorMsg = driver.findElement(By.xpath('//*[@text="Nomor Handphone wajib diisi"]'))
assert errorMsg.isDisplayed() : "Pesan error tidak muncul!"

Mobile.closeApplication()