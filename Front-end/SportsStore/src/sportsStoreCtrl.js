(function (module) {

    var sportsStoreCtrl = function ($firebaseObject) {
        var vm = this;

        var ref = firebase.database().ref();

        vm.data = $firebaseObject(ref);
    };

    module.controller("sportsStoreCtrl", sportsStoreCtrl);

}(angular.module("sportsStore")));