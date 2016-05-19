/**
 * Created by k on 17.05.2016.
 */

(function () {
    'use strict';
    angular.module('app2')
        .controller('test1-ctr', function ($scope, $http) {
            $scope.mailData = {
                name : '',
             mailID :'',
            subject : '',
            adressfrom :'',
            content: '',
            date:''
            };
            
            $scope.submitForm = function () {
                console.info("fun start");
                var ajax = $http.post('/mail/swiftMailer', $scope.mailData);
                ajax.success(function (data) {
                    console.info("mail sent: " + data);
                });
                console.info("fun finish");
            }
        })
})();