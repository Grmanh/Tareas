public class Factura implements PorPagar{
   private final String numPieza;
   private final String descripPieza;
   private int cantidPieza;
   private double precioPieza;
   
   public Factura( String numPieza, String decripPieza, int cantidPieza, double precioPieza){
      this.numPieza = numPieza;
      this.descripPieza = decripPieza;
      this.cantidPieza = cantidPieza;
      this.precioPieza = precioPieza;   
   }//Fin del Contructor Factura 
   
   public void setNumPieza(String numPieza){
      numPieza = numPieza;   
   }//fin Metodo_Set numero de pieza
   
   public String getNumPieza (){
      return numPieza; 
   }// fin Metodo_get numero de pieza
   
   public void setSDescripPieza(String descripPieza){
      descripPieza = descripPieza;   
   }//fin Metodo_Set descripcion de pieza
   
   public String getDescripPieza (){
      return descripPieza; 
   }// fin Metodo_get descripcion de pieza
   
   public void setCantdPieza(int cantdPieza){
      cantdPieza = cantidPieza;   
   }//fin Metodo_Set cantidad de pieza
   
   public int getCantdPieza(){
      return cantidPieza; 
   }// fin Metodo_get cantidad de pieza
   
   public void setPrecioPieza(double precioPieza){
      this.precioPieza = precioPieza;   
   }//fin Metodo_Set numero de pieza
   
   public double getPrecioPieza (){
      return precioPieza; 
   }// fin Metodo_get numero de pieza
   
   @Override
   public double obtenerMontoPago(){
      return cantidPieza * precioPieza;   
   }//fin del metodo obtener monto de pago
   
}//Fin de la Clase