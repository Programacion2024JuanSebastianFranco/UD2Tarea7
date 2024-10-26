import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args){

        //Inicio de Flujo de Trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de variables
        int numero;
        int operacion = 0;

        //Operacion Algoritmica Do - While
        do {
            System.out.println("Introduce un numero (0 para salir)");
            numero = scan.nextInt();

            //Comprobar que numero no sea 0
            if (numero != 0){
                //Sumar la variable i para multiplicar el numeroi por ella
                for (int i = 1; i <= 10; i++){
                    //Hacer la operacion
                    operacion = numero * i;
                    //Mostar las operaciones
                    System.out.println(numero + " x " + i + " = " + operacion);
                }
            }
        }while(numero != 0);

        //Despedida en caso de salir
        System.out.println("Hasta Luego.");
    }
}
