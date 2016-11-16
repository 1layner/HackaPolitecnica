angular.module('calculadora',[]).controller('CalculadoraControler', function($scope)
{




$scope.resultado =0; 
$scope.casas  =0;
$scope.casa2= 0;



funcao = 0;
valor1= 0;
valor2 =0;
valoraux =0;
memoria =0;
click =0;

res =1;
div=1;
comp =0;
op =0;





	// funçao que ao digitar adiciona um valor na tela 
	$scope.valor = function(x)
	{
			
		if(click ==0)
		{
			console.log("botao clicado", x)
			$scope.resultado = $scope.resultado * 10 + x;
			console.log("valor resultado normal" ,$scope.resultado)
			click=0
			op=0;



		}
		else
		{
			console.log("botao clicado", x)
			$scope.resultado =0;
			$scope.resultado = $scope.resultado * 10 + x;
			console.log("valor resultado normal" ,$scope.resultado)
			click=0
			op=0;
		}
		
		
	}



	// funçao que quando aperta o c limpa o resultado 
	$scope.Limpar = function()
	{

		console.log("valor resultado antes de limpar" ,$scope.resultado)
		$scope.resultado =0;
		console.log("valor resultado depois de limpar" ,$scope.resultado)	
	
	}



	// funçao que define o operador 
	$scope.operador= function(x)
	{

		console.log("valor funcao" ,funcao)
		// verifica se ja existe um operador 
		if (funcao >0)
		{
			console.log("valor op" ,op)
			// verifica se esta sendo pressionado mais de uma vez o operador
			if (op == 0)
			{

				console.log("valor resultado " ,$scope.resultado)
				console.log(" valor 2 antes de atribuir" ,valor2)
				valor2 = $scope.resultado;
				console.log("valor valor 2 depois de atribuir" ,valor2)
				$scope.igual()
				console.log("valor resultado " ,$scope.resultado)
				console.log("valor1 antes de atribuir " ,valor1)
				valor1 = $scope.resultado;
				console.log("valor1 depois de atribuir " ,valor1)
				click=1;
				funcao = x;
				console.log("valor funcao final" ,funcao)
				memoria =0;
				op =1;
				console.log("valor op final" ,op)
			}
			else
			{
				console.log("valor op" ,op)
				console.log("valor resultado " ,$scope.resultado)
				console.log("valor1 antes de atribuir " ,valor1)
				valor1 = $scope.resultado;
				console.log("valor1 depois de atribuir " ,valor1)
				click=1;
				funcao = x;
				console.log("valor funcao final" ,funcao)
				memoria =0;
				op =1;
				console.log("valor op final" ,op)

			}
		//res=1;
		//$scope.casa2 = $scope.casas ;
		//$scope.casas  =0;
		}		
		else
			{
				console.log("valor resultado " ,$scope.resultado)
				console.log("valor1 antes de atribuir " ,valor1)
				valor1 = $scope.resultado;
				console.log("valor1 depois de atribuir " ,valor1)
				$scope.resultado =0;
				console.log("valor resultado final " ,$scope.resultado)
				funcao = x;
				console.log("valor funcao final" ,funcao)
				memoria =0;
				//res=1;
				//$scope.casa2 = $scope.casas ;
				//$scope.casas  =0;
			}
	}

	// funçao que reinicializa a calculadora
	$scope.reset = function()
	{
		window.location.reload();
	}


	// funçao que quando apertado igual 
	$scope.igual = function(){   
		// verificaçao da casa 2 
		//if ($scope.casa2 > $scope.casas ) {
			//$scope.casas =$scope.casa2;
		//}
		// verifica se o valor 1 ja foi preecnhido
		if (valor1 > 0)
		{
			// verifica se o igual ja foi pressionado mais de uma vez
			if( memoria == 0)
			{
				console.log("funcao" ,funcao)
				console.log("valor2 inicial igual" ,valor2)
				console.log("resultado inicial igual" ,$scope.resultado)
				valor2 = $scope.resultado;
				console.log("valor2 atribuido igual" ,valor2)
				console.log("valor1 inicial igual" ,valor1)
				$scope.resultado = valor1;
				console.log("resultado inicial igual" ,$scope.resultado)
				if(funcao == 1)
				{

					$scope.resultado = $scope.resultado + valor2;
					console.log("resultado final igual" ,$scope.resultado)
					memoria =1;
				}	
				if (funcao==2) 
				{
					$scope.resultado = $scope.resultado - valor2;
					console.log("resultado final igual" ,$scope.resultado)
					memoria =1;
			
			 	}
				if (funcao==3) 
				{
					$scope.resultado = $scope.resultado * valor2;
					console.log("resultado final igual" ,$scope.resultado)
					memoria =1;	
					//$scope.casas = $scope.resultado.length;
					//$scope.resultado = $scope.resultado;
			 	}
				if (funcao==4) 
				{
					$scope.resultado = $scope.resultado / valor2;
					console.log("resultado final igual" ,$scope.resultado)			
					memoria =1;
					//$scope.casas = $scope.resultado.length;
					//$scope.resultado = $scope.resultado;
			 	}
			}
			else
			{
				console.log("funcao" ,funcao)
				if(funcao == 1)
				{	
					console.log("valor 2" ,valor2)
					console.log("resultado inicial igual" ,$scope.resultado)
					$scope.resultado = $scope.resultado + valor2;
					console.log("resultado final igual" ,$scope.resultado)	
				}
				if (funcao==2) 
				{
					console.log("valor 2" ,valor2)
					console.log("resultado inicial igual" ,$scope.resultado)
					$scope.resultado = $scope.resultado - valor2;
					console.log("resultado final igual" ,$scope.resultado)	
			 	}
				if (funcao==3) 
				{
					console.log("valor 2" ,valor2)
					console.log("resultado inicial igual" ,$scope.resultado)
					$scope.resultado = $scope.resultado * valor2;
					console.log("resultado final igual" ,$scope.resultado)	
			 	}
				if (funcao==4) 
				{
					console.log("valor 2" ,valor2)
					console.log("resultado inicial igual" ,$scope.resultado)
					$scope.resultado = $scope.resultado / valor2;
					memoria =1;
					console.log("resultado final igual" ,$scope.resultado)	
			 	}
			}
		}
    }

});