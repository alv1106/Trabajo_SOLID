public class CalculadoraTodal {
    public double calcular(Pedido pedido){
        return pedido.getTipoCliente().aplicarDescuento(pedido.calcularSubtotal());
    }
}
