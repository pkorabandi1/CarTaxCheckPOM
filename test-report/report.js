$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("carcheck.feature");
formatter.feature({
  "line": 1,
  "name": "Test the cartaxcheck for given input files",
  "description": "",
  "id": "test-the-cartaxcheck-for-given-input-files",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test the car tax check site for the given file",
  "description": "",
  "id": "test-the-cartaxcheck-for-given-input-files;test-the-car-tax-check-site-for-the-given-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the list of car registration numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "registration number is submitted",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#\tThen the relevant car details are obtained"
    }
  ],
  "line": 8,
  "name": "the car details match the details from the file",
  "keyword": "Then "
});
formatter.match({
  "location": "CarCheckStepDef.the_list_of_car_registration_numbers()"
});
formatter.result({
  "duration": 265826200,
  "status": "passed"
});
formatter.match({
  "location": "CarCheckStepDef.registration_number_is_submitted()"
});
formatter.result({
  "duration": 27282901900,
  "status": "passed"
});
formatter.match({
  "location": "CarCheckStepDef.the_car_details_match_the_details_from_the_file()"
});
formatter.result({
  "duration": 74973500,
  "status": "passed"
});
});