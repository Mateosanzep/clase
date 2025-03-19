

public class humano extends personaje {

private int vidas;

public humano(String nombre, int vidas) {
    super(nombre);
    this.vidas = vidas;
}

    @Override
    public void poder() {
        System.out.println("El humano puede volar...");
    }

    public int getVidas() {
        return vidas;
    }

    public void setvidas(int vidas) {
        this.vidas = vidas;
    }

    


    
}
