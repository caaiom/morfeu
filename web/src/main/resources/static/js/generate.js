var app = angular.module('morfeu', []);
var url = "/generate";

app.controller('GenerateCtrl', function($scope, $http) {
    $scope.data = {
        selectedLanguage: null,
        availableLanguages: [
            {id: "java", name: "Java"},
            {id: "python", name: "Python"},
            {id: "ruby", name: "Ruby"},
            {id: "javascript", name: "Javascript (Node.js)"}
        ],
        selectedDatabase: null,
        availableDatabases: [
            {id: "mysql", name: "MySQL"},
            {id: "postgres", name: "PostgreSQL"},
            {id: "oracle", name: "Oracle"}
        ],
        connection: ""
    };

    $scope.servicePayload = {
        language : "",
        database: "",
        connection: ""
    };

    $scope.submit = function() {
        $scope.servicePayload.language = $scope.data.selectedLanguage;
        $scope.servicePayload.database = $scope.data.selectedDatabase;
        $scope.servicePayload.connection = $scope.data.connection;

        console.log($scope.servicePayload);

        $http.post(url, JSON.stringify($scope.servicePayload), {
            headers: {"Content-type":"application/json"}
        }).then(function() {
                console.log("success");
            }, function() {
                console.log("error");
            });
    };
});