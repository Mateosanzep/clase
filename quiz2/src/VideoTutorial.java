public class VideoTutorial extends Video{
    String nivel;

    public VideoTutorial(String id, String titulo, String fechaPublicacion, double duracion, String nivel) {
        super(id, titulo, fechaPublicacion, duracion);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void publicar() {
        // TODO Auto-generated method stub
        super.publicar();
        System.out.println("El video tutorial ha sido publicado");
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(getNivel());
    }
    
    
    
}
