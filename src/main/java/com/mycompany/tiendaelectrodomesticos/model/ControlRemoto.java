/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaelectrodomesticos.model;

/**
 *
 * @author juanm
 */



public class ControlRemoto {
    
    private String tipo;
    private double alcance;
    private Televisor televisor;
    
    
    public ControlRemoto(String tipo, double alcance, Televisor televisor) {
        this.tipo = tipo;
        this.alcance = alcance;
        this.televisor = televisor;
    }

    public ControlRemoto() {
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public Televisor getTelevisor() {
        return televisor;
    }

    public void setTelevisor(Televisor televisor) {
        this.televisor = televisor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    
}
