import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        persona p1 = new persona();
        calis c1 = new calis();
        
        Scanner entrada = new Scanner(System.in);

        String nombre, materia;
        int edad, semestre;
        double altura, cali;

        System.out.println("Nombre: ");
        nombre=entrada.next();
        p1.setNombre(nombre);

        System.out.println("Edad: ");
        edad=entrada.nextInt();
        p1.setEdad(edad);

        System.out.println("altura: ");
        altura=entrada.nextDouble();
        p1.setAltura(altura);

        System.out.println("Materia: ");
        materia=entrada.next();
        c1.setMateria(materia);

        System.out.println("Semestre: ");
        semestre=entrada.nextInt();
        c1.setSemestre(semestre);

        System.out.println("Calificacion: ");
        cali=entrada.nextDouble();
        c1.setCali(cali);

        System.out.println(p1.getNombre()+ " " + p1.getEdad()+ " " + p1.getAltura());
        System.out.println(c1.getMateria()+" "+c1.getSemestre()+" "+c1.getCali());
    }
}