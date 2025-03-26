public class Video extends Contenido {
    double duracion;

    public Video(String id, String titulo, String fechaPublicacion, double duracion) {
        super(id, titulo, fechaPublicacion);
        this.duracion = duracion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public void publicar() {
        // TODO Auto-generated method stub
        System.out.println("El video ha sido publicado");
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(getDuracion());
    }

    @Override
    public double calcularCalificacion(double duracion, int nivelDificultad){
        double cali = (duracion/10)+(nivelDificultad/2);
        return cali;
    }

    @Override
    public int calcularTiempoLectura(int numeroPalabras, int velocidadLectura) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularTiempoLectura'");
    }
    
}
