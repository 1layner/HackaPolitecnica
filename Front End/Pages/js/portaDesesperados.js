var app = angular.module ("Porta",[]);
app.controller("portaDesesperados", function ($scope) {
	$scope.portas = [];
	

	$scope.portas[0] = "porta.jpg";
	$scope.portas[1] = "porta.jpg";
	$scope.portas[2] = "porta.jpg";

	
	var posPremio = Math.floor(Math.random() * 3 + 0);
	var posMostra = Math.floor(Math.random() * 3 + 0);
	var posTroca = Math.floor(Math.random() * 3 + 0);
	var posSelecionada;



	//console.log("inicio");
	console.log("premio"+posPremio);
	console.log("mostra"+posMostra);
	console.log("troca" +posTroca);

	$scope.fazJogo = function (pos) {

	posSelecionada = pos;

		for (var i = 0; posMostra == posSelecionada || posMostra == posPremio; i++) {
			posMostra = i;
		}

		$scope.portas[posMostra] = "dead.jpg";
		//console.log("escolheu");	
		//console.log(posMostra);

		$('#options').modal('show');
	}

	$scope.troca = function () {
				
		
		for (var i = 0; posTroca == posMostra || posTroca == posSelecionada; i++) {
			posTroca = i;
		}


		if (posTroca == posPremio) {
			
			$scope.portas[posPremio] = "viuva.jpg";
			$scope.portas[posSelecionada] = "dead.jpg";
			alert("Parabéns você ganhou!");
			console.log("parabens vc trocou e ganhou")
			console.log("troca = premio");
			console.log(posTroca);
			console.log(posPremio);
			

			document.getElementById("portas1").disabled = true;
    		document.getElementById("portas2").disabled = true;
    		document.getElementById("portas3").disabled = true;

			
		
		}
		else{
			console.log(posTroca);
			console.log(posPremio);
			
			console.log("vc trocou e perdeu")
			console.log("troca != premio");
			$scope.portas[posPremio] = "viuva.jpg";
			$scope.portas[posTroca] = "dead.jpg";
			alert("Você Perdeu!");
    document.getElementById("portas1").disabled = true;
    document.getElementById("portas2").disabled = true;
    document.getElementById("portas3").disabled = true;

			
			
		}
	}

	$scope.naoTroca = function () {
	for (var i = 0; posTroca == posMostra || posTroca == posSelecionada; i++) {
			posTroca = i;
		}
		if (posSelecionada == posPremio) {
			console.log(posTroca);
			console.log(posPremio);
			
			console.log(" parabens vc  nao trocou e ganhou")
			console.log("selecionada = premio");
			$scope.portas[posPremio] = "viuva.jpg";
			$scope.portas[posTroca] = "dead.jpg";
			alert("Parabéns você ganhou!");

    document.getElementById("portas1").disabled = true;
    document.getElementById("portas2").disabled = true;
    document.getElementById("portas3").disabled = true;


		}
		else{
			console.log("vc  nao trocou e perdeu")
			console.log("selecionada != premio");
			console.log(posTroca);
			console.log(posPremio);
			
			$scope.portas[posPremio] = "viuva.jpg";
			$scope.portas[posSelecionada] = "dead.jpg";
			alert("Você Perdeu!");

    document.getElementById("portas1").disabled = true;
    document.getElementById("portas2").disabled = true;
    document.getElementById("portas3").disabled = true;

			
		}
	}

	function bloquear()
	{


    document.getElementById("portas1").disabled = true;
    document.getElementById("portas2").disabled = true;
    document.getElementById("portas3").disabled = true;

	}



	$scope.resetar = function () {

console.log("resetar")
		location.reload(true);
	}


});