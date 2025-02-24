public class mascota {
    // Atributos
    private String nombre;
    private double peso;
    private int edad;
    private String raza;

    //Constructor

    
    public mascota() {
        this.nombre = "";
        this.peso = 0.0;
        this.edad = 0;
        this.raza = "";
    }

    public mascota(String nombre, double peso, int edad, String raza) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    public void getData(){
        System.out.println(getNombre() + " "+ getPeso()+" "+getEdad()+" "+getRaza());
    }

    
    
}
