/**
 * Created by k on 02.05.2016.
 */
'use strict';
var app = angular.module('app', ['pascalprecht.translate']);

app.config(function ($translateProvider) {
    $translateProvider.fallbackLanguage('en');
    $translateProvider.registerAvailableLanguageKeys(['en', 'pl'], {
        'en_*':'en',                    //dla wariacji jezykow np brytyjski itp zwraca sufrix wiec dopasowujemy prefix do wzoru
        'pl_*':'pl'
    })
    $translateProvider.translations('en', {
        CONTENT_MENU_1:"Home",
        CONTENT_MENU_2:"About",
        CONTENT_MENU_3:"Expirience",
        CONTENT_MENU_4:"Skills",
        CONTENT_MENU_5:"Statistic",
        CONTENT_MENU_6:"Programs",
        CONTENT_MENU_7:"Contact me",
        CONTENT_MY_NAME1:"My name is Kamil Pieta ",
        CONTENT_MY_NAME2:"Im a third year student of Computer Science at AGH Univeristy of Science and Technology in Cracow",
        DESCRIPTION1:"Im intrested in Java C/C++ SQL  \n Satisfied client is the prority in my work \n Im fluently speaking in English language",
        SCHOOL:"AGH Unversity of Science and Technology",
        SPECIALIZATION:"Computer Science at WIMiIP",
        CONTENT_SKILL:"Member of a university project in metalsoft",
        SALESMAN:"Salesman",
        DATA_TKMAXX:"TK Max - 01.09.2014 - 01.03.2015",
        WORK_DETAIL1:"Multitasking character of work. ",
        WORK_DETAIL2_TITTLE:"CREATIVE DESIGN STUDIO",
        WORK_DETAIL2:"project for the first year student",
        WORK_DETAIL2_SUBTITTLE:"Home Development",
        BUTTON_LANG_EN:"angielski",
        BUTTON_LANG_PL:"polski"
    });
    $translateProvider.translations('pl', {
        CONTENT_MENU_1:"Strona Glowna",
        CONTENT_MENU_2:"O mnie",
        CONTENT_MENU_3:"Doswiadczenie",
        CONTENT_MENU_4:"Umiejetnosci",
        CONTENT_MENU_5:"Statystyki",
        CONTENT_MENU_6:"Programy",
        CONTENT_MENU_7:"Kontakt",
        CONTENT_MY_NAME1:"Nazywam sie Kamil Pieta ",
        CONTENT_MY_NAME2: "Jestem studentem 3 roku Informatyki Stosowanej na Akademii Górniczo Hutniczej w Krakowie",
        DESCRIPTION1:"Zajmuje się programowaniem w językach Java C/C++ HTML/CSS \n Najważniejszym celem mojej pracy jest pełna staysfakcja klienta \n Posługuje się biegle językiem angielskim",
        SCHOOL:"Akademia Gorniczo Hutnicza w Krakowie",
        SPECIALIZATION:"Informatyka Przemyslowa Wydzial Inzynierii Metali i Informatyki Przemyslowej 2013-dotychczas",
        CONTENT_SKILL:"Udzial w projektach grupy naukowej MetalSoft",
        SALESMAN:"Sprzedawca",
        DATA_TKMAXX:"TK Max - 01.09.2014 - 01.03.2015",
        WORK_DETAIL1:"Praca miala charakter multizadaniowy: Od obslugi klienta, porzadkowania sklepu, po przebudowy sklepu oraz prace na magazynie",
        WORK_DETAIL2_TITTLE:"CREATIVE DESIGN STUDIO",
        WORK_DETAIL2:"przykladowe zlecenia do uzupelnienia",
        WORK_DETAIL2_SUBTITTLE:"Praca w domu",
        BUTTON_LANG_EN:"angielski",
        BUTTON_LANG_PL:"polski"
    });
    $translateProvider.useSanitizeValueStrategy('escape');
    $translateProvider.preferredLanguage('pl');
});
app.controller('LangController',['$scope','$translate',function($scope,$translate){
        $scope.changeLanguage = function(key){
            $translate.use(key);
        };
}]);

app.controller('test1Ctr',['$scope','$http', function ($scope, $http) {
            $scope.mailData = {
                name : '',
                mailID :'',
                subject : '',
                adressfrom :'',
                content: '',
                date:'',
                info:''
                 };

            $scope.submitForm = function () {
                console.info("fun start");
                var ajax = $http.post('/mail/swiftMailer', $scope.mailData);
                ajax.success(function (data) {
               $scope.mailData.info=("mail sent: " + data.message);
                });
                console.info("fun finish");
            }
        }]);

app.controller('ProgramController',['$scope','$http', function ($scope,$http){

$scope.programList =[
    {
        id: '1',
        authors: 'Kamil',
        desc: 'opis blakvskldnvl asdkjasklncx'},
    {
        id: '2',
        authors: 'Romek',
        desc: 'opis 2 to jest opis super opis'},
    {
        id: '3',
        authors: 'Atomek',
        desc: 'opis 43  sadasdnmlsandjkasbnfjaskbfjas'},
        ];

$scope.sendProgram = function () {
    console.info("program sended");
    $scope.programList.push( $scope.program);
    $scope.program='';
}
    $scope.removeProgram = function (){

    }



}]);