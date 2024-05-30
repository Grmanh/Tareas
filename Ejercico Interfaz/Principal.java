public class Principal{

   public static void main(String[] args) {
   
      Factura factura1 = new Factura( "003", "Tonillos para madera", 10, 50.10);
      
      System.out.println("Decripción y total de la factura: ");
      System.out.println("Numero de la Pieza: " + factura1.getNumPieza());
      System.out.println("Descripción de la Pieza: " + factura1.getDescripPieza());
      System.out.println("Cantidad de Piezas: "+ factura1.getCantdPieza());
      System.out.println("Precio de la Pieza"+factura1.getPrecioPieza());
      System.out.println("Total a pagar: : "+ factura1.obtenerMontoPago());
      
      
      
      
      
      EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("German","Torres","123456789IOU", 20);
      
      System.out.println("Datos del Empleado: ");
      System.out.println("Primer Nombre: "+ empleado1.getPrimerNombre());
      System.out.println("Apellido Paterno: "+ empleado1.getApellidoPaterno());
      System.out.println("Numero de Seguro Social: "+ empleado1.getNumeroSeguroSocial());
      System.out.println("Total por los dias trabajados: "+ empleado1.obtenerMontoPago()); 
       
   }//fin del metodo main
}// fin de la clase Principal
