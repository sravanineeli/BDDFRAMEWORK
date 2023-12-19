Feature: validating login functionality of adactin hotel app

Scenario: validating login using valid creadentials
Given: user starts "chrome" browser
Given: user launch adactin app using url"https://adactinhotelapp.com/"
When: user enter username "neelisravani" in textbox using xpath "//input[@id='username']"
When: user enter password "Srav@pa1" in textbox using xpath "//input[@id='password']"
When: user click login button using xpath "//input[@id='login']"
Then: verify the title of the page to be "Adactin.com - Search Hotel"

Scenario: validating login using valid username and invalid password
Given: user starts "chrome" browser
Given: user launch adactin app using url"https://adactinhotelapp.com/"
When: user enter username "neelisravani" in textbox using xpath "//input[@id='username']"
When: user enter password "Srav@pa2" in textbox using xpath "//input[@id='password']"
When: user click login button using xpath "//input[@id='login']"
Then: verify the presence of text using xpath "//div[@class='auth_error']/b"
|error message|
|Invalid Login details or Your Password might have expired. Click here to reset your password|
Then: verify the title of the page to be "Adactin.com - Hotel Reservation System"

Scenario: validating login using invalid username and valid password
Given: user starts "chrome" browser
Given: user launch adactin app using url"https://adactinhotelapp.com/"
When: user enter username "neelisravanii" in textbox using xpath "//input[@id='username']"
When: user enter password "Srav@pa1" in textbox using xpath "//input[@id='password']"
When: user click login button using xpath "//input[@id='login']"
Then: verify the presence of text using xpath "//div[@class='auth_error']/b"
|error message|
|Invalid Login details or Your Password might have expired. Click here to reset your password|
Then: verify the title of the page to be "Adactin.com - Hotel Reservation System"

Scenario: validating login using invalid username and invalid password
Given: user starts "chrome" browser
Given: user launch adactin app using url"https://adactinhotelapp.com/"
When: user enter username "neelisravanii" in textbox using xpath "//input[@id='username']"
When: user enter password "Srav@pa2" in textbox using xpath "//input[@id='password']"
When: user click login button using xpath "//input[@id='login']"
Then: verify the presence of text using xpath "//div[@class='auth_error']/b"
|error message|
|Invalid Login details or Your Password might have expired. Click here to reset your password|
Then: verify the title of the page to be "Adactin.com - Hotel Reservation System"
