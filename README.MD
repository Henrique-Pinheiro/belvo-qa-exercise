# Resolution for Belvo Techincal challenge

**This project delivery a lean testing automation structure and the resolution of the proposed belvo techinical challange using java and some Design Patterns and Good Practices**

Execução Local:
![Exemplo](local_execution.gif)

## Languages and Frameworks
* [Java 11](https://openjdk.java.net/projects/jdk/11/) as the programming language
* [TestNG](https://testng.org/doc/) as the UnitTest framework to support the test creation and the integration with cucumber
* [JavaFaker](https://github.com/DiUS/java-faker) as the faker data generation strategy
* [WebDriverManager](https://github.com/bonigarcia/webdrivermanager) as the Selenium binaries management
* [Owner](http://owner.aeonbits.org/) to minimize the code to handle the properties file
* [Seleium WebDriver](https://www.selenium.dev/)  as the web browser automation framework using the Java binding
* [Cucumber](https://cucumber.io/) Cucumber is a tool that supports Behaviour-Driven Development(BDD) and in this case its used to write automated test case in a more natural way so the Stakedholders should know whats is being tested
* [Cluecumber Report](https://github.com/trivago/cluecumber-report-plugin) as the testing report strategy

## Test architecture

* [Page Objects pattern](#page-objects-pattern)
* [Fluent Style Pattern](#fluent-style-pattern)
* [Behavior Driven Development](#behaviorage-driven-development)
* [Configuration files](#configuration-files)


### Page Objects pattern
I will not explain the Page Object pattern because you can find a lot of good explanations and examples on the internet. 
Instead, I will explain what exactly about page objects I'm using in this project.

### Fluent Style Pattern
I will not explain the Page Object pattern because you can find a lot of good explanations and examples on the internet. 
Instead, I will explain what exactly about page objects I'm using in this project.

### Behavior Driven Development
I will not explain the Page Object pattern because you can find a lot of good explanations and examples on the internet. 
Instead, I will explain what exactly about page objects I'm using in this project.

### Configuration files
This project uses a library called [Owner](http://owner.aeonbits.org/). You can find the class related to the property 
file reader in the following classes:
* [Configuration]()
* [ConfigurationManager]()

There is just one  properties (configuration) file located on `src/main/java/resources/`:
* `general.properties`: general configuration as the base url, browser, timeout, headless and prints option

### Running the project

#### With plain Java + Maven
Run the command `mvn clean verify` in the root of the project 

#### With Docker
Bla bla bla