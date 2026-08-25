//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //pedido de comida
        Pedido pedidoComida = new PedidoComida("COM-001","COMIDA", "Las Barracas 672, Maipú",29);

        System.out.println("SISTEMA DE GESTIÓN SPEEDFAST");
        System.out.println();
        pedidoComida.mostrarResumen();
        System.out.println("Tiempo Estimado de Entrega: " + pedidoComida.calcularTiempoEntrega() + " minutos");

        //pedido Tipo Encomiendo

        Pedido pedidoEncomienda = new PedidoEncomienda("ENC-010","ENCOMIENDA" ,"Santa Clara 672, las Condes", 10);

        pedidoEncomienda.mostrarResumen();
        System.out.println("Tiempo Estimado de Entrega: " + pedidoEncomienda.calcularTiempoEntrega() + " minutos");

        //pedido Express
        Pedido pedidoExpress = new PedidoExpress( "PXPRESS-034","EXPRESS","Camino Padre Hurtado 12b, Paine", 50 );
        pedidoExpress.mostrarResumen();
        System.out.println("Tiempo Estimado de Entrega: " + pedidoExpress.calcularTiempoEntrega() + " minutos");
    }
}