package metodos;

public class Mensagem {
      
	
	 public static void obterMensagem(int hora) {  //Criando metodo que recebe parametro
		 
		 
		 switch(hora) {  //Switch case para descobrir que numero o usuario digitou e saber que hora é
		   case 5:
		   case 6:
		   case 7:
		   case 8:
		   case 9:
		   case 10:
		   case 11:
		   case 12:
		      mensagemBomDia();   //Chamando metodo do BomDia
		      break;  //Quebra case
		   case 13: 
		   case 14:
		   case 15:
		   case 16:
		   case 17:
		      mensagemBoaTarde();  //Chamando metodo do BoaTarde
		      break;  //Quebra case
		   case 18:   
		   case 19:  
		   case 20:  
		   case 21:  
		   case 22:  
		   case 23:  
		   case 0:  
		   case 1:  
		   case 2:  
		   case 3:  
		   case 4:
		      mensagemBoaNoite();  //Chamando metodo do BoaNoite
		      break;  //Quebra case
		   default:   //Se não for nenhuma das anteriores faça isso
			  System.out.println("Hora invalida!");  //Imprimindo na tela
			  break;  //Quebra case
			   
		 }
	 }

	public static void mensagemBoaNoite() {  //Criando metodo
		System.out.println("Boa noite!");   //Imprimindo na tela
	}

	public static void mensagemBoaTarde() {  //Criando metodo
		System.out.println("Boa tarde!");   //Imprimindo na tela
	}

	public static void mensagemBomDia() {   //Criando metodo
		System.out.println("Bom dia!");      //Imprimindo na tela
	}
	 
}
