/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author Carles
 */
public class Flat extends UnidadesInmobiliarias{
    public Flat(String código, String torre, int piso, double areaTechadaM2, double areaLibreM2, int numDormitorios, String vista, double precioBaseM2, String tipo, String estado) {
        super(código, torre, piso, areaTechadaM2, areaLibreM2, numDormitorios, vista, precioBaseM2, tipo, estado);
    }

    @Override
    public double calcularPrecio() {
        double recargoPorPiso = 20*(piso-5);
        if (piso>5) {
            return (precioBaseM2*(areaTechadaM2+areaLibreM2)+recargoPorPiso);
        }
        return (precioBaseM2*(areaTechadaM2+areaLibreM2));
    }
    
}
