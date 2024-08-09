package controller;

public class FuncaoSoma {

	public FuncaoSoma() {
		super();
	}
	
	public double somaFuncao(int n) {
		//Condição de Parada
		if(n == 1) {
			return 1;
		} else {
			return (1 / (double) n) + somaFuncao(n - 1); //Chamada da Função
		}
	}

}
