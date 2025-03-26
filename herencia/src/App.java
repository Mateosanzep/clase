public class App {
    public static void main(String[] args) throws Exception {
        persona obj1 = new persona();
        obj1.setNombre("Juan");
        obj1.setEdad(19);
        obj1.setAltura(1.80);

        System.out.println(obj1.getNombre()+" "+obj1.getEdad()+" "+obj1.getAltura());

        estudiante obj2 = new estudiante("Pepe", 19, 1.75, 271789, "isgc");
        System.out.println(obj2.getNombre()+" "+obj2.getEdad()+" "+obj2.getAltura()+" "+obj2.getId()+" "+obj2.getCarrera());

        personaje p1 = new personaje("pedrito", "Volar");
        System.out.println(p1.getNombre()+" "+p1.getPoder());

        vida p2 = new vida("Volt", "Correr", 3);
        System.out.println(p2.getNombre()+" "+p2.getPoder()+" "+p2.getVidas());

        mascota p3 = new mascota("Perruno", "Hablar con animales", "Dogui");
        System.out.println(p3.getNombre()+" "+p3.getPoder()+" "+p3.getNombreMascota());

    }
}
