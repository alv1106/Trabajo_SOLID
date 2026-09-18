public class EnviarCorreoConfirmacion {
    public void enviarConfirmacion(Pedido pedido) {
        System.out.println("Enviando correo de confirmación a " + pedido.getCliente() + "...");
    }
}
