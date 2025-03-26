public class App {
    public static void main(String[] args) throws Exception {
        /*Polimorfismo:
            -herencia
            -sobrecarga
        
        propiedad que tiene un objeto para tomar muchas formas

        en una relacion de herencia, un objeto de la clase padre puede contener un objeto de las clases hijas, pero no a la inversa
        */

        personaje p1 = new alien("whaho", "marte");
        p1.poder();

        personaje p2 = new humano("Cairo", 2);
        p2.poder();

        //usar array
        personaje[] listaPersonajes = new personaje[4];
        listaPersonajes[0] = p1;
        listaPersonajes[1] = p2;
        listaPersonajes[2] = new personaje("mascota3");
        listaPersonajes[3] = new humano("lucky", 2);

        for(personaje elementoPersonaje : listaPersonajes){
            elementoPersonaje.poder();
        }
    }
}
