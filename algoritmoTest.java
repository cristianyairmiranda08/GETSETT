/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogo;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;

public class algoritmoTest {

    public static void main (String[] Args) throws IOException {

        int opcionEligeUsuario = 0;
        List <Empleado> listaDeEmpleados = new ArrayList<Empleado> ();
        Dialogo opcionesUsuario = new Dialogo();
        Dialogo mensajeVent = new Dialogo();

        while (opcionEligeUsuario != 5 ) {

            opcionEligeUsuario = opcionesUsuario.obtenerOpcionMenu();

            if (opcionEligeUsuario == 1) {

                Empleado tmpEmpleados = new Empleado();
                tmpEmpleados.SetIdentificacion(opcionesUsuario.obtenerIdentificacionEmpleado());
                tmpEmpleados.SetNombre(opcionesUsuario.obtenerNombreEmpleado());
                tmpEmpleados.SetApellidos(opcionesUsuario.obtenerApellidosEmpleado());
                tmpEmpleados.SetEdad(opcionesUsuario.obtenerEdadEmpleado());
                
                listaDeEmpleados.add(tmpEmpleados);
            }

            if (opcionEligeUsuario == 2) {
                String identEmpleadoBuscado = opcionesUsuario.obtenerIdentificacionEmpleado();
                boolean empleadoEncontrado = false;

                Iterator<Empleado> it = listaDeEmpleados.iterator();
                Empleado tmpAnalizando;

                while ( it.hasNext() ) {          

                    tmpAnalizando = it.next();                

                    if (tmpAnalizando.getIdentificacion().equals(identEmpleadoBuscado) ) {
                        empleadoEncontrado = true;
                        String mensaje = tmpAnalizando.getStringEmpleado();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "A continuación introduzca nuevos datos para este Empleado";

                        mensajeVent.mostrarMensaje(mensaje);

                        mensajeVent.mostrarMensaje("LOS DATOS PUEDEN SER MODIFICADOS");
                        tmpAnalizando.SetNombre(opcionesUsuario.obtenerNombreEmpleado());
                        tmpAnalizando.SetApellidos(opcionesUsuario.obtenerApellidosEmpleado());
                        tmpAnalizando.SetEdad(opcionesUsuario.obtenerEdadEmpleado());

                        mensaje = tmpAnalizando.getStringEmpleado();
                        mensajeVent.mostrarMensaje(mensaje);

                    } else { }    

                } 
                if (empleadoEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el Empleado con este numero");
                }
            } 

            if (opcionEligeUsuario == 3) {

                String listado = "";

                Iterator<Empleado> it2 = listaDeEmpleados.iterator();
                Empleado tmpAnalizando;

                while ( it2.hasNext() ) {           
                    tmpAnalizando = it2.next();               
                    listado = listado + tmpAnalizando.getStringEmpleado();
                    listado = listado + "\n\n\n";
                } 

                mensajeVent.mostrarMensaje(listado);

            } 

            if (opcionEligeUsuario == 4) {
                String identempleadoBuscado = opcionesUsuario.obtenerIdentificacionEmpleado();
                boolean empleadoEncontrado = false;

                Iterator<Empleado> it = listaDeEmpleados.iterator();
                Empleado tmpAnalizando;

                while ( it.hasNext() && empleadoEncontrado==false ) {           

                    tmpAnalizando = it.next();               
                    if (tmpAnalizando.getIdentificacion().equals(identempleadoBuscado) ) {
                        empleadoEncontrado = true;
                        String mensaje = tmpAnalizando.getStringEmpleado();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "Se procede al borrado de datos de este Empleado\n\n";

                        mensajeVent.mostrarMensaje(mensaje);

                        listaDeEmpleados.remove(tmpAnalizando);
                        empleadoEncontrado=true;

                    } else { }    

                } 

                if (empleadoEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el Empleado con este numero");
                }
            } 

        }

        opcionesUsuario.cerrarPrograma();

    } 

} 