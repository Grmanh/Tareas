package Programa;

import java.util.Scanner;

public class Programa {
    public static void main (String[] args) {
        Scanner   entrada = new Scanner(System.in);

        System.out.print("Ingresa el ID: ");
        String ID = entrada.nextLine();
        
        System.out.print("Ingresa el Primer Nombre: ");
        String primer_Nombre = entrada.nextLine();

        System.out.print("Ingresa el Primer Apellido: ");
        String primer_Apellido = entrada.nextLine();
        
        System.out.print("Ingresa la Edad: ");
        String edad= entrada.nextLine();
        
        System.out.print("Ingresa el Genero: ");
        String genero = entrada.nextLine();
        
        System.out.print("Ingresa el Peso: ");
        String peso = entrada.nextLine();
        
        System.out.print("Ingresa la talla: ");
        String talla  = entrada.nextLine();
        
        System.out.print("Ingresa la direccion: ");
        String direccion = entrada.nextLine();
        
        System.out.print("Ingresa el correo electronico: ");
        String email = entrada.nextLine();
    //mostrar datos
    System.out.println("\n**Datos ingresados:**");
        System.out.println("ID: " + ID);
        System.out.println("Primer Nombre " + primer_Nombre);
        System.out.println("Primer Apellido: " + primer_Apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Talla: " + talla + " cm");
        System.out.println("Dirección: " + direccion);
        System.out.println("Correo electrónico: " + email);
 }//Fin del metodo main
}//Fin de la clase
