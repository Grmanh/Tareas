package circunferencia;
import java.util.Scanner;
public class Principal {
   public static void main (String[] args) {
      double radio;
      Scanner scanner = new Scanner (System.in);
      System.out.print("Por favor ingrese el valor del radio: ");
      radio = scanner.nextDouble();
      //Metodo Constructor c1
      Circunferencia bubble1 = new Circunferencia ();
      //Metodo Contructor c2
      Circunferencia bubble2 = new Circunferencia (radio);
      //Mostrando vaiable predentemianda
      System.out.println("Calculo del radio, variable predetermianda en c1:");
      System.out.println("Radio predeterminado: " + bubble1.getRadio());
      System.out.println("El Diametro es: " + bubble1.getDiametro());
      System.out.println("La Longitud es: " + bubble1.getLongitud());
      System.out.println("El area es: " + bubble1.getArea());
      //Mostrando variable ingresada por el ususario
      System.out.println("El calculo del radio ingresado por el usuario c2:");
      System.out.println("Radio ingresado por el usuario: "+ bubble2.getRadio());
      System.out.println("El Diametro es: " + bubble2.getDiametro());
      System.out.println("La Longitud es: " + bubble2.getLongitud());
      System.out.println("El area es: " + bubble2.getArea());
     
   } //fin del metodo scanner   
   
}//fin de la clases principal
