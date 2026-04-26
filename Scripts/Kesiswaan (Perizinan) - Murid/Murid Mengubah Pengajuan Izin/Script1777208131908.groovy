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

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Murid/button_kesiswaan'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Murid/button_kesiswaan'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Murid/button_perizinan'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Murid/button_perizinan'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Murid/detail_perizinan'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Murid/detail_perizinan'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Murid/button_ubah_jadwal_izin'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Murid/button_ubah_jadwal_izin'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Murid/klik_ubah'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Murid/klik_ubah'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Murid/icon_ubah_tanggal'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Murid/icon_ubah_tanggal'), 0)
Mobile.delay(1)

// Swipe tanggal
Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Murid/swipe_bulan'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Murid/swipe_bulan'), 0)
Mobile.delay(1)

// Coba koordinat berbeda untuk scroll ke atas
Mobile.swipe(540, 1200, 540, 400)
Mobile.delay(1)

// Pilih tanggal
Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Murid/pilih_tanggal_izin'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Murid/pilih_tanggal_izin'), 0)

// Tunggu scroll otomatis selesai
Mobile.delay(2)

// Klik simpan
Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Murid/simpan_perubahan_izin'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Murid/simpan_perubahan_izin'), 0)



