public class Automovil extends Vehiculo {
    String tipoMotor;

    public Automovil(String marca, String modelo, String tipoMotor) {
        super(marca, modelo);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + tipoMotor);
    }

    public void arrancar() {
        System.out.println("El automóvil está arrancando.");
    }

    public double calcularPrecio() {
        if ("eléctrico".equalsIgnoreCase(tipoMotor)) {
            return 30000;
        } else if ("gasolina".equalsIgnoreCase(tipoMotor)) {
            return 20000;
        }
        return 0;
    }
}
