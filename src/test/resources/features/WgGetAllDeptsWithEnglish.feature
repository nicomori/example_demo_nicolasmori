@Regression @wg_get_all
Feature: Twitter - interview Nicolas Mori

Scenario Outline: Access to twitter and write a post.

#Given I start to the browser and set this url "<url>"
#And I set the name of the city "<city>"
#Then I select the option of dept type and set "<deptType>" press the button find
#Then I set the max value of rent to pay with the value "<maxRentValue>" and press the button apply filter
#And I access to the options of depart
#And I check if the british falg exit
#And I take if exist the value of requisites and show in the screen

	Given I start the browser 
	And I access to this url "<url>"
	And I set the name of the city "<city>"
	And I select the value from the suggestions list with the city "<city>"
	And I press the button search
	#And I login to the web application 
	#Then I press in the menu Transfers 
	#And I select te first of my favorites contacts 
	#And I set in the amount field the amount 
	#And I include in the text reference this test 
	#And I access the Transfer Code 
	#And I press the button Transfer 
	#Then I check if I can see the pop up message. 

Examples:
| browser 	| city  	| url						 	| deptType		| maxRentValue  |
| chrome  	| München   | http://www.wg-gesucht.de/		| WG-Zimmer		| 750			|




#1-Zimmer-Wohnung
#Wohnung
#Haus