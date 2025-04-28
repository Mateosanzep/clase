import java.util.InputMismatchException;
import java.util.Scanner;

class Circulo extends Figura {
    private double radio;

    @Override
    void pedirDatos(Scanner sc) {
        boolean valido = false;
        do {
            try {
                System.out.print("Ingrese radio: ");
                radio = sc.nextDouble();
                if (radio > 0) {
                    valido = true;
                } else {
                    System.out.println("Error: debe ser positivo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un numero");
                sc.next();
            }
        } while (!valido);
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return String.format("Circulo [Radio=%.2f, Area=%.2f]", radio, calcularArea());
    }
}
