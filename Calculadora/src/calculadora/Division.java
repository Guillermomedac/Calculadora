
package calculadora;

public class Division {

    public double getDivision(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }

    }
}
