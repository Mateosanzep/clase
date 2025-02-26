public class estudiante extends persona {
    private int id;
    private String carrera;


    public estudiante(String nombre, int edad, double altura, int id, String carrera) {
        super(nombre, edad, altura);
        this.id = id;
        this.carrera = carrera;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getCarrera() {
        return carrera;
    }


    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
   
    
}
