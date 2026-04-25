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

Mobile.waitForElementPresent(findTestObject('Tugas - Murid/button_akademik_murid'), 20)
Mobile.tap(findTestObject('Tugas - Murid/button_akademik_murid'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Murid/button_tugas_murid'), 20)
Mobile.tap(findTestObject('Tugas - Murid/button_tugas_murid'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Murid/tab_tugas_selesai (1)'), 20)
Mobile.tap(findTestObject('Tugas - Murid/tab_tugas_selesai (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Murid/pilih_tugas_yang_diedit'), 20)
Mobile.tap(findTestObject('Tugas - Murid/pilih_tugas_yang_diedit'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Murid/button_edit_tugas'), 20)
Mobile.tap(findTestObject('Tugas - Murid/button_edit_tugas'), 0)

Mobile.setText(findTestObject('Tugas - Murid/edit_jawaban_tugas'), 'Berikut adalah link drive jawaban latihan soal IPS https://drive.google.com/drive/folders/1iQhYSUZK1eXnwXnAPZEF86i6oyoM8aCB?usp=drive_link', 10)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Tugas - Murid/simpan_perubahan_tugas'), 20)
Mobile.tap(findTestObject('Tugas - Murid/simpan_perubahan_tugas'), 0)

