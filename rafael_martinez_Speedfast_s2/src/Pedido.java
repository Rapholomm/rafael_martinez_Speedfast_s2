public abstract class Pedido {
    private String idPedido;
    private String tipoPedido;
    private String direccionEntrega;
    private double distanciaKm;

    public Pedido() {
    }

    //constructor con los datos
    public Pedido(String idPedido, String tipoPedido ,String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.tipoPedido = tipoPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    //getter para obtener la distancia
    public double getDistanciaKm() {
        return distanciaKm;
    }

    /* Metodo cocreto*/

    public void mostrarResumen(){
        System.out.println("El pedido id: " + idPedido + " de tipo:"+ "["+tipoPedido+"]" + " ubicado en: " + "[" + direccionEntrega +"] "+"esta a: "+  distanciaKm + " Km");
    };

    public abstract int calcularTiempoEntrega();
}
