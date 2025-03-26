public class domesticos extends vivos {

    private String uso;
    
    public domesticos(int cantidad, int vidaProm, String uso) {
        super(cantidad, vidaProm);
        this.uso = uso;
    }

    public domesticos(String nombre, String origen, int cantidad, int vidaProm, String uso) {
        super(nombre, origen, cantidad, vidaProm);
        this.uso = uso;
    }

    

    @Override
    public void info() {
        // TODO Auto-generated method stub
        System.out.println(getNombre()+" "+getOrigen()+" "+getCantidad()+" "+getVidaProm()+" "+getUso());
        
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
}
