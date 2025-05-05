import java.util.Scanner;

public class Cacatua {

    public static String pideComida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué comida le das? ");
        return scanner.nextLine();
    }

    public static void dormirse(){
        System.out.println("zzZzzzz…");
    }

    public static void cacatua() {
        while (true) {
            String comida = pideComida();
            if (comida.equalsIgnoreCase("cacahuetes")) {
                dormirse();
                break;
            } else {
                System.out.println("cacatúa cacahuetes!");
            }
        }
    }

}
