/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author Carles
 */
public class Penthouse extends UnidadesInmobiliarias{
    public Penthouse(String código, String torre, int piso, double areaTechadaM2, double areaLibreM2, int numDormitorios, String vista, double precioBaseM2, String tipo, String estado) {
        super(código, torre, piso, areaTechadaM2, areaLibreM2, numDormitorios, vista, precioBaseM2, tipo, estado);
    }

    @Override
    public double calcularPrecio() {
        double recargoVista;
        if (vista.equalsIgnoreCase("interior")) {
            recargoVista = 20;
        }else {
            recargoVista = 50;
        }
        
        double recargoAzotea = 100;
        
        return precioBaseM2*(areaLibreM2+areaTechadaM2)+recargoVista+recargoAzotea;
    }
    
}
