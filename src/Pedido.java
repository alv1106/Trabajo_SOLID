// ==========================================================
// Sistema de gestión de pedidos de un restaurante (versión CON violaciones)
// ==========================================================

import java.util.ArrayList;
import java.util.List;

// ---------------------------------------------------------
// Modelo de datos puro: solo conoce sus propios atributos.
// ---------------------------------------------------------

public class Pedido {

    private String cliente;
    private final TipoCliente tipoCliente;
    private List<String> platos = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();

    public Pedido(String cliente, TipoCliente tipoCliente) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
    }

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }

    // (este método ya no calcula descuento, solo suma precios)

    // Single Responsability Principle (SRP)

    /*public double calcularTotal() {
        double subtotal = 0;
        for (double precio : precios) {
            subtotal += precio;
        }

        if (tipoCliente.equals("REGULAR")) {
            return subtotal;
        } else if (tipoCliente.equals("VIP")) {
            return subtotal * 0.9;
        } else if (tipoCliente.equals("EMPLEADO")) {
            return subtotal * 0.5;
        }
        return subtotal;
    }*/

    public double calcularSubtotal(){
        double subtotal = 0;
        for (double precio : precios) subtotal += precio;
        return subtotal;
    }
    /* 
    antes estaba en pedido que era de alto nivel, pero ahora actua como su 
    propia clase de alto nivel donde esta la logica de imprimir

    public void guardarEnBaseDeDatos() {
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO pedidos VALUES (...)");
    }

    public void imprimirRecibo() {
        ImpresoraTermica impresora = new ImpresoraTermica();
        pedido dependia de este objeto que era de bajo nivel por que solo era un detalle
        de impresion
        impresora.imprimir("Recibo de " + cliente + ": $" + calcularTotal());
        
    }
    public void enviarCorreoConfirmacion() {
        System.out.println("Enviando correo de confirmación a " + cliente + "...");
    }
    */

    public String getCliente() {
        return cliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public List<String> getPlatos() {
        return platos;
    }

}