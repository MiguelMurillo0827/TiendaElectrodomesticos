package com.mycompany.tiendaelectrodomesticos.service;

import com.mycompany.tiendaelectrodomesticos.model.Televisor;
import com.mycompany.tiendaelectrodomesticos.model.Lavadora;
import com.mycompany.tiendaelectrodomesticos.model.Electrodomestico;
import com.mycompany.tiendaelectrodomesticos.view.IObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServicioElectrodomestico implements IServicioElectrodomestico {

    private static ServicioElectrodomestico servicioElectrodomestico;
    private List<IObserver> ventanasCambio = new ArrayList();

    private ServicioElectrodomestico() {
    }

    public synchronized static ServicioElectrodomestico getInstance() {

        if (servicioElectrodomestico == null) {
            servicioElectrodomestico = new ServicioElectrodomestico();
        }

        return servicioElectrodomestico;
    }

    @Override
    public void addVentana(IObserver gui) {
        ventanasCambio.add(gui);
        System.out.println("Num ventanas: " + ventanasCambio.size());
    }

    @Override
    public void deleteVentana(IObserver gui) {
        ventanasCambio.remove(gui);
    }

    private void huboCambio() {
        for (IObserver gui : ventanasCambio) {
            System.out.println("Llamando Cambio desdde el servicio");
            gui.huboCambio();
        }
    }

    private List<Electrodomestico> electrodomesticos = new ArrayList<>();

    public void adicionarElectrodomestico(Electrodomestico elc) {
        electrodomesticos.add(elc);
        huboCambio();
    }

    @Override
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
    public void actualizarTelevisor(String codigo, double tamanoPantalla, String resulucion, String tipoPantalla, String nombre,
            double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora, String tipoControl, double alcance) {

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

                t.getControl().setAlcance(alcance);
                t.getControl().setTipo(tipoControl);
            }
        }

        huboCambio();
    }

    @Override
    public void actualizarLavadora(String codigo, double capacidadLavadora, double cosumoAguaLavadora, String nombre, double alto, double ancho, double largo, String color, double precio, String marca, double wattsPorHora) {

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

        huboCambio();

    }

    @Override
    public boolean verificarNoRepetido(String codigo) {
        for (Electrodomestico e : electrodomesticos) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calcularConsumo(Electrodomestico e, double dias) {
        return e.calcularConsumoMensual(dias);
    }

    @Override
    public boolean eliminarElectrodomestico(String codigo) {

        Electrodomestico e = (Electrodomestico) buscarElectrodomestico(codigo);

        if (e != null) {

            electrodomesticos.remove(e);
            huboCambio();
            return true;

        }
        return false;
    }

}
