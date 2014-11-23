(function(){
  var app = angular.module("store", [ ]);

    var model = {
      user: "Nobody",
      items: [{ action: "Write angular demo app", done: false },
          { action: "Write the backend", done: false },
          { action: "Connect frontend with backend", done: false },
          { action: "Write a test driver for the FE", done: false },
          { action: "Add Testing with cucumber", done: false },
          { action: "Write a test driver for the BE ", done: false },
          { action: "Write a simulator for the FE", done: false },
          { action: "Write a simulator for the BE", done: false },
          { action: "Seperate the test data from the tests.", done: false },
          { action: "Create a recorder generator for the test data", done: false },
          { action: "Create a mock generator that uses test data", done: false },
          { action: "Create a configuration tool/format", done: false },
          { action: "Create a test runner that uses the configuration", done: false }]
  };


    app.controller("ToDoCtrl", function() {
      this.model = model;
      this.username = "nobody";
      this.comment = "This is the default comment";
    });

})();
