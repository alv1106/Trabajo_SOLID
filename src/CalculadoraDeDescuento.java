public class CalculadoraDeDescuento {
    public double calcular(Pedido pedido) {
        double subtotal = pedido.calcularSubtotal();
        Descuento estrategia = FabricaDescuento.obtener(pedido.getTipoCliente());
        return estrategia.aplicar(subtotal);
    }
}
