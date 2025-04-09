import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int div;
        boolean bandera = false;

        System.out.println("Dame un numero:");
        num1= entrada.nextInt();
        while (!bandera) {

        try{
            System.out.println("Dame un numero2:");
            num2= entrada.nextInt();
            div = num1/num2;
            System.out.println("div " + div);
            bandera = true;
        }catch(ArithmeticException e){
            System.out.println("Debe de ser diferente a cero");
        }catch(InputMismatchException e){
            System.out.println("Debe de ser un numero");
            entrada.next();
        }
    }

    }
}
