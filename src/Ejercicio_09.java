import java.util.Scanner;

public class Ejercicio_09 {
    public static void main(String[] args) {

        //Inicio de Flujo de Trabajo
        Scanner scan = new Scanner(System.in);

        //Recoleccion de Datos del Usuario
        System.out.println("Introduce un numero: ");
        int numero = scan.nextInt();

        //Operacion Algoritmica
        for (int i = 1; i <= numero; i++){
            //Hacer los espacios
            for (int j = 0; j < numero - i; j++){
                System.out.print(" ");
            }
            //Imprimir los asteriscos
            for (int k = 0; k < 2 * i - 1; k++){
                System.out.print("*");
            }
            //Imprimir los saltos
            System.out.println();
        }

    }
}
