import java.util.Scanner;

public class TareaFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura[] figuras = new Figura[3];

        System.out.println("Creando circulo 1:");
        figuras[0] = new Circulo();
        figuras[0].pedirDatos(sc);

        System.out.println("Creando circulo 2:");
        figuras[1] = new Circulo();
        figuras[1].pedirDatos(sc);

        System.out.println("Creando rectangulo:");
        figuras[2] = new Rectangulo();
        figuras[2].pedirDatos(sc);

        int opcion = 0;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Ver circulo 1");
            System.out.println("2. Ver circulo 2");
            System.out.println("3. Ver rectangulo");
            System.out.println("4. Salir");
            System.out.print("Seleccion: ");

            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <= 3) {
                    System.out.println(figuras[opcion - 1]);
                } 

        } while (opcion != 4);

        sc.close();
    }
}
