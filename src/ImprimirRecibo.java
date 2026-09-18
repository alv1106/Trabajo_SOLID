public class ImprimirRecibo {
    private Impresora impresora;

    public ImprimirRecibo(Impresora impresora) {
        // se rexibe la interfaz desde afuera por el constructor
        this.impresora = impresora;
    }

    public void imprimir(Pedido pedido, double total) {
        impresora.imprimir("Recibo de " + pedido.getCliente() + ": $" + total);
    }
    /* 
    antes estaba en pedido que era de alto nive, pero ahora actua como su 
    propia clase de alto nivel donde esta la logica de imprimir

    public void imprimirRecibo() {
        ImpresoraTermica impresora = new ImpresoraTermica();
        pedido dependia de este objeto que era de bajo nivel por que solo era un detalle
        de impresion
        impresora.imprimir("Recibo de " + cliente + ": $" + calcularTotal());
    }
    */
}