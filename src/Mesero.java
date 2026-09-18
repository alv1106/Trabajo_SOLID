class Mesero implements Empleado {
    @Override
    public void atenderMesa() {
        System.out.println("El mesero atiende la mesa.");
    }

    @Override
    public void cocinar() {
        throw new UnsupportedOperationException("Un mesero no cocina.");
    }

    @Override
    public void repartirPedido() {
        throw new UnsupportedOperationException("Un mesero no reparte a domicilio.");
    }

    @Override
    public void cobrarEnCaja() {
        throw new UnsupportedOperationException("Un mesero no cobra en caja.");
    }
}