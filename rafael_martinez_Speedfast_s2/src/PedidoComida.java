public class PedidoComida extends Pedido{

    public PedidoComida(String idPedido, String tipoPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, tipoPedido , direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (15 + (2 * getDistanciaKm()));

    }
}
