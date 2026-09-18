// REVISAR (3): esta subclase no puede cumplir lo que promete la superclase.
class PagoPuntosFidelidad extends MetodoPago {
    private double puntosDisponibles = 20.0;

    @Override
    public boolean cobrar(double monto) {
        if (monto > puntosDisponibles) {
            return false;
        }
        System.out.println("Cobrando $" + monto + " con puntos de fidelidad.");
        return true;
    }

}
