class PagoEfectivo extends MetodoPago {
    @Override
    public void cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " en efectivo.");
    }
}