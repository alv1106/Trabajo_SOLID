import java.util.HashMap;
import java.util.Map;

public class FabricaDescuento {
    private static final Map<TipoCliente, Descuento> ESTRATEGIAS = new HashMap<>();

    static {
        ESTRATEGIAS.put(TipoCliente.REGULAR, new DescuentoRegular());
        ESTRATEGIAS.put(TipoCliente.VIP, new DescuentoVip());
        ESTRATEGIAS.put(TipoCliente.EMPLEADO, new DescuentoEmpleado());
    }

    public static Descuento obtener(TipoCliente tipo) {
        return ESTRATEGIAS.get(tipo);
    }
}
