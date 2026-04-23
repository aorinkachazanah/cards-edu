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

Mobile.startExistingApplication('id.cazh.cards.edu')

boolean clicked = false

for (int i = 0; i < 10; i++) {

	if (Mobile.waitForElementPresent(findTestObject('Pengumuman - Guru/lihat_semua_pengumuman_guru'), 2, FailureHandling.OPTIONAL)) {
		Mobile.tap(findTestObject('Pengumuman - Guru/lihat_semua_pengumuman_guru'), 10)
		clicked = true
		break
	}

	Mobile.swipe(500, 1500, 500, 500)
	Mobile.delay(1)
}

Mobile.verifyEqual(clicked, true)

Mobile.setText(findTestObject('Pengumuman - Guru/cari_pengumuman_guru'), 'Maintenance', 10)
Mobile.hideKeyboard()

Mobile.closeApplication()