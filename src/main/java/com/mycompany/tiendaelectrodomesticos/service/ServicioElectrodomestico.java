package com.mycompany.tiendaelectrodomesticos.service;

import com.mycompany.tiendaelectrodomesticos.model.Televisor;
import com.mycompany.tiendaelectrodomesticos.model.Lavadora;
import com.mycompany.tiendaelectrodomesticos.model.Electrodomestico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServicioElectrodomestico implements IServicioElectrodomestico {

    private List<Electrodomestico> electrodomesticos = new ArrayList<>();

    public void adicionarElectrodomestico(Electrodomestico elc) {
        electrodomesticos.add(elc);
    }

    public Electrodomestico buscarElectrodomestico(String codigo) {
        for (Electrodomestico elc : electrodomesticos) {
            if (elc.getCodigo().equals(codigo)) {
                return elc;
            }
        }
        return null;
    }

    @Override
    public List<Televisor> listarTelevisores() {
        List<Televisor> televisores = new ArrayList<>();
        for (Electrodomestico e : electrodomesticos) {

            if (e instanceof Televisor) {
                Televisor t = (Televisor) e;
                televisores.add(t);
            }
        }
        return televisores;
    }

    @Override
    public List<Lavadora> listarLavadoras() {
        List<Lavadora> lavadoras = new ArrayList<>();
        for (Electrodomestico e : electrodomesticos) {

            if (e instanceof Lavadora) {
                Lavadora t = (Lavadora) e;
                lavadoras.add(t);
            }
        }
        return lavadoras;
    }

    @Override
    public Televisor BuscarTelevisor(String codigo) {

        for (Electrodomestico e : electrodomesticos) {

            if (e instanceof Televisor) {
                if (e.getCodigo().equals(codigo)) {

                    return (Televisor) e;
                }

            }
        }
        return null;
    }

    @Override
    public Lavadora BuscarLavadora(String codigo) {

        for (Electrodomestico e : electrodomesticos) {

            if (e instanceof Lavadora) {
                if (e.getCodigo().equals(codigo)) {

                    return (Lavadora) e;
                }

            }
        }
        return null;
    }

    @Override
    public void eliminarTelevisor(String codigo) {
        Televisor t = (Televisor) buscarElectrodomestico(codigo);
        electrodomesticos.remove(t);
    }

    @Override
    public void eliminarLavadora(String codigo) {
        Lavadora l = (Lavadora) buscarElectrodomestico(codigo);
        electrodomesticos.remove(l);
    }

    @Override
    public void actualizarTelevisor(String codigo, double tamanoPantalla, String resulucion, String tipoPantalla, String nombre, double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora) {

        List<Televisor> televisores = listarTelevisores();

        for (Televisor t : televisores) {

            if (t.getCodigo().equals(codigo)) {

                t.setAlto(alto);
                t.setAncho(ancho);
                t.setColor(color);
                t.setLargo(largo);
                t.setMarca(marca);
                t.setNombre(nombre);
                t.setPrecio(precio);
                t.setResulucion(resulucion);
                t.setTamanoPantalla(tamanoPantalla);
                t.setTipoPantalla(tipoPantalla);
                t.setWattsPorHora(wattsPorHora);
            }
        }
    }

    @Override
    public void actualizarLavadora(String codigo, double capacidadLavadora, double cosumoAguaLavadora,  String nombre, double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora) {

        List<Lavadora> lavadoras = listarLavadoras();

        for (Lavadora t : lavadoras) {

            if (t.getCodigo().equals(codigo)) {

                t.setAlto(alto);
                t.setAncho(ancho);
                t.setColor(color);
                t.setLargo(largo);
                t.setMarca(marca);
                t.setNombre(nombre);
                t.setPrecio(precio);
                t.setCapacidadKg(capacidadLavadora);
                t.setConsumoAgua(cosumoAguaLavadora);
                t.setWattsPorHora(wattsPorHora);
            }
        }
    }

}
