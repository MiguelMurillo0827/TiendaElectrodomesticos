package com.mycompany.tiendaelectrodomesticos.service;

import com.mycompany.tiendaelectrodomesticos.model.Electrodomestico;
import com.mycompany.tiendaelectrodomesticos.model.Lavadora;
import com.mycompany.tiendaelectrodomesticos.model.Televisor;
import java.util.List;

public interface IServicioElectrodomestico {
    
    
    public void adicionarElectrodomestico(Electrodomestico electrodomestico);  
      
    public List<Televisor> listarTelevisores();
    public List<Lavadora> listarLavadoras();
    
    public Televisor BuscarTelevisor (String codigo);
    public Lavadora BuscarLavadora (String codigo);
    
    public void eliminarTelevisor (String codigo);
    public void eliminarLavadora (String codigo);
    
    public void actualizarTelevisor (String codigo, double tamanoPantalla, String resulucion, String tipoPantalla, String nombre, double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora);
    public void actualizarLavadora (String codigo, double capacidadLavadora, double cosumoAguaLavadora,  String nombre, double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora);
}
