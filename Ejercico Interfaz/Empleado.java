public abstract class Empleado implements PorPagar {
   private final String primerNombre;
   private final String apellidoPaterno;
   private final String numeroSeguroSocial;
   
   public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial){
      this.primerNombre = primerNombre;
      this.apellidoPaterno = apellidoPaterno;
      this.numeroSeguroSocial = numeroSeguroSocial;      
   }//fin del metodo constrctor empleado;
   
   public void setPrimerNombre(String primerNombre){
      primerNombre = primerNombre;
   }//fin metodo set primer nombre
   
   public String getPrimerNombre(){
      return primerNombre;
   }//fin metodo set primer Nombre
   
   public void setApéllidoPaterno(String apellidoPaterno){
      apellidoPaterno = apellidoPaterno;
   }//fin metodo set apellido paterno
   
   public String getApellidoPaterno(){
      return apellidoPaterno;
   }//fin metodo set primer Nombre
   
   public void setNumeroSeguroSocial(String numeroSeguroSocial){
      numeroSeguroSocial = numeroSeguroSocial;
   }// fin del metodo set numero de seguro social
   
   public String getNumeroSeguroSocial(){
      return numeroSeguroSocial;
   }// fin del metodo get numero seguro social
   
   public abstract double obtenerMontoPago();
}//fin de la clase abtracta