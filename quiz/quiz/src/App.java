import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        vehiculoF1 f1 = new vehiculoF1();
        Scanner entrada = new Scanner(System.in);

        String marca, modelo;
        int velocidadMaxima;
        int combustibleActual;
        int combustibleMaximo; 

        System.out.println("modelo: ");
        modelo=entrada.next();
        f1.setModelo(modelo);

        System.out.println("marca: ");
        marca=entrada.next();
        f1.setMarca(marca);



        f1.llenarDeposito();
        f1.acelerar(200);

        System.out.println(f1.getModelo() + " "+ f1.getMarca()+ " "+f1.costo(5)+ " "+f1.getCombustibleActual() );
    }
}
