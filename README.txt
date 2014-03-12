This is a Grails application. In order to run and test it, you should have Grails 2.1.3 installed on your environment.

This is a very simple, yet very well tested, application. 
I have developed unit, integration and functional tests for my Grails code. 
I have also written JavaScript unit tests.
I have based the design of my tests on the test pyramid. 
You can find more about it in this presentation, created by me:
	http://www.slideshare.net/carlosgaso/types-of-tests

INSTRUCTIONS
Running the application
	$ grails run-app

Testing the application
	$ grails test-app

or run different test phases separately
	$ grails test-app :unit
	$ grails test-app :integration
	$ grails test-app :functional
	
To run JavaScript tests, run the application and go the Jasmine test page
	$ grails run-app
	