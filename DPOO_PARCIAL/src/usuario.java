import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class usuario {
    String nombreUsuario;

    public static void main( String args[]){
        System.out.println("Bienvenido usuario: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su nombre: ");

        String nombreUsuario = scanner.toString();

        boolean condition= true;
        while (condition){

            try {

                System.out.println("1. Agregar Libro. ");
                System.out.println("2. Agregar Revista.");
                System.out.println("3. Agregar ejemplar libro.");
                System.out.println("4. Hacer prestamo.");

                Scanner scanner_1 = new Scanner(System.in);
                System.out.print("Please select an option: ");
                int selected_option = scanner_1.nextInt();

                if (selected_option==1){
                    
                } else if (selected_option == 2) {
                    
                } else if (selected_option == 3) {
                    
                } else if (selected_option == 4) {
                    
                }else {
                    System.out.println("Please select a valid option. ");
                }

            }catch (NumberFormatException e){
                System.out.println("Please select one of the numbers from the available options.");
            }

        }



    }
}