import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int divisor = 2;
        int valorPrimo = 1;

        System.out.println("Inrtroduce un numero: ");
        int numero = scan.nextInt();

        while(divisor * divisor <= numero){
            if (numero  % divisor == 0){
                valorPrimo = 0;
            }
            divisor++;
        }

        if (valorPrimo == 1 && numero > 1){
            System.out.println(numero + " es un numero primo");
        }
        else {
            System.out.println(numero + " no es un numero primo");
        }
    }
}
