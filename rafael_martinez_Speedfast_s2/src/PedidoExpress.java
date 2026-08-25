public class PedidoExpress extends Pedido{

    public PedidoExpress(String idPedido, String tipoPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, tipoPedido , direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempoPedidosExpress = 10;
        if (getDistanciaKm()>5){
            tiempoPedidosExpress += 5;
        }
        return tiempoPedidosExpress;
    }
}
