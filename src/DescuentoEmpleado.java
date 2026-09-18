public class DescuentoEmpleado implements Descuento {
    public double aplicar(double subtotal) {
        return subtotal * 0.5;
    }
}