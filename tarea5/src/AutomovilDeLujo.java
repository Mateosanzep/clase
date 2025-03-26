public class AutomovilDeLujo extends Automovil {
    String extras;

    public AutomovilDeLujo(String marca, String modelo, String tipoMotor, String extras) {
        super(marca, modelo, tipoMotor);
        this.extras = extras;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Extras: " + extras);
    }

    @Override
    public void arrancar() {
        System.out.println("El automóvil de lujo está arrancando suavemente.");
    }
}