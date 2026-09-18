class Cocinero implements Empleado {
    @Override
    public void atenderMesa() {
        throw new UnsupportedOperationException("Un cocinero no atiende mesas.");
    }

    @Override
    public void cocinar() {
        System.out.println("El cocinero prepara el plato.");
    }

    @Override
    public void repartirPedido() {
        throw new UnsupportedOperationException("Un cocinero no reparte pedidos.");
    }

    @Override
    public void cobrarEnCaja() {
        throw new UnsupportedOperationException("Un cocinero no cobra en caja.");
    }
}