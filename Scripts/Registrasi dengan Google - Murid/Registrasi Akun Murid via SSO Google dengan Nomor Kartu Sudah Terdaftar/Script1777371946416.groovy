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

Mobile.waitForElementPresent(findTestObject('Registrasi dengan Google - Murid/button_google'), 20)
Mobile.tap(findTestObject('Registrasi dengan Google - Murid/button_google'), 0)

Mobile.delay(6)

driver.findElement(By.xpath('//*[@text="chazanahaorin@gmail.com"]')).click()

Mobile.setText(findTestObject('Registrasi dengan Google - Murid/masukkan_nomor_handphone'), '85844221133', 10)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Registrasi dengan Google - Murid/lanjutkan_nomor_handphone'), 20)
Mobile.tap(findTestObject('Registrasi dengan Google - Murid/lanjutkan_nomor_handphone'), 0)

Mobile.setText(findTestObject('Registrasi dengan Google - Murid/masukkan_nomor_kartu'), '1002050501601786', 10)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Registrasi dengan Google - Murid/lanjutkan_nomor_kartu'), 20)
Mobile.tap(findTestObject('Registrasi dengan Google - Murid/lanjutkan_nomor_kartu'), 0)

Mobile.setText(findTestObject('Registrasi dengan Google - Murid/masukkan_pin_kartu'), '677522', 10)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Registrasi dengan Google - Murid/button_aktivasi'), 20)
Mobile.tap(findTestObject('Registrasi dengan Google - Murid/button_aktivasi'), 0)

// Validasi pesan error
Mobile.delay(2)
def errorMsg = driver.findElement(By.xpath('//*[@text="Nomor Kartu sudah terdaftar"]'))
assert errorMsg.isDisplayed() : "FAILED: Pesan error yang muncul bukan Bahasa Indonesia - bug ditemukan!"

Mobile.closeApplication()