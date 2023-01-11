Feature: To order the food in Bisto Bites application

Background:
Given To launch the chrome browser and maximize the window
When To launch the url of the Bisto Bite application


@1
Scenario: To validate the login functionality of Bisto Bites with the invalid “Username” and “Password”

When To click the Account button
And To enter the wrong Username in mobile field
And To enter the wrong Password in password field
And To click the login button
And To check the output as Invalid Mobile No
Then To close the Browser


@2
Scenario: To order Dosa

And To click the HOME button on the home page
And To click the Dosa button in drop down box
And  To select the Masala Dosa option
And  To enter the page and check the Available Time
Then To close the Browser

@3
Scenario: To fill out the registration form and ignores the confirm password

And  To click the Account
And To fill out the registration form with dummy data(name, phone number, email…)
And To click the register button
And To check the output in the pop-up box as Please fill out the field
Then To close the Browser


@4
Scenario: To search for the Coke can and check the price

And To click the search icon
And To search Coke and check the can dollar price
Then To close the Browser


@5
Scenario: To select the Spanish Omelet

And To click the Search icon
And To select the option by probability
And To check the dollar probability
Then To close the Browser


@6
Scenario: To read Our Story

And To click the Our Story option
And To check the spelling mistake
Then To close the Browser