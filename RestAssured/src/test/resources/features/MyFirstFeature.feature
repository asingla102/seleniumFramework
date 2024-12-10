Feature: Claim Search Functionality

#  Scenario Outline: Positive test for adding two numbers
#    Given I have two numbers <number1> and <number2>
#    When I add these two numbers
#    Then Result should be <Result>
#    Examples:
#      |number1|number2|Result|
#      |90|30|120  |
#
#  Scenario Outline: Negative test for adding two numbers
#    Given I have two numbers <number1> and <number2>
#    When I add these two numbers
#    Then Result should be <Result>
#    Examples:
#      |number1|number2|Result|
#      |10|40|50 |
#      |90|30|120|

  Scenario Outline: Test Rest Assured API Test
    Given I have API endpoint "<uri>", username "<username>", password "<password>"
    When I passed claim id "<claimId>"
    Then I should retrieve correct status code <statusCode>
    And I should retrieve claim code "<claimCode>"
    Examples:
      |uri|username|password|claimId|statusCode|claimCode|
      |http://ntaut0a.us.oracle.com:8001/claims-ws/api/generic/claims/|testuser1|openzorg99|/7|200|CALC1|

