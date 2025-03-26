public class vida extends personaje{
    private int vidas;

    public vida(String nombre, String poder, int vidas) {
        super(nombre, poder);
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
}
