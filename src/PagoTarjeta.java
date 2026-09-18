class PagoTarjeta extends MetodoPago {
    @Override
    public void cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " con tarjeta.");
    }
}
