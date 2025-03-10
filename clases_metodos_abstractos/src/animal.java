public abstract class animal {

    private String nombre;
    private String origen;

    public animal() {
        this.nombre = "";
        this.origen = "";
    }

    public animal(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public abstract void info();
}
