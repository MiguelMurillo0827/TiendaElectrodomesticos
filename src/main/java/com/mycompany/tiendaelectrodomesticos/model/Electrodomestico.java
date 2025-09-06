package com.mycompany.tiendaelectrodomesticos.model;

/**
 *
 * @author jamin
 */
public abstract class Electrodomestico {

    private String nombre;
    private String codigo;
    private double alto;
    private double ancho;
    private double largo;
    private String color;
    private double precio;
    private String marca;
    private double wattsPorHora;

    public Electrodomestico(String nombre, String codigo, double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
        this.precio = precio;
        this.marca = marca;
        this.wattsPorHora = wattsPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getWattsPorHora() {
        return wattsPorHora;
    }

    public void setWattsPorHora(double wattsPorHora) {
        this.wattsPorHora = wattsPorHora;
    }

    public double calcularConsumoMensual(double dias) {
        return this.wattsPorHora * 24 * dias; //Calcular el total de vatios del electrodomestico teniendo en cuenta que esta encedido todo el día
    }

    @Override
    public String toString() {

        return "nombre: " + nombre + "codigo: " + codigo + "alto: " + alto + "ancho: " + ancho + "largo"
                + largo + "color: " + color + "precio: " + precio + "marca: " + marca + "watts por hora: " + wattsPorHora;
    }

}
