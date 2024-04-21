
package circunferencia;

public class Circunferencia {
    private final double PI = 3.14;
    private double radio;
    private double longitud;
    private double diametro;
    private double area;
    
    //Inicio Metodo de iniciacion circunferencia
    public Circunferencia(){
        this.radio=3;
    } //final metodo de iniciacion circunferencia 
    
    //inicio del metofo contructor 
    public Circunferencia (double radio) {
        this.radio = radio;
    }// fin metodo constructor
            
    //inicio Metodo  Set y get radio
    public void setRadio (double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    // fin del metodo set y get radio
    
    //inicio de funcion calcular diametro
    public void calcularDiametro(double radio){
       diametro= radio*radio;        
    }//fin de la funcion calcular diametro
    
    public double getDiametro(){
        return diametro;
    }//fin de metodo get diametro
    
    //inicio de funcion calcular Longitud
    public void calcularLongitud(double radio){
       longitud= diametro*PI;        
    }//fin de la funcion calcular diametro
    
    public double getLongitud(){
        return longitud;
    }//fin de metodo get diametro
    
    //inicio de funcion calcular Area
    public void calcularArea(double radio){
       area= 2*PI* radio;        
    }//fin de la funcion calcular Area
    
    public double getArea(){
        return area;
    }//fin de metodo getArea  
    
 } //fin de la clse