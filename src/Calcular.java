import java.util.Scanner;

public class Calcular {

    public static double sumar(double x, double y) {
        return x+y;
    }

    public static double restar(double x, double y) {
        return x-y;
    }

    public static double multiplicar(double x, double y) {
        return x*y;
    }

    public static double dividir(double x, double y) {
        if(y != 0) return x/y;
        else return 0;
    }

    public static void calcular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número: ");
        double x = scanner.nextDouble();
        System.out.println("Dime otro número: ");
        double y = scanner.nextDouble();
        System.out.println("Dime una operación (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double resultado;
        switch (op) {
            case '+':
                resultado = sumar(x, y);
                break;
            case '-':
                resultado = restar(x, y);
                break;
            case '*':
                resultado = multiplicar(x, y);
                break;
            case '/':
                resultado = dividir(x, y);
                break;
            default:
                return;
        }
        System.out.println("Resultado: " + resultado);
    }

}
