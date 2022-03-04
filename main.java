package metodos;

public class main {

	public static void main(String[] args) {  //Chamando metodo main
		//Calculadora
		System.out.println("Exercício da calculadora: ");  //Imprimindo na tela
		Calculadora.soma(3, 6);   //Chamando metodo Calculadora e passando os parametros
		Calculadora.subtracao(9, 5);
		Calculadora.multiplicacao(5, 2);
		Calculadora.divisao(10, 2);
		
		//Mensagem
		Mensagem.obterMensagem(9);  //Chamando metodo Mensagem e passando os paramentros
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		

	}

}
