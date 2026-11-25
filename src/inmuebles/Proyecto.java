/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

import java.util.Date;

/**
 *
 * @author Carles
 */
public class Proyecto {
    protected String codigo;
    protected String nombreCondominio;
    protected String dirección;
    protected String distrito;
    protected String cantidadTorres;
    protected int cantidadPisos; 
    protected Date fechaEstimada;
    protected Date fechaEntrega;

    public Proyecto(String codigo, String nombreCondominio, String dirección, String distrito, String cantidadTorres, int cantidadPisos, Date fechaEstimada, Date fechaEntrega) {
        this.codigo = codigo;
        this.nombreCondominio = nombreCondominio;
        this.dirección = dirección;
        this.distrito = distrito;
        this.cantidadTorres = cantidadTorres;
        this.cantidadPisos = cantidadPisos;
        this.fechaEstimada = fechaEstimada;
        this.fechaEntrega = fechaEntrega;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombreCondominio() {
        return nombreCondominio;
    }
    public void setNombreCondominio(String nombreCondominio) {
        this.nombreCondominio = nombreCondominio;
    }
    public String getDirección() {
        return dirección;
    }
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public String getCantidadTorres() {
        return cantidadTorres;
    }
    public void setCantidadTorres(String cantidadTorres) {
        this.cantidadTorres = cantidadTorres;
    }
    public int getCantidadPisos() {
        return cantidadPisos;
    }
    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
    public Date getFechaEstimada() {
        return fechaEstimada;
    }
    public void setFechaEstimada(Date fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }
    public Date getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
}
