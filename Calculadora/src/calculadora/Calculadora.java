package calculadora;

public class Calculadora {

    public static void main(String[] args) {
        Resta resta = new Resta();
        Suma suma = new Suma();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();

        System.out.println("Resta: " + resta.getResta(10, 5));
        System.out.println("Suma: " + suma.getSuma(2, 45));
        System.out.println("Multiplicación: " + multiplicacion.getMultiplicacion(3, 8));
        System.out.println("División: " + division.getDivision(145, 5));
    }
}
