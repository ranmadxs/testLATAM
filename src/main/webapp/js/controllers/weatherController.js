app.controller('WeatherController', function($http, $scope, $location,
	$rootScope, $q, weatherService) {
	console.info(">> Init ", "WeatherController");

	$scope.weather = {
		city : "Medellin",
		country : "CO",
		latitude : 6.25,
		longitude : 89.3,
		currentWeather : 20,
		windSpeed : 4.1
	};

	$scope.data = {
		cities : [
			{
				id : 'Medellin',
				name : 'Medellin'
			},
			{
				id : 'London',
				name : 'London'
			}
		]
	}

	$scope.getWeather = function() {
		console.log("selectedCity=" + $scope.selectedCity + ", selectedUnit=" + $scope.selectedUnit, "WeatherController->getWeather");
		
		weatherService.find({ city: $scope.selectedCity, units : $scope.selectedUnit }, function (data) {  
			$scope.weather.city = data.city;
			$scope.weather.country = data.country;
			$scope.weather.latitude = data.latitude;
			$scope.weather.longitude = data.longitude;
			$scope.weather.currentWeather = data.currentWeather;
			$scope.weather.windSpeed = data.windSpeed;
	     });
	     
	};

});