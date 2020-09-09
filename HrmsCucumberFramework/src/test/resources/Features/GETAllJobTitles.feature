Feature: Validating /jobTitle.php HRMS API
Background:
Given user generates token
@GETAllJobTitles
Scenario: Retrieving all job Titles using /jobTitle.php API
Given user calls jobTitle API to retrieve all job titles
When User retrieves response for jobTitle API to retrieve all job titles
Then status code is 200 for getalljobtitles API
Then user validates getalljobtitles  exists