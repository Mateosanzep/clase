public class Bicicleta extends Vehiculo {
    String tipoBici;

    public Bicicleta(String marca, String modelo, String tipoBici) {
        super(marca, modelo);
        this.tipoBici = tipoBici;
    }

    public String getTipoBici() {
        return tipoBici;
    }

    public void setTipoBici(String tipoBici) {
        this.tipoBici = tipoBici;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de Bicicleta: " + tipoBici);
    }

    public void verificarTipoBici() {
        if ("carretera".equalsIgnoreCase(tipoBici)) {
            System.out.println("Bicicleta ideal para carreteras planas.");
        } else if ("montaña".equalsIgnoreCase(tipoBici)) {
            System.out.println("Bicicleta ideal para terrenos irregulares.");
        }
    }
}
