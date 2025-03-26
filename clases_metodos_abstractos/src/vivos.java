public abstract class vivos extends animal {
    private int cantidad;
    private int vidaProm;
    
    public vivos(int cantidad, int vidaProm) {
        this.cantidad = cantidad;
        this.vidaProm = vidaProm;
    }
    public vivos(String nombre, String origen, int cantidad, int vidaProm) {
        super(nombre, origen);
        this.cantidad = cantidad;
        this.vidaProm = vidaProm;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getVidaProm() {
        return vidaProm;
    }
    public void setVidaProm(int vidaProm) {
        this.vidaProm = vidaProm;
    }
}
