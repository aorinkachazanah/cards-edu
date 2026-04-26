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

Mobile.waitForElementPresent(findTestObject('Isi Kartu - Murid/button_isi_kartu_murid'), 20)
Mobile.tap(findTestObject('Isi Kartu - Guru/button_isi_kartu_murid'), 0)

Mobile.setText(findTestObject('Isi Kartu - Murid/masukkan_nominal'), '15.000', 10)
Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Isi Kartu - Murid/pilih_metode_pembayaran'), 20)
Mobile.tap(findTestObject('Isi Kartu - Murid/pilih_metode_pembayaran'), 0)

Mobile.waitForElementPresent(findTestObject('Isi Kartu - Murid/pilih_virtual_account'), 20)
Mobile.tap(findTestObject('Isi Kartu - Murid/pilih_virtual_account'), 0)

Mobile.tap(findTestObject('Isi Kartu - Murid/button_proses'), 0)
Mobile.delay(3)

// Verifikasi sukses - cek apakah muncul halaman sukses atau pesan berhasil
boolean berhasil = Mobile.waitForElementPresent(
    findTestObject('Isi Kartu - Murid/pesan_berhasil'), 5, FailureHandling.OPTIONAL)

if (berhasil) {
    Mobile.comment('PASSED - Transaksi isi kartu berhasil')
} else {
    Mobile.comment('FAILED - Transaksi gagal, app crash atau tidak ada konfirmasi')
    // Paksa test case gagal
    assert false, 'Transaksi isi kartu gagal - app crash'
}

Mobile.pressBack()
Mobile.pressBack()
