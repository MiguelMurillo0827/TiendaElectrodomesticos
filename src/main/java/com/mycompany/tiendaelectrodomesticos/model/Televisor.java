/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaelectrodomesticos.model;

/**
 *
 * @author jamin
 */
public class Televisor extends Electrodomestico {

    private double tamanoPantalla;
    private String resulucion;
    private String tipoPantalla;

    public Televisor(double tamanoPantalla, String resulucion, String tipoPantalla, String nombre, String codigo, double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora) {
        super(nombre, codigo, alto, ancho, largo, color, precio, marca, wattsPorHora);
        this.tamanoPantalla = tamanoPantalla;
        this.resulucion = resulucion;
        this.tipoPantalla = tipoPantalla;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResulucion() {
        return resulucion;
    }

    public void setResulucion(String resulucion) {
        this.resulucion = resulucion;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }
    
    @Override
  public double calcularConsumoMensual(){
    return getWattsPorHora()*8*30; //Calcular el total de vatios del electrodomestico teniendo en cuenta las horas de uso de horas al día y al mes 
}        
    
    
}
