package metodos;

public class Calculadora {  //Criando classe

	public static void soma(double numero1, double numero2) {   //Criando metodos que recebem parametros
		double resultado = numero1 + numero2;   //Calculando resultado
		System.out.println("A soma de " + numero1 + " mais " + numero2 + " da " + resultado);  //Imprimindo na tela o resultado

	}
	
	public static void subtracao(double numero1, double numero2) { //Criando metodos que recebem parametros
		double resultado = numero1 - numero2;   //Calculando resultado
		System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " da " + resultado); //Imprimindo na tela o resultado

	}
	
	public static void multiplicacao(double numero1, double numero2) { //Criando metodos que recebem parametros
		double resultado = numero1 * numero2;    //Calculando resultado
		System.out.println("A multiplicacao de " + numero1 + " vezes " + numero2 + " da " + resultado);  //Imprimindo na tela o resultado

	}
	
	public static void divisao(double numero1, double numero2) {   //Criando metodos que recebem parametros
		double resultado = numero1 / numero2;  //Calculando resultado
		System.out.println("A divisao de " + numero1 + " dividido por " + numero2 + " da " + resultado);  //Imprimindo na tela o resultado

	}

}
