public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Test Clase Saludar
        Saludar.saludar1();
        Saludar.saludar2("Hola", "Andrés");
        String saludo3 = Saludar.saludar3("Hola", "Andrés");
        System.out.println(saludo3);

        // Test Clase Calcular
        Calcular.calcular();

        // Test Clase Cactúa
        Cacatua.cacatua();
    }
}