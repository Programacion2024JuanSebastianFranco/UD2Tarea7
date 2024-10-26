import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        //Inicio Flujo de trabajo
        Scanner scan = new Scanner(System.in);

        //Recoleccion de Datos al Usuario
        System.out.println("Insertar Altura: ");
        int altura = scan.nextInt();
        System.out.println("Insertar Anchura: ");
        int anchura = scan.nextInt();

        //Operacion Algoritimica
        //Impirmir altura
        for (int i = 0; i < altura; i++){
            //Imprimir anchura
            for (int j = 0; j < anchura; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}