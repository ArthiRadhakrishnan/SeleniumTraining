Feature: To validate the account creation of facebook application

@Sanity
Scenario: To create new account
Given To launch the browser and maximize the window
When To launch the url of facebook application
And To click the create new button

#one dimensional map data
And To pass the firstname in firstname text box
#key  			value
|firstname1 | arthi |
|firstname2 | preethi|
|firstname3 | vijay |
|firstname4 | radha |

And To pass the second name in secondname text box

#Two dimensional map data
And To pass mobile number or email id in the email text box
|password1 |password2 |password3  |
|52f5sf2   |5f4sd6f5f |dffsdf     |
|asfdfd    |arfasf    |6554548    |
|few487    |54sf4     |55555xcc   |
|ffdsf     |54454     |fiuuju     |


And To create new password using  newpassword text box
Then To close the chrome browser

