public class personaje {

    private String nombre;


    public personaje(String nombre) {
        this.nombre = nombre;
    }   


    public void poder(){
        System.out.println("Tiene algun poder...");
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
