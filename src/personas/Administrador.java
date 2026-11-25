/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author Carles
 */
public class Administrador extends Empleado{
    public Administrador(String dni, String nombres, String apellidos, String usuario, String contrasena) {
        super(dni, nombres, apellidos, usuario, contrasena);
    }
    
    @Override
    public String getRol() {
        return "administrador";
    }

    @Override
    public boolean tienePermiso(String modulo) {
        return modulo.equalsIgnoreCase("personal")
                || modulo.equalsIgnoreCase("proyectos")
                || modulo.equalsIgnoreCase("adicionales")
                || modulo.equalsIgnoreCase("reportes")
                || modulo.equalsIgnoreCase("vista_torre_piso");
    }
    
}
