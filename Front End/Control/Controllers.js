var App = angular.module('Controller',['ngRoute'])

	App.config(function ($routeProvider, $locationProvider){

	$routeProvider.when('/',{
		// Template da rota(pagina) desejada
		templateUrl : 'Pages/main.html',
		// Controlador da pagina desejadaz
		controller : 'mainCtrl'
	});

	$routeProvider.when('/MontarPedido',{
		templateUrl : 'Pages/montarpedido.html',
		controller : 'montarPedidoCtrl'
	});

	$routeProvider.when('/Login',{
		templateUrl : 'Pages/Login.html',
		controller : 'loginCtrl'
	});

	$routeProvider.when('/Cadastrar',{
		templateUrl : 'Pages/cadastrar.html',
		controller : 'cadastrarCtrl'
	});

	$routeProvider.otherwise({ redirectTo: 'Pages/main.html'});
});

App.controller('mainCtrl',function ($scope) {
	$scope.message = 'Bem vindo a pagina Home';
});

App.controller('contatoCtrl',function ($scope) {
	$scope.message = 'Bem vindo a pagina de Contato';
});

App.controller('sobreCtrl',function ($scope) {
	$scope.message = 'Bem vindo a pagina Sobre';
});