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

Mobile.startExistingApplication('id.cazh.cards.edu')
Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Login dengan Nomor Kartu - Murid/button_masuk'), 20)
Mobile.tap(findTestObject('Login dengan Nomor Kartu - Murid/button_masuk'), 0)

Mobile.setText(findTestObject('Login dengan Nomor Kartu - Murid/masukkan_nomor_kartu'), '1002050501601786', 10)
Mobile.hideKeyboard()
Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Login dengan Nomor Kartu - Murid/klik_tombol_masuk'), 20)
Mobile.tap(findTestObject('Login dengan Nomor Kartu - Murid/klik_tombol_masuk'), 0)
Mobile.delay(3)

['adb', '-s', '3C25CK005QF00000', 'shell', 'input', 'text', '677521'].execute()
Mobile.delay(2)
['adb', '-s', '3C25CK005QF00000', 'shell', 'input', 'keyevent', '66'].execute()
Mobile.delay(5)

Mobile.comment('FAILED - BUG: Pesan error muncul dalam Bahasa Inggris (Incorrect card PIN.), seharusnya PIN Kartu salah')
assert false, 'BUG: Pesan error tidak sesuai - tampil dalam Bahasa Inggris bukan Indonesia'

Mobile.closeApplication()