public class ReciboImpresor {
    private final ImpresoraTermica impresora = new ImpresoraTermica();

    public void imprimir(Pedido pedido, double total) {
        impresora.imprimir("Recibo de " + pedido.getCliente() + ": $" + total);
    }
}