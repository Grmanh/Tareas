package Programa;

public class Persona {
   private int id; 
   private String primer_Nombre;
   private String primer_apellido;
   private int edad;
   private char genero;
   private float peso;
   private int talla;
   private String direccion;
   private String email;
 
   //metodo constructor

    public Persona(int id, String primer_Nombre, String primer_apellido, int edad, char genero, float peso, int talla, String direccion, String email) {
        this.id = id;
        this.primer_Nombre = primer_Nombre;
        this.primer_apellido = primer_apellido; 
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.talla = talla;
        this.direccion = direccion;
        this.email = email;
    }// Fin del metodo contructor
//inicio del metodo get y set
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setPrimer_Nombre(String primer_Nombre) {
        this.primer_Nombre = primer_Nombre;
    }
    public String getPrimer_Nombre() {
        return primer_Nombre;
    }

     public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }
     public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

   public void setGenero(char genero) {
        this.genero = genero;
    } 
   public char getGenero() {
        return genero;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    public int getTalla() {
        return talla;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    } 
    public String getDireccion() {
        return direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }// Fin de metodo get y set   
}// Fin de clase
