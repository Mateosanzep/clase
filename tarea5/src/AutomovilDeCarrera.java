public class AutomovilDeCarrera extends Automovil {
    int velocidadMaxima;

    public AutomovilDeCarrera(String marca, String modelo, String tipoMotor, int velocidadMaxima) {
        super(marca, modelo, tipoMotor);
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    @Override
    public void arrancar() {
        System.out.println("El automóvil de carrera está arrancando.");
    }

    public double aplicarDescuento(double porcentajeDescuento) {
        double precioBase = calcularPrecio();
        return precioBase * (1 - (porcentajeDescuento / 100));
    }
}