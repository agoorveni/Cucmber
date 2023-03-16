$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Amazon1.feature");
formatter.feature({
  "name": "",
  "description": "To check the lgin functioality of the Amazon application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "To check the Amazon pageURL",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Amazon login URL",
  "keyword": "When "
});
formatter.match({
  "location": "AmazononeClass.launch_the_Amazon_login_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass the dats in email field",
  "rows": [
    {
      "cells": [
        "emailone",
        "Veni@gmail.com"
      ]
    },
    {
      "cells": [
        "emailtwo",
        "Vani@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AmazononeClass.pass_the_dats_in_email_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "continue btn need to be clicked",
  "keyword": "And "
});
formatter.match({
  "location": "AmazononeClass.continue_btn_need_to_be_clicked()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.AmazononeClass.continue_btn_need_to_be_clicked(AmazononeClass.java:34)\r\n\tat ✽.continue btn need to be clicked(src/test/resources/Amazon1.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Pass the code in the pass field",
  "rows": [
    {
      "cells": [
        "Passwordsone",
        "passwordtow"
      ]
    },
    {
      "cells": [
        "123",
        "456"
      ]
    },
    {
      "cells": [
        "334",
        "678"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AmazononeClass.pass_the_code_in_the_pass_field(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click sigin",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonClass.click_sigin()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});