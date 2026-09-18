class PagoTarjeta extends MetodoPago {
    @Override
    public boolean cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " con tarjeta.");
        return true;
    }
}
