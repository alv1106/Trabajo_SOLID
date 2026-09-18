public class CalculadoraTotal {
    public double calcular(Pedido pedido){
        return pedido.getTipoCliente().aplicarDescuento(pedido.calcularSubtotal());
    }
}
