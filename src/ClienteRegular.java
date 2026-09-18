public class ClienteRegular implements TipoCliente {

    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal;
    }
    
}
