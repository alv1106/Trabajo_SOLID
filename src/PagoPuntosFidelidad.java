// REVISAR (3): esta subclase no puede cumplir lo que promete la superclase.
class PagoPuntosFidelidad extends MetodoPago {
    private double puntosDisponibles = 20.0;

    @Override
    public void cobrar(double monto) {
        if (monto > puntosDisponibles) {
            throw new IllegalStateException("No hay suficientes puntos para cobrar este monto.");
        }
        System.out.println("Cobrando $" + monto + " con puntos de fidelidad.");
    }
}
