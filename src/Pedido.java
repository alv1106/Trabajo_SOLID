// ==========================================================
// Sistema de gestión de pedidos de un restaurante (versión CON violaciones)
// ==========================================================

public class Pedido {

    private String cliente;
    private String tipoCliente; // "REGULAR", "VIP", "EMPLEADO"
    private List<String> platos = new ArrayList<>();
    private List<Double> precios = new ArrayList<>();

    public void agregarPlato(String nombre, double precio) {
        platos.add(nombre);
        precios.add(precio);
    }

    // REVISAR (1): calcula el total Y decide el descuento con un if/else
    // que crece cada vez que el restaurante inventa un tipo de cliente nuevo.
    public double calcularTotal() {
        double subtotal = 0;
        for (double precio : precios) {
            subtotal += precio;
        }

        if (tipoCliente.equals("REGULAR")) {
            return subtotal;
        } else if (tipoCliente.equals("VIP")) {
            return subtotal * 0.9;
        } else if (tipoCliente.equals("EMPLEADO")) {
            return subtotal * 0.5;
        }
        return subtotal;
    }

    // REVISAR (2): Pedido también sabe persistir datos...
    public void guardarEnBaseDeDatos() {
        System.out.println("Conectando a la BD...");
        System.out.println("INSERT INTO pedidos VALUES (...)");
    }

    // REVISAR (2): ...y también sabe imprimir recibos...
    public void imprimirRecibo() {
        ImpresoraTermica impresora = new ImpresoraTermica();
        impresora.imprimir("Recibo de " + cliente + ": $" + calcularTotal());
    }

    // REVISAR (2): ...y también sabe enviar correos. Una sola clase, cuatro trabajos.
    public void enviarCorreoConfirmacion() {
        System.out.println("Enviando correo de confirmación a " + cliente + "...");
    }

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }
}