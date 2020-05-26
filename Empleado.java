/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogo;

/**
 *
 * @author crist
 */
public class Empleado {
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String email;
    private String celular;
    private int edad;

    
    public Empleado()    {
        
        identificacion = "desconocido";
        nombre = "desconocido";
        apellidos = "desconocido";
        edad = 0;
    }

  
    public void SetIdentificacion(String identificacion) {this.identificacion = identificacion;   }
    public void SetNombre(String nombre) {this.nombre = nombre; }
    public void SetApellidos(String apellidos) {this.apellidos = apellidos; }
    public void SetEdad(int edad) {this.edad = edad; }

    
    public String getIdentificacion() {return identificacion; }
    public String getNombre() {return nombre; }
    public String getApellidos() { return apellidos; }
    public int getEdad() {return edad;}
    
    public String getStringEmpleado () {
        String mensaje = "Información actual del Empleado: \n";
        mensaje = mensaje + "Identificacion: " + this.getIdentificacion()+"\n";
        mensaje = mensaje + "Nombre: " + this.getNombre()+"\n";
        mensaje = mensaje + "Apellidos: " + this.getApellidos() + "\n";
        mensaje = mensaje + "Edad: " + this.getEdad() + "\n";
        mensaje = mensaje + "\n\n\n";
        return mensaje;
    }
}