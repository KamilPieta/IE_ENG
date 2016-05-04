/**
 * Created by k on 04.05.2016.
 */
var emailvar = angular.module('mailApp', []);
emailvar.controller('EmailController', function($scope) {
    $scope.isPopupVisible = false;
    $scope.isComposePopupVisible = false;
    $scope.composeEmail = {};
    $scope.activeTab = "inbox";
    $scope.sentEmails = [];

    $scope.sendEmail = function() {
        $scope.isComposePopupVisible = false;
        $scope.composeEmail.from = "me";
        $scope.composeEmail.date = new Date();
        $scope.sentEmails.push($scope.composeEmail);
    };

    $scope.showComposePopup = function() {
        $scope.composeEmail = {};
        $scope.isComposePopupVisible = true;
    };
    $scope.closeComposePopup = function() {
        $scope.isComposePopupVisible = false;
    };
    $scope.showPopup = function(email) {
        $scope.isPopupVisible = true;
        $scope.selectedEmail = email;
    };

    $scope.closePopup = function() {
        $scope.isPopupVisible = false;
    };

    $scope.emails = [
        { from: 'John', subject: 'I love angular', date: 'Jan 1', body: 'hello world!' },
        { from: 'Jack', subject: 'Angular and I are just friends', date: 'Feb 15', body: 'just kidding' },
        { from: 'Ember', subject: 'I hate you Angular!', date: 'Dec 8', body: 'wassup dude' }
    ];
});