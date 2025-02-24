import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //     if (cond1 && cond2 || cond3) {
            
    //     } else {
            
    //   
        mascota rocky = new mascota();
        Scanner entrada = new Scanner(System.in);

        int edad;
        double peso;
        String nombre, raza;
        boolean bandera = true;

        while (bandera) {

        System.out.println("Nombre: ");
        nombre = entrada.next();
        rocky.setNombre(nombre);

        System.out.println("Peso: ");
        peso = entrada.nextDouble();
        rocky.setPeso(peso);

        System.out.println("Edad: ");
        edad = entrada.nextInt();
        rocky.setEdad(edad);

        System.out.println("Raza: ");
        raza = entrada.next();
        rocky.setRaza(raza);

        rocky.getData();

        if (rocky.getPeso()<10 && rocky.getEdad()>2) {
            System.out.println("No saludable");
        } else if (rocky.getPeso()>10 && rocky.getPeso()<12 && rocky.getEdad()>2) {
            System.out.println("Saludable");
        } else if (rocky.getPeso()>12 && rocky.getEdad()<1) {
            System.out.println("No saludable");
        } else{
            System.out.println("No valido");
        }
        
        switch (rocky.getEdad()) {
            case 5:
            System.out.println("Siempre feliz");
                break;

            case 10:
            System.out.println("Ya esta cansada");
                break;
        
            default:
                break;
        }
    
        System.out.println("Mas mascotas?");
        bandera = entrada.nextBoolean();
    }  
}
}
