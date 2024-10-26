import java.util.Scanner;

public class Ejercicio_05 {
    public static void main (String[] args){
        //Inicio de Flujo de Trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de Variables
        int valor = 0;

        //Recoleccion de Datos al Usuario
        System.out.println("Dime un numero: ");
        int numero = scan.nextInt();

        //Operacion Algoritmica
        //Hace que el numero empiece desde 1 hasta el valor del usuario
        for (int i = 1; i <= numero; i++){
            valor++;
            //Cada que imprime un numero, este for imprime el nuevo numero mas su repeticion
            for (int j = 0; j < i; j++){
                System.out.print(valor);
            }
            //Hace el salto de linea
            System.out.println();
        }
    }
}
