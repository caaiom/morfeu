var app = angular.module('morfeu', []);
var url = "/generate";

app.controller('GenerateCtrl', function($scope, $http) {
    $scope.data = {
        selectedLanguage: null,
        availableLanguages: [
            {value: "java", name: "Java"},
            {value: "python", name: "Python"},
            {value: "ruby", name: "Ruby"},
            {value: "javascript", name: "Javascript (Node.js)"}
        ],
        selectedDatabase: null,
        availableDatabases: [
            {value: "mysql", name: "MySQL"},
            {value: "postgres", name: "PostgreSQL"},
            {value: "oracle", name: "Oracle"}
        ],
        connection: ""
    };

    $scope.servicePayload = {
        language : "",
        database: "",
        connection: ""
    };

    $scope.selectedDatabase = $scope.data.availableDatabases[0].value;
    $scope.selectedLanguage = $scope.data.availableLanguages[0].value;

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