import java.util.InputMismatchException;
import java.util.Scanner;

class Rectangulo extends Figura {
    private double base, altura;

    @Override
    void pedirDatos(Scanner sc) {
        boolean validoBase = false;
        boolean validoAltura = false;

        do {
            try {
                System.out.print("Ingrese base: ");
                base = sc.nextDouble();
                if (base > 0) {
                    validoBase = true;
                } else {
                    System.out.println("Error: debe ser positivo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un numero");
                sc.next();
            }
        } while (!validoBase);

        do {
            try {
                System.out.print("Ingrese altura: ");
                altura = sc.nextDouble();
                if (altura > 0) {
                    validoAltura = true;
                } else {
                    System.out.println("Error: debe ser positivo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un numero");
                sc.next();
            }
        } while (!validoAltura);
    }

    @Override
    double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return String.format("Rectangulo [Base=%.2f, Altura=%.2f, Area=%.2f]", base, altura, calcularArea());
    }
}