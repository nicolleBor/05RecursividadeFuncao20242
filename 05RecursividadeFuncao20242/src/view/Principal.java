package view;

import java.text.DecimalFormat;

import controller.FuncaoSoma;

public class Principal {

	public static void main(String[] args) {
		FuncaoSoma soma = new FuncaoSoma();
		DecimalFormat formato = new DecimalFormat("#.#####");
		int n = 12;
		double resultado = soma.somaFuncao(n);
		System.out.println(formato.format(resultado));
	}
}
