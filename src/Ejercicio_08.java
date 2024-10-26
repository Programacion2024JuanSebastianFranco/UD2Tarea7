import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {

        //Inicio de flujo de Trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de Variables
        int contPrimos = 0;
        int num2 = 2;

        //Recoleccion de Datos de Usuario
        System.out.println("Introduce un numero: ");
        int num = scan.nextInt();

        //Operacion Algortimica
        while(contPrimos < num){
            int divisor = 2;
            int valorPrimo = 1;

            //Verificar que el valor sea primo
            while(divisor * divisor <= num2 && valorPrimo == 1){
                if (num2 % divisor == 0){
                    valorPrimo = 0;
                }
                divisor++;
            }

            //Si es primo se muestra
            if (valorPrimo == 1){
                System.out.println(num2);
                contPrimos++;
            }

            num2++;

        }

    }
}
