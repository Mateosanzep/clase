public class vehiculoF1 {
    String modelo;
    String marca;
    int velocidadMaxima;
    int combustibleActual;
    int combustibleMaximo;
    public vehiculoF1(){
        this.modelo = "sin especificar";
        this.marca = "sin especificar";
        this.velocidadMaxima = 300;
        this.combustibleActual = 0;
        this.combustibleMaximo = 100;
    }

    public vehiculoF1(String modelo, String marca, int velocidadMaxima, int combustibleActual, int combustibleMaximo) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
        this.combustibleActual = combustibleActual;
        this.combustibleMaximo = combustibleMaximo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCombustibleActual() {
        return combustibleActual;
    }

    public void setCombustibleActual(int combustibleActual) {
        this.combustibleActual = combustibleActual;
    }

    public int getCombustibleMaximo() {
        return combustibleMaximo;
    }

    public void setCombustibleMaximo(int combustibleMaximo) {
        this.combustibleMaximo = combustibleMaximo;
    }

    void llenarDeposito(){
        setCombustibleActual(getCombustibleMaximo());
    }

    int acelerar(int velocidad){
        if (velocidad>getCombustibleActual()) {
            int vel = getCombustibleActual();
            setCombustibleActual(0);
            System.out.println("solo alcanza " + vel);
            return vel;
        }else{
            setCombustibleActual(getCombustibleActual()-velocidad);
            return getCombustibleActual();
        }
    }

    int cargarCombustible(int cantidad){
        if (cantidad+getCombustibleActual()>getCombustibleMaximo()) {
            int total = getCombustibleMaximo()-getCombustibleActual();
            setCombustibleActual(getCombustibleMaximo());
            return total;
        }else{
            setCombustibleActual(cantidad+getCombustibleActual());
            return cantidad;
        }
    }

    int costo(int cantidad){
        int costo = cargarCombustible(cantidad) *21;
        return costo;
    }

    
}
