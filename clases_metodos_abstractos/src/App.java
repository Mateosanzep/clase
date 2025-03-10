public class App {
    public static void main(String[] args) throws Exception {
        //Su funcion es ser una base para las clases hijas
        //solo se utilizan en las clases padres (super-clase)
        //no se puede instaciar un objeto de una abstracta
        //los metodos abstractos no se implementan

        extintos c1 = new extintos("Dodo", "Alaska", 2000);
        domesticos l1 = new domesticos("perro", "china", 3829, 10, "crianza");
        salvajes p1 = new salvajes("lobo", "rusia", 37282, 14, 3);


        c1.info();
        l1.info();
        p1.info();
        
    }
}
