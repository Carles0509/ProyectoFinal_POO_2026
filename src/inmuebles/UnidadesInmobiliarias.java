/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

/**
 *
 * @author Carles
 */
public class UnidadesInmobiliarias {
    protected String código;
    protected String torre;
    protected int piso; 
    protected double areaTechadaM2;
    protected double areaLibreM2;
    protected int numDormitorios; 
    protected String vista; 
    protected double precioBaseM2; 
    protected String tipo;
    protected String estado;

    public UnidadesInmobiliarias(String código, String torre, int piso, double areaTechadaM2, double areaLibreM2, int numDormitorios, String vista, double precioBaseM2, String tipo, String estado) {
        this.código = código;
        this.torre = torre;
        this.piso = piso;
        this.areaTechadaM2 = areaTechadaM2;
        this.areaLibreM2 = areaLibreM2;
        this.numDormitorios = numDormitorios;
        this.vista = vista;
        this.precioBaseM2 = precioBaseM2;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getCódigo() {
        return código;
    }
    public void setCódigo(String código) {
        this.código = código;
    }
    public String getTorre() {
        return torre;
    }
    public void setTorre(String torre) {
        this.torre = torre;
    }
    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    public double getAreaTechadaM2() {
        return areaTechadaM2;
    }
    public void setAreaTechadaM2(double areaTechadaM2) {
        this.areaTechadaM2 = areaTechadaM2;
    }
    public double getAreaLibreM2() {
        return areaLibreM2;
    }
    public void setAreaLibreM2(double areaLibreM2) {
        this.areaLibreM2 = areaLibreM2;
    }
    public int getNumDormitorios() {
        return numDormitorios;
    }
    public void setNumDormitorios(int numDormitorios) {
        this.numDormitorios = numDormitorios;
    }
    public String getVista() {
        return vista;
    }
    public void setVista(String vista) {
        this.vista = vista;
    }
    public double getPrecioBaseM2() {
        return precioBaseM2;
    }
    public void setPrecioBaseM2(double precioBaseM2) {
        this.precioBaseM2 = precioBaseM2;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public double calcularPrecio(){
        return precioBaseM2*(areaLibreM2+areaTechadaM2);
    }
}
