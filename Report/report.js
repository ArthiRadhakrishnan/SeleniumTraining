$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FbRegistration.feature");
formatter.feature({
  "name": "To validate the account creation of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To create new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "FbRegistration.to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "FbRegistration.to_launch_the_url_of_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the create new button",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_click_the_create_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the firstname in firstname text box",
  "rows": [
    {
      "cells": [
        "firstname1",
        "arthi"
      ]
    },
    {
      "cells": [
        "firstname2",
        "preethi"
      ]
    },
    {
      "cells": [
        "firstname3",
        "vijay"
      ]
    },
    {
      "cells": [
        "firstname4",
        "radha"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_pass_the_firstname_in_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the second name in secondname text box",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_pass_the_second_name_in_secondname_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass mobile number or email id in the email text box",
  "rows": [
    {
      "cells": [
        "password1",
        "password2",
        "password3"
      ]
    },
    {
      "cells": [
        "52f5sf2",
        "5f4sd6f5f",
        "dffsdf"
      ]
    },
    {
      "cells": [
        "asfdfd",
        "arfasf",
        "6554548"
      ]
    },
    {
      "cells": [
        "few487",
        "54sf4",
        "55555xcc"
      ]
    },
    {
      "cells": [
        "ffdsf",
        "54454",
        "fiuuju"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_pass_mobile_number_or_email_id_in_the_email_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To create new password using  newpassword text box",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_create_new_password_using_newpassword_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbRegistration.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});