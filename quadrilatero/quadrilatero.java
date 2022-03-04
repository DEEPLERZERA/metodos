package quadrilatero;

public class quadrilatero {  //Chamando classe quadrilatero
	public static double area(double lado) { //chamando metodo que recebe parametro

       return lado * lado; //Retornando valores
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

       return ((baseMaior+baseMenor)*altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {

        return (diagonal1 * diagonal2)/2;
    }

}

