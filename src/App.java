import java.util.List;
public class App {
    public static void main(String[] args) {

        // Pedido pedido = new Pedido();
        // pedido.setCliente("Ana");
        // pedido.setTipoCliente("VIP");
        // Pedido ya no tiene constructor vacío ni setters: el cliente y el
        // tipo de descuento se pasan directo al constructor. "VIP" ya no es
        // un String, es una instancia de TipoCliente.

        /*/
        El pedido original 
        */
        Pedido pedido = new Pedido("Ana", new ClienteVip());
        pedido.agregarPlato("Bandeja paisa", 28000);
        pedido.agregarPlato("Limonada", 6000);

        // System.out.println("Total: " + pedido.calcularTotal());
        // calcularTotal() ya no existe en Pedido: el cálculo con descuento
        // se movió a CalculadoraTodal (Pedido solo sabe su subtotal).
        CalculadoraTotal calculadora = new CalculadoraTotal();
        System.out.println("Total: " + calculadora.calcular(pedido));

        // pedido.guardarEnBaseDeDatos();
        // Este método no existe en ninguna clase del proyecto (no hay un
        // PedidoRepository ni similar en el src). Queda comentado porque
        // no hay con qué reemplazarlo todavía.

        /* 
        //pedido.imprimirRecibo();
        pedido ya no tiene el metodo imprimir recibo
        pedido.enviarCorreoConfirmacion();
        */
       Impresora termica = new ImpresoraTermica();
       ImprimirRecibo impresion = new ImprimirRecibo(termica);
       impresion.imprimir(pedido, pedido.calcularSubtotal());

        // pedido.enviarCorreoConfirmacion();
        // Pedido nunca tuvo (ni tiene ahora) este método: la responsabilidad
        // de notificar por correo vive en su propia clase, inyectada con el
        // pedido como parámetro.
        new enviarCorreoConfirmacion().enviarConfirmacion(pedido);

        // El código cliente confía en que TODO MetodoPago se puede cobrar igual...
        /* 
        El código cliente confía en que TODO MetodoPago se puede cobrar igual, sin embargo
        cada metodo de pago puede cobrarse o no asi que no romperia el codigo
        */

        List<MetodoPago> pagosDelDia = List.of(
                new PagoTarjeta(),
                new PagoEfectivo(),
                new PagoPuntosFidelidad());


        /* 
        for (MetodoPago pago : pagosDelDia) {
            pago.cobrar(15000); // esto revienta con PagoPuntosFidelidad si el monto supera los puntos
        }
        */

        for (MetodoPago pago : pagosDelDia) {
            if (!pago.cobrar(15000)) {
                System.out.println("No se pudo procesar el pago con puntos de fidelidad.");
            }
        }
                
        /* 
        // El mesero queda obligado a "implementar" trabajos que no le corresponden
        Empleado mesero = new Mesero();
        mesero.atenderMesa();
        mesero ya no hereda de empleado solo implementa la interfaz especifica
        ahora mesero implementa atender mesa
        */

        // El mesero solo tiene la responsabilidad de atender mesas
        AtenderMesa mesero = new Mesero();

        mesero.atenderMesa();

        
        ImprimirRecibo imprimir = new ImprimirRecibo(termica);


        
    }

}