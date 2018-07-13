app.controller('WeatherController', function($http, $scope, $location,
	$rootScope, $q, weatherService) {
	console.info(">> Init ", "WeatherController");

	$scope.weather = {
		city : "",
		country : "",
		latitude : 0,
		longitude : 0,
		currentWeather : 0,
		windSpeed : 0
	};

	$scope.data = {
		cities : [
			{id : 'Madrid',	name : 'Madrid'	},
			{id : 'Barcelona',	name : 'Barcelona'},
			{id : 'Santiago',	name : 'Santiago'},
			{id : 'London',	name : 'London' },
		]
	}

	$scope.getWeather = function() {
		console.log("selectedCity=" + $scope.selectedCity + ", selectedUnit=" + $scope.selectedUnit, "WeatherController->getWeather");
		
		$scope.msgError01 = "";
		$scope.msgError02 = "";
		if ($scope.selectedCity == "" || $scope.selectedCity == undefined){
			$scope.msgError01 = "city required";
		}

		if ($scope.selectedUnit == "" || $scope.selectedUnit == undefined){
			$scope.msgError02 = "unit ​​required";
		}
		
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