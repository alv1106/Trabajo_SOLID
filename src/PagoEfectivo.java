class PagoEfectivo extends MetodoPago {
    @Override
    public boolean cobrar(double monto) {
        System.out.println("Cobrando $" + monto + " en efectivo.");
        return true;
    }
}