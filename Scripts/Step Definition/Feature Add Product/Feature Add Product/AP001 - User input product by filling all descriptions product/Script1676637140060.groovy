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

Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : 'studentqa3@binar.id'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : 'studentQA3'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Add Product/Navigate to add product'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Add Product/Input nama produk'), [('nama_produk') : 'Monitor\r\n'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Add Product/Input harga produk'), [('harga') : '100000'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Add Product/Input kategori'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Add Product/Input lokasi produk'), [('lokasi') : 'Bandung'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Add Product/Input Deskripsi'), [('deskripsi') : 'Oke'], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Add Product/Input photo produk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/User Add Product/Tap to terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Page_User Add Product/add_notifikasi_sukses'), 0)

