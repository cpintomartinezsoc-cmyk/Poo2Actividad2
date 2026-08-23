package model;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm, "Encomienda");
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (20 + (1.5 * distanciaKm));
    }
}