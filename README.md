## Test Automation Basic Demo
This project was created to demonstrate my ability to build automated functional, and integration test framework from scratch.

	* Integration Testing:
		found in "src/test/java/integration" demonstrates initial code which can be used to build a scalable integration test automation framework for a REST API using Rest-Assured. It tests the API: https://swapi.dev/api

	* Functional Tests:
		found in "src/test/java/functional", includes the initial code written to demonstrate how to build a functional test automation framework using the Page Object Model with selenium webdriver to launch and interact with a locally installed browser (only chrome and firefox have been configured for this demo) in order to automate functional testing. The url used for this demo is: https://www.rank.com/

## Required software
	* Java JDK 8
	* Gradle v6.7+
	* Either chrome or firefox browser installed

## How to execute the tests
	Single test:
	* Navigate to the project root folder using terminal or commandline.
	
	* To run a single API test, i.e. the GetFilmTest. Execute the following: 
		gradle test --tests integration.testSuite.film.GetFilmTest
		
	* To run a single UI test, i.e. the MeccaLoginTest. Execute the following: 
	gradle test -Dbrowser="firefox" --tests functional.testSuite.MeccaLoginTest
	
	note: (browser options are either firefox or chrome for this demo)
	
	Test Suite:
	* To run API tests:
		gradle test -Psuite1 
	* To run ui tests:
		gradle test -Psuite2
	* To run all tests:
		gradle test -Psuite1 -Psuite2

## Reporting
	This project uses Extent Report to automatically generate the test report. Reports can be found in the extentReports folder in the root directory