/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author Carles
 */
public class AsesorInmobiliario extends Empleado{
    public AsesorInmobiliario(String dni, String nombres, String apellidos, String usuario, String contrasena) {
        super(dni, nombres, apellidos, usuario, contrasena);
    }

    @Override
    public String getRol() {
        return "asesor inmobiliario";
    }

    @Override
    public boolean tienePermiso(String modulo) {
        return modulo.equals("clientes") 
                || modulo.equals("ventas") 
                || modulo.equals("pagos") 
                || modulo.equals("vista_torre_piso");
    }
    
}
