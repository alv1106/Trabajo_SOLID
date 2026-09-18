public class ReciboImpresor {
    private final Impresora impresora;

    public ReciboImpresor(Impresora impresora) {
        this.impresora = impresora;
    }

    public void imprimir(Pedido pedido, double total) {
        impresora.imprimir("Recibo de " + pedido.getCliente() + ": $" + total);
    }
}