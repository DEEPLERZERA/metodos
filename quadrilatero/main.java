package quadrilatero;

public class main {  

	public static void main(String[] args) {  //Chamando classe main
		double areaQuadrado = quadrilatero.area(3);  //Atribuindo o valor de retorno do metodo quadrilatero.area a variavel areaQuadrado
		System.out.println("Área do quadrado:" + areaQuadrado);  //Imprimindo na tela o resultado
		double areaRetangulo = quadrilatero.area(5d,5d);
		System.out.println("Área do retangulo:" + areaRetangulo);
		double areaTrapezio = quadrilatero.area(7,8,9);
		System.out.println("Área do trapezio:" + areaTrapezio);
        

	}

}
