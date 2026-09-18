public class ClienteVip implements TipoCliente{

    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal;
    }
    
}
