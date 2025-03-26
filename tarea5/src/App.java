public class App {
    public static void main(String[] args) throws Exception {
        java.util.List<Vehiculo> vehiculos = new java.util.ArrayList<>();
        vehiculos.add(new AutomovilDeLujo("Mercedes-Benz", "Clase S", "gasolina", "Asientos de piel"));
        vehiculos.add(new AutomovilDeCarrera("Ferrari", "SF90 Stradale", "híbrido", 340));
        vehiculos.add(new Bicicleta("Trek", "Domane", "carretera"));

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInfo();
            if (vehiculo instanceof Automovil) {
                ((Automovil) vehiculo).arrancar();
            }
            System.out.println();
        }

        AutomovilDeCarrera autoCarrera = new AutomovilDeCarrera("Lamborghini", "Aventador", "gasolina", 350);
        double precioConDescuento = autoCarrera.aplicarDescuento(10);
        System.out.println("Precio del carro con 10% de descuento: $" + precioConDescuento);

        Bicicleta bicicletaMontaña = new Bicicleta("Specialized", "S-Works Epic", "montaña");
        bicicletaMontaña.verificarTipoBici();
    }
}
