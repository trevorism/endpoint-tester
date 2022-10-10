Feature: Context Root of this API
  In order to use the API, it must be available

  Scenario: ContextRoot https
    Given the endpoint-tester application is alive
    When I navigate to https://endpoint-tester.testing.trevorism.com/
    Then the API returns a link to the help page

  Scenario: Ping https
    Given the endpoint-tester application is alive
    When I navigate to /ping on https://endpoint-tester.testing.trevorism.com/
    Then pong is returned, to indicate the service is alive

