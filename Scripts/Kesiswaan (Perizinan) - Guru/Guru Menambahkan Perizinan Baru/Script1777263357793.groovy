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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import org.openqa.selenium.OutputType

Mobile.startExistingApplication('id.cazh.cards.edu')

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/button_kesiswaan'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/button_kesiswaan'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/button_perizinan'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/button_perizinan'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/button_tambah_perizinan'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/button_tambah_perizinan'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/kolom_pengajuan_untuk'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/kolom_pengajuan_untuk'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_guru'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_guru'), 0)

Mobile.setText(findTestObject('Kesiswaan (Perizinan) - Guru/kolom_nama_izin'), 'Acara Keluarga', 10)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/kolom_tipe_izin'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/kolom_tipe_izin'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_lainnya'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_lainnya'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/kolom_durasi_izin'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/kolom_durasi_izin'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_lebih_dari_satu_hari'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_lebih_dari_satu_hari'), 0)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/button_tanggal_mulai'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/button_tanggal_mulai'), 0)
Mobile.delay(1)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/swipe_bulan'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/swipe_bulan'), 0)
Mobile.delay(1)

Mobile.swipe(540, 1200, 540, 400)
Mobile.delay(1)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_tanggal_mulai'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_tanggal_mulai'), 0)
Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/button_tanggal_selesai'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/button_tanggal_selesai'), 0)
Mobile.delay(1)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_tanggal_selesai'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_tanggal_selesai'), 0)
Mobile.delay(2)

// Scroll ke bawah untuk temukan button pilih foto
TestObject pilihFoto = findTestObject('Kesiswaan (Perizinan) - Guru/button_pilih_foto')
while (!Mobile.waitForElementPresent(pilihFoto, 2, FailureHandling.OPTIONAL)) {
    Mobile.swipe(500, 1500, 500, 500)
    Mobile.delay(1)
}
Mobile.tap(pilihFoto, 0)
Mobile.delay(2)

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_galeri'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/pilih_galeri'), 0)
Mobile.delay(5)

// Scroll galeri ke bawah agar foto lebih jelas
['adb', '-s', '3C25CK005QF00000', 'shell', 'input', 'swipe', '540', '1800', '540', '1400', '500'].execute()
Mobile.delay(2)

// Tap foto
['adb', '-s', '3C25CK005QF00000', 'shell', 'input', 'tap', '120', '1600'].execute()
Mobile.delay(3)

['adb', '-s', '3C25CK005QF00000', 'shell', 'input', 'tap', '858', '2150'].execute()
Mobile.delay(8)

Mobile.setText(findTestObject('Kesiswaan (Perizinan) - Guru/kolom_catatan'), 'Izin acara Keluarga', 10)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Kesiswaan (Perizinan) - Guru/button_ajukan'), 20)
Mobile.tap(findTestObject('Kesiswaan (Perizinan) - Guru/button_ajukan'), 0)