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

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/button_tambah_tugas_guru'), 20)
Mobile.tap(findTestObject('Tugas - Guru/button_tambah_tugas_guru'), 0)

Mobile.setText(findTestObject('Tugas - Guru/kolom_judul_tugas'), 'Latihan Soal IPS 1', 10)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/kolom_pilih_kelas_mengajar'), 20)
Mobile.tap(findTestObject('Tugas - Guru/kolom_pilih_kelas_mengajar'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/klik_kelas_mengajar'), 20)
Mobile.tap(findTestObject('Tugas - Guru/klik_kelas_mengajar'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/button_terapkan'), 20)
Mobile.tap(findTestObject('Tugas - Guru/button_terapkan'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/pilih_tanggal_pengumpulan'), 20)
Mobile.tap(findTestObject('Tugas - Guru/pilih_tanggal_pengumpulan'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/swipe_tanggal'), 20)
Mobile.tap(findTestObject('Tugas - Guru/swipe_tanggal'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/pilih_tanggal'), 20)
Mobile.tap(findTestObject('Tugas - Guru/pilih_tanggal'), 0)

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/pilih_waktu_pengumpulan'), 20)
Mobile.tap(findTestObject('Tugas - Guru/pilih_waktu_pengumpulan'), 0)


Mobile.waitForElementPresent(findTestObject('Tugas - Guru/simpan_batas_waktu'), 20)
Mobile.tap(findTestObject('Tugas - Guru/simpan_batas_waktu'), 0)

Mobile.setText(findTestObject('Tugas - Guru/kolom_deskripsi_tugas'), 'Kerjakan dengan baik', 10)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Tugas - Guru/button_simpan_pembuatan_tugas'), 20)
Mobile.tap(findTestObject('Tugas - Guru/button_simpan_pembuatan_tugas'), 0)

Mobile.pressBack()
Mobile.pressBack()

