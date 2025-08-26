package com.mycompany.tiendaelectrodomesticos.model;

public class Lavadora extends Electrodomestico implements IProgramable {

    private double capacidadKg;
    private double consumoAgua;

    public Lavadora(double capacidadKg, double consumoAgua, String nombre, String codigo, double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora) {
        super(nombre, codigo, alto, ancho, largo, color, precio, marca, wattsPorHora);
        this.capacidadKg = capacidadKg;
        this.consumoAgua = consumoAgua;
    }

    public double getCapacidadKg() {
        return capacidadKg;
    }

    public void setCapacidadKg(double capacidadKg) {
        this.capacidadKg = capacidadKg;
    }

    public double getConsumoAgua() {
        return consumoAgua;
    }

    public void setConsumoAgua(double consumoAgua) {
        this.consumoAgua = consumoAgua;
    }

    @Override
    public double calcularConsumoMensual() {
        return getWattsPorHora() * 2 * 8; //Consumo cada 2 días por semana
    }

    @Override
    public String programarInicio(String hora) {
        
        return ("La lavadora Iniciará su ciclo a las " +hora);
    }

    @Override
    public String programarApagadoAutomatico(String hora) {
        return ("La lavadora se apagará a las " +hora);
    }
}
