$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/BNSDataTable.feature");
formatter.feature({
  "name": "BNS signup form fillup functionality",
  "description": "  Useer wants to create a new account on BNS webpage",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BNSPOMDataTable"
    }
  ]
});
formatter.scenario({
  "name": "Creating new account signup on BNS webpage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BNSPOMDataTable"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on BNS signup webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "BNSDataTableStep.user_is_on_BNS_signup_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will enter data from following table",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Password",
        "Phone"
      ]
    },
    {
      "cells": [
        "Ataur",
        "Tarafder",
        "ata@yahoo.com",
        "der45",
        "347-444-2890"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "BNSDataTableStep.user_will_enter_data_from_following_table(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will select data from following table",
  "rows": [
    {
      "cells": [
        "Month",
        "May"
      ]
    },
    {
      "cells": [
        "Day",
        "20"
      ]
    },
    {
      "cells": [
        "Year",
        "2001"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "BNSDataTableStep.user_will_select_data_from_following_table(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will select from following table",
  "rows": [
    {
      "cells": [
        "Gender"
      ]
    },
    {
      "cells": [
        "Male"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "BNSDataTableStep.user_will_select_from_following_table(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "BNSDataTableStep.user_will_click_on_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get meaasge as following table",
  "rows": [
    {
      "cells": [
        "Message"
      ]
    },
    {
      "cells": [
        "Submitted Form Data"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BNSDataTableStep.user_should_get_meaasge_as_following_table(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});