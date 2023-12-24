Feature: validating registration page of adactin hotel app

Scenario: validating with valid information
Given: user should start "chrome" browser 
Given: user should launch adactin app using url"https://adactinhotelapp.com/Register.php#" 
When: user should enter username "neeliganesh" in textbox using url "//input[@id='username']"
When: user should enter password "Ganesh@123" in textbox using url "//input[@id='password']"
When: user should enter confirmpassword "Ganesh@123" in textbox using url "//input[@id='re_password']"
When: user should enter fullname "neeliganesh" in textbox using url "//input[@id='full_name']"
When: user should enter emailid "ganesh@gmail.com" in textbox using url "//input[@id='email_add']"
When: user should enter captcha using url "//input[@id='captcha-form']"
When: user should click the checkbox using url "//input[@id='tnc_box']"
When: user should click on register button using url "//input[@id='Submit']"
Then: verify the titile of the page to be "Adactin.com - New User Registration"