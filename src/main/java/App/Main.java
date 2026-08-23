package App;

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        Pedido comida = new PedidoComida(
                14,
                "Av. Consistorial ",
                2
        );

        Pedido encomienda = new PedidoEncomienda(
                4131,
                "Av. Volcanes",
                16
        );

        Pedido express = new PedidoExpress(
                1241,
                "Av. Puerto Montt",
                32
        );


        comida.mostrarResumen();
        System.out.println("Tiempo estimado: "
                + comida.calcularTiempoEntrega()
                + " minutos");

        System.out.println("-------------------------");

        encomienda.mostrarResumen();
        System.out.println("Tiempo estimado: "
                + encomienda.calcularTiempoEntrega()
                + " minutos");

        System.out.println("-------------------------");

        express.mostrarResumen();
        System.out.println("Tiempo estimado: "
                + express.calcularTiempoEntrega()
                + " minutos");
    }
}