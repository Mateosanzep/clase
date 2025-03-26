public class Articulo extends Contenido {
    String autor;

    public Articulo(String id, String titulo, String fechaPublicacion, String autor) {
        super(id, titulo, fechaPublicacion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void publicar() {
        // TODO Auto-generated method stub
        System.out.println("El Articulo ha sido publicado");
        
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(getAutor());
    }

    @Override
    public int calcularTiempoLectura(int numeroPalabras, int velocidadLectura){
        int tiempo = numeroPalabras/velocidadLectura;
        return tiempo;
    }

    @Override
    public double calcularCalificacion(double duracion, int nivelDificultad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularCalificacion'");
    }
    
}
