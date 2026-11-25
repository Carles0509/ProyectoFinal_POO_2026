/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import inmuebles.Proyecto;

/**
 *
 * @author Carles
 */
public class IngenieroResidente extends Empleado{
    private String cip;
    private Proyecto proyecto;

    public IngenieroResidente(String cip, Proyecto proyecto, String dni, String nombres, String apellidos, String usuario, String contrasena) {
        super(dni, nombres, apellidos, usuario, contrasena);
        this.cip = cip;
        this.proyecto = proyecto;
    }
    
    @Override
    public String getRol() {
        return "ingeniero residente";
    }

    @Override
    public boolean tienePermiso(String modulo) {
        return modulo.equals("avance_obra") 
                || modulo.equals("entrega") 
                || modulo.equals("postventa") 
                || modulo.equals("vista_torre_piso");
    }
    
}
