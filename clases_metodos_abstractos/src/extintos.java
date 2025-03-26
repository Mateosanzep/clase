public class extintos extends animal {
    private int anoExtincion;

    

    public extintos(int anoExtincion) {
        this.anoExtincion = anoExtincion;
    }



    public extintos(String nombre, String origen, int anoExtincion) {
        super(nombre, origen);
        this.anoExtincion = anoExtincion;
    }



    @Override
    public void info() {
        // TODO Auto-generated method stub
        System.out.println(getNombre()+" "+getOrigen()+" "+getAnoExtincion());
        
    }



    public int getAnoExtincion() {
        return anoExtincion;
    }



    public void setAnoExtincion(int anoExtincion) {
        this.anoExtincion = anoExtincion;
    }

}
