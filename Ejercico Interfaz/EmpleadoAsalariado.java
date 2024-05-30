public class EmpleadoAsalariado extends Empleado{
   private final double SUELDOHORA = 600;
   private int diasTrabajados;
   //declaracion de metodos
   public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, int diasTrabajados){
      super(primerNombre, apellidoPaterno, numeroSeguroSocial);
      this.diasTrabajados = diasTrabajados;
   }//fin del metodo contructor
   
   public void setDiasTrabajados(int diasTrabajados){
      this.diasTrabajados = diasTrabajados;
   }//fin del metodo setter dias trabajados
   
   public int getDiasTrabajados(){
      return diasTrabajados;
   }//Metodos getter diasTrabajados
   
   @Override
   public double obtenerMontoPago(){
      return SUELDOHORA * diasTrabajados;
   }   
}//fin de la clase