public class ArticuloTecnico extends Articulo {
    String temas;

    public ArticuloTecnico(String id, String titulo, String fechaPublicacion, String autor, String temas) {
        super(id, titulo, fechaPublicacion, autor);
        this.temas = temas;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    @Override
    public void publicar() {
        // TODO Auto-generated method stub
        super.publicar();
        System.out.println("El articulo tecnico ha sido publicado");
    }


    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(getTemas());
    }
    

    
}
