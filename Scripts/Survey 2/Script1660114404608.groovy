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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pbe-devs-at.4a-side.zone/')

WebUI.setText(findTestObject('Object Repository/Page_Porsche/input_Name_username'), 'porsche1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Porsche/input_Password_password'), 'I/nOddCPbI9O/y2tIGKjNw==')

WebUI.click(findTestObject('Page_Porsche/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Porsche - Worldwide/div_Iberia'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/a_CP Almeria (ES)'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/a_Create. Future. Performance_back'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Porsche/select_M1                    M2            _7fab48'), 
    'dealersView_v2.php?surveyOrder=7&fm=7&sm=8&idRegion=3', false)

WebUI.click(findTestObject('Object Repository/Page_Porsche/a_CP Almeria (ES)_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/a_Survey n8'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Start Survey'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am proud to tell others that I am p_3ba5ad'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am happy to tell my friends that my_b5a2c2'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I care about the future of my Porsche_31650c'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_We share all relevant information wit_3f013d'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_We feel like one team_question-5'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-6'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_We feel adequately prepared for chang_b8e1ab'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I rarely have to work overtime to fin_fea676'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I believe I am given adequate time to_1aa1e1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I think the jobs at my Centre are sec_87abd1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_In my opinion, the future of Porsche _b98d5e'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_In my opinion, the future of my Porsc_5ae24a'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-13'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-14'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_A positive customer experience is abs_1f69ed'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-16'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I know what I can personally do to pr_48b91e'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/tbody_The customers experience in our Porsc_1e6a57'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I have all the skills to provide an o_fac89a'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I have already received  will soon re_c58378'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_We are very good at listening to cust_4b87c8'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_We are regularly utilizing customer f_e25e7c'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Our customers satisfaction is assesse_49b574'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_At my Porsche Centre, customers that _835337'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I know that I will need training to c_4af62a'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_It is important for me to upskill as _cbc4e4'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am provided with all the training I_5665d5'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_The Porsche Academy gives me all the _aef28b'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-28'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_The product related trainings I recei_9fe221'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-30'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am very satisfied with the virtual _50a490'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am happy about the development towa_704fcd'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I believe the Porsche CI update is be_3612fd'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-34'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I believe that the way we work as a t_22016c'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am curious about the positive impac_b0e3c4'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-37'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_The way in which the information abou_4cc0e8'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am well informed about the progress_9db7e1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I need training measures for successf_9ec7b4'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I have already received  will soon re_ec62c7'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am well prepared to continue comple_dce9d7'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_My daily work has been positively inf_406b19'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_The way we work as a team has positiv_6566a3'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-45'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-46'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_All in all, implementing the CI Updat_00186d'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I believe that online vehicle sales a_b52a51'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I believe that the introduction of on_9d481f'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-50'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_We have to implement online vehicle s_26c77a'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am comfortable that the Porsche bra_cc3767'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-53'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-54'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-55'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_We have to implement these new job ro_529000'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_At my Porsche Centre, all employees h_71d8e6'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-58'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_My job role  job roles correspond 100_cc6e15'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I know the responsibilities of all ne_aada54'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-61'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I need training measures to successfu_a8276f'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I have already received  will soon re_20fefe'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am provided with all resources nece_6466aa'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-65'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_In my opinion, E-Performance embodies_9e0982'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_In our Porsche Centre, everyone is en_87f154'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I see the opportunities that E-Perfor_02a949'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Our management team inspires with the_34b404'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I have all the necessary knowledge an_607d32'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I have already received  will soon re_dce2c7'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I feel very confident discussing E-Pe_59df44'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I know the local charging infrastruct_e83135'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_In my Porsche Centre, we have defined_622ed4'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-75'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_concat(I actively promote our Porsche_ae8f78'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-77'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am aware of the contents and goals _d525b8'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I know how I can personally contribut_3ae1bf'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-80'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am well informed about the contents_e03153'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I believe that our local strategy is _a98956'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am aware of the upcoming Porsche br_91ddf4'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I know about the contents and goals o_6572f2'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I know how I can personally contribut_9b952f'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am curious about the positive impac_7773e9'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_I am not concerned about the changes _e2bb80'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-88'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-89'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-90'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Strongly agree_question-91'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Service Department_department-92'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Workshop_question-93-department-1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Service Department_question-93-department-2'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Sales department_question-93-department-4'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/td_3  three times a week and more frequently'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Workshop_question-94-department-1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/td_1  very dissatisfied'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/td_2  satisfied'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Sales department_question-94-department-4'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_Administration_question-94-department-5'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_SQ 1_specific-81'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_SQ 2_specific-82'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_SQ 3_specific-83'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_SQ 4_specific-84'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/input_SQ 5_specific-85'))

WebUI.click(findTestObject('Object Repository/Page_Porsche/button_Send'))

WebUI.closeBrowser()

