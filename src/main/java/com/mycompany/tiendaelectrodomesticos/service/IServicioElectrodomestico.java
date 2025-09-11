package com.mycompany.tiendaelectrodomesticos.service;

import com.mycompany.tiendaelectrodomesticos.model.Electrodomestico;
import com.mycompany.tiendaelectrodomesticos.model.Lavadora;
import com.mycompany.tiendaelectrodomesticos.model.Televisor;
import com.mycompany.tiendaelectrodomesticos.view.IObserver;
import java.util.List;

public interface IServicioElectrodomestico {

    public void adicionarElectrodomestico(Electrodomestico electrodomestico);

    public boolean verificarNoRepetido(Electrodomestico nuevo);

    public List<Televisor> listarTelevisores();

    public List<Lavadora> listarLavadoras();

    public Electrodomestico buscarElectrodomestico(String codigo);

    public boolean eliminarElectrodomestico(String codigo);

    public void actualizarTelevisor(String codigo, double tamanoPantalla, String resulucion, String tipoPantalla, String nombre,
            double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora, String tipo, double alcance);

    public void actualizarLavadora(String codigo, double capacidadLavadora, double cosumoAguaLavadora, String nombre, double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora);

    public double calcularConsumo(Electrodomestico e, double dias);
    
    
    public void addVentana(IObserver gui);
    
    public void deleteVentana(IObserver gui);
    
            
            
}
