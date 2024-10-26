import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {

        //Inicio de Flujo de Trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de Variables
        int divisor = 2;
        int valorPrimo = 1;

        //Recoleccion de Datos
        System.out.println("Inrtroduce un numero: ");
        int numero = scan.nextInt();

        //Operacion Algoritmica
        while(divisor * divisor <= numero){
            if (numero  % divisor == 0){
                valorPrimo = 0;
            }
            divisor++;
        }

        //Si es primo lo dice
        if (valorPrimo == 1 && numero > 1){
            System.out.println(numero + " es un numero primo");
        }
        //Si no es primo lo dice
        else {
            System.out.println(numero + " no es un numero primo");
        }
    }
}
