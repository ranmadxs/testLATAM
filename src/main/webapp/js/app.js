var app = angular.module('TestLatamApp', ['ngRoute', 'ngResource']);

app.factory('weatherService', function ($resource) {
    return $resource('/weather/find', { city: '@city' , units : '@units'}, {
        find: { method: 'POST' } 
    });
});