(function(){
  var app = angular.module("store", [ ]);

    var model = {
      user: "Forest",
      items: []
    };

    app.run(function ($http) {
        $http.get("todo.json").success(function (data) {
            model.items = data.items;
        });
    });

    app.controller("ToDoCtrl", function() {
      this.model = model;
      this.username = "nobody";
      this.comment = "This is the default comment";

      this.incompleteCount = function () {
        var count = 0;
        angular.forEach(model.items, function (item) {
          if (!item.done) { count++ }
         });
        return count;
      };

      this.addNewItem = function (actionText) {
        this.model.items.push({ action: actionText, done: false });
      };
    });

    app.filter("checkedItems", function () {
        return function (items, showComplete) {
            var resultArr = [];
            angular.forEach(items, function (item) {
                if (item.done == false || showComplete == true) {
                    resultArr.push(item);
                }
            });
            return resultArr;
        }
    });


})();
