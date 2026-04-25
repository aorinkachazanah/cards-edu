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

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/button_akademik_guru'), 20)
Mobile.tap(findTestObject('Tugas - Guru/button_akademik_guru'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/button_tugas_guru'), 20)
Mobile.tap(findTestObject('Tugas - Guru/button_tugas_guru'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/pilih_tugas_yang_dinilai'), 20)
Mobile.tap(findTestObject('Tugas - Guru/pilih_tugas_yang_dinilai'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/tab_data_murid'), 20)
Mobile.tap(findTestObject('Tugas - Guru/tab_data_murid'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/klik_murid_yang_dinilai'), 20)
Mobile.tap(findTestObject('Tugas - Guru/klik_murid_yang_dinilai'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/input_nilai'), 20)
Mobile.tap(findTestObject('Tugas - Guru/input_nilai'), 0)

Mobile.setText(findTestObject('Tugas - Guru/masukkan_nilai'), '90', 10)

// Langsung tap Simpan tanpa hideKeyboard
Mobile.waitForElementPresent(findTestObject('Tugas - Guru/simpan_nilai'), 20)
Mobile.tap(findTestObject('Tugas - Guru/simpan_nilai'), 0)

