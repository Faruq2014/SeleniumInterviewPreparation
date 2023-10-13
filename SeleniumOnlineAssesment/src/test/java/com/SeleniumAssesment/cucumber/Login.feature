
@login
#what is feature
#  feature is kind of high level requirements--learn agile
Feature: I want to build login functionality

  @smoke @regression
  Scenario: As a user I want to have login credential
    so that only valid user can log in
#what is scenario--learn more
  #low level requirements
  # it has a structure-->As a user...pre condition
  #I want...action
  # so that...results
   
   
    Given user open Chrome Browser
    #what is given--it is a pre condition
    And user open facebook home page
    #what is And--it is another pre condition with given
    When user enter userName and password
    #what is When== action
    And user clik login button
    #what is And--it is another action with when
    Then user succesfully logged in
    #what is then==resuts-->validation-->expected results
    And user validate title
    #what is And--it is another results with then
    But user could not landing on home page
    #what is But--it is a negative results with then
    
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @dataDriven
  Scenario Outline: As a tester I want to have a dynamic login test
    so that multiple valid user can use
#what is Scenario Outlin==multiple tests running using same code
# it is data driven test in cucumber
    Given tester open facebook home page <url>
    #what is <>== this is parameter wher cucumber will provide 
    # test data in the mehods
    When tester enter <userName> and <password>
    Then I verify the <title> of the tester

    Examples: 
      | url                         | userName | password    | title                          |
      | "https://www.facebook.com/" | "Asma"   | "asma123"   | "Facebook - log in or sign up" |
      | "https://www.facebook.com/" | "Depty"  | "depty123"  | "Facebook - log in or sign up" |
      | "https://www.facebook.com/" | "Ishrak" | "ishrak123" | "Facebook - log in or sign up" |

#what is Examples== those are test data opganise by pipe silmol |