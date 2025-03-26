public class salvajes extends vivos {

    private int peligro;

    public salvajes(int cantidad, int vidaProm, int peligro) {
        super(cantidad, vidaProm);
        this.peligro = peligro;
    }



    public salvajes(String nombre, String origen, int cantidad, int vidaProm, int peligro) {
        super(nombre, origen, cantidad, vidaProm);
        this.peligro = peligro;
    }



    @Override
    public void info() {
        // TODO Auto-generated method stub
        System.out.println(getNombre()+" "+getOrigen()+" "+getCantidad()+" "+getVidaProm()+" "+getPeligro());
    }



    public int getPeligro() {
        return peligro;
    }



    public void setPeligro(int peligro) {
        this.peligro = peligro;
    }
    
}
