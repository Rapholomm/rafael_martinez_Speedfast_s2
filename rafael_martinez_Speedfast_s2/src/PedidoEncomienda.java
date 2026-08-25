public class PedidoEncomienda extends Pedido{

    public PedidoEncomienda(String idPedido, String tipoPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, tipoPedido , direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (15 + (1.5 * getDistanciaKm()));
    }
}
