public class mascota extends personaje {
    private String nombreMascota;

    public mascota(String nombre, String poder, String nombreMascota) {
        super(nombre, poder);
        this.nombreMascota = nombreMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    
}
