public class alien extends personaje {

    private String planeta;

    public alien(String nombre, String planeta) {
        super(nombre);
        this.planeta = planeta;
    }

    @Override
    public void poder() {
        super.poder();
        System.out.println("El alien puede leer mentes...");
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    
    
}
