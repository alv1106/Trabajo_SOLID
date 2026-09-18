public class DescuentoVip implements Descuento {
    public double aplicar(double subtotal) {
        return subtotal * 0.9;
    }
}