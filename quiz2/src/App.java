public class App {
    public static void main(String[] args) throws Exception {
       Contenido[] listaContenidos = new Contenido[4];
        listaContenidos[0]=new Articulo("A41230", "Jobstick", "03 de Enero", "Mateo");
        listaContenidos[1]=new ArticuloTecnico("0271789", "Paqolin", "02 de Febrero", "Juan", "La vida");
        listaContenidos[2]=new Video("0383i5", "pura risa", "=7 de junio", 30);
        listaContenidos[3]=new VideoTutorial("987dh38", "hacer agua", "30 de Octuber", 10, "Medio");

        for(Contenido elementoContenidos : listaContenidos){
            elementoContenidos.publicar();
            elementoContenidos.mostrarInfo();
        }

        System.out.println(listaContenidos[0].calcularTiempoLectura(1000,20));
        System.out.println(listaContenidos[2].calcularCalificacion(30, 3));
        
    }
}
