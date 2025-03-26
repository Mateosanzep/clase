public abstract class Contenido {
    String id;
    String titulo;
    String fechaPublicacion;

    
    public Contenido(String id, String titulo, String fechaPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }


    public abstract void publicar();

    public abstract int calcularTiempoLectura(int numeroPalabras, int velocidadLectura);

    public abstract double calcularCalificacion(double duracion, int nivelDificultad);

    public void mostrarInfo(){
        System.out.println(getId());
        System.out.println(getTitulo());
        System.out.println(getFechaPublicacion());
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getFechaPublicacion() {
        return fechaPublicacion;
    }


    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    
}
