# Test Automation Suite 

The following project demonstrate a list of test cases for amazon e commerce web application designed with the help automation tools.


Languages Used - Java 

Automation Tools - Selenium, TestNg  


## Packages Description

-com.AssignmentSelenium.pages: Describe a test pages consisting of all elements under test using page object model frameworks.

-com.AssignmentSelenium.tests: Describe a test cases for the given application under tests.



###Pages and Test files Used

***BestSellerPage and BestSellerTest

***BooksPage and BooksTest 

***ChangeCountryPage and ChangeCountryTest 
                          
***FireTVPage and FireTVTest

***LoginPage and LoginTest 

***NewReleasesPage and NewReleasesTest 

***PrimeVideoLoginPage and PrimeVideoLoginTest  

***RegisterPage and RegisterTest

***SearchElectronicsPage and SearchElectronicsTest 

***SearchMenShoesPage and SearchMenShoesTest 

***SearchMobilePage and SearchMobileTest 

***SearchTheProductPage and SearchTheProductTest 

***BaseTest


###BaseTest

- @BeforeSuite - Initialize ExtentReports and driver instances .
- @AfterSuite - End browser session and close reports .
- @BeforeTest - to open the extent report
- @BeforeMethod - To Open url, start the test report
- @AfterMethod - end the test report




## Starred Directories

- Drivers : ./driver
- Report File : ./Reports/ExtentReport.html
- Properties  File: ./resources/config.properties



## configuration.properties file 

- Url : URL of Site
- chromedriverProperty : driver used
- chromedriverPath :   file system address of driver file



###Reports

- Extent report gets generated after the run under Reports/ExtentReport.html

- TestNG report as "emailable-report.html" gets generated under \test-output


