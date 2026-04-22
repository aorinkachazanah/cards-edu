import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable as GlobalVariable


Mobile.startExistingApplication('id.cazh.cards.edu')

Mobile.waitForElementPresent(findTestObject('Rekap Presensi - Guru/icon_rekap_presensi'), 20)
Mobile.tap(findTestObject('Rekap Presensi - Guru/icon_rekap_presensi'), 10)

Mobile.waitForElementPresent(findTestObject('Rekap Presensi - Guru/icon_rekap_presensi_mengajar'), 15)
Mobile.tap(findTestObject('Rekap Presensi - Guru/icon_rekap_presensi_mengajar'), 10)

Mobile.waitForElementPresent(findTestObject('Rekap Presensi - Guru/icon_bulan_mei'), 10)
Mobile.tap(findTestObject('Rekap Presensi - Guru/icon_bulan_mei'), 10)

Mobile.closeApplication()
