<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/0f09de39-baf6-488e-b59b-838269423a3e" />

# 🧠 Actividad Formativa – Implementando clases abstractas y polimorfismo 👤

**Nombre completo:** Camilo Pinto

**Carrera:** Analista Programador

**Asignatura:** Desarrollo Orientado a Objetos II

**Caso:** SpeedFast

---

# 📘 Descripción general del sistema

Este proyecto corresponde a una actividad de la asignatura **Desarrollo Orientado a Objetos II**.

El sistema representa distintos tipos de pedidos de la empresa de reparto a domicilio **SpeedFast**, utilizando conceptos fundamentales de la Programación Orientada a Objetos.

En esta actividad se trabaja principalmente con:

- Clases abstractas
- Herencia
- Métodos abstractos
- Sobreescritura de métodos
- Polimorfismo
- Constructores
- Uso de `super()`
- Modificador de acceso `protected`

SpeedFast ofrece tres tipos de pedidos:

- **Comida:** pedidos provenientes de restaurantes.
- **Encomienda:** documentos o paquetes.
- **Compra Express:** compras de supermercado o farmacia.

Cada tipo de pedido posee una lógica diferente para calcular su tiempo estimado de entrega.

---

# 🧱 Estructura del proyecto

```text
src/
│
├── cl.duoc.model/
│   │
│   ├── Pedido.java
│   ├── PedidoComida.java
│   ├── PedidoEncomienda.java
│   └── PedidoExpress.java
│
└── cl.duoc.app/
    │
    └── Main.java



📂 Descripción de las clases
📦 Pedido

Clase abstracta que representa un pedido genérico de SpeedFast.

Esta clase contiene la información común que poseen todos los tipos de pedidos y establece el comportamiento que deben implementar sus clases derivadas.

Atributos
idPedido
direccionEntrega
distanciaKm
tipoPedido

Los atributos utilizan el modificador protected, permitiendo que las clases hijas puedan acceder directamente a ellos.


🍔 PedidoComida

Clase que hereda de Pedido mediante extends.

Representa los pedidos provenientes de restaurantes.



📦 PedidoEncomienda

Clase que hereda de Pedido mediante extends.

Representa documentos o paquetes que deben ser entregados mediante el servicio de encomiendas.



🛒 PedidoExpress

Clase que hereda de Pedido mediante extends.

Representa las compras realizadas mediante el servicio de Compras Express, como compras de supermercado o farmacia.



🖥️ Main

Clase principal del proyecto.

Su función consiste en crear objetos de los diferentes tipos de pedidos y probar los métodos implementados.

Funciones principales
Crear un objeto PedidoComida.
Crear un objeto PedidoEncomienda.
Crear un objeto PedidoExpress.
Utilizar referencias de tipo Pedido.
Ejecutar el método mostrarResumen().
Ejecutar el método calcularTiempoEntrega().
Mostrar en consola el tiempo estimado de cada pedido.
Comprobar el comportamiento polimórfico de los diferentes tipos de pedidos.


Método abstracto

La clase Pedido contiene el método:

public abstract int calcularTiempoEntrega();

Un método abstracto no posee implementación en la clase padre.

Las clases hijas deben implementar este método utilizando @Override.

Esto permite que cada tipo de pedido tenga una lógica diferente para calcular su tiempo de entrega.

Herencia

Las clases:

PedidoComida
PedidoEncomienda
PedidoExpress

heredan de Pedido utilizando:

extends Pedido

De esta forma, las clases hijas reciben los atributos y métodos definidos en la clase padre.



▶️ Instrucciones para ejecutar el proyecto
Clonar el repositorio desde GitHub.
Abrir el proyecto en IntelliJ IDEA.
Verificar que todas las clases se encuentren organizadas en sus respectivos paquetes.
Ejecutar la clase:
cl.duoc.app.Main
Revisar los resultados mostrados en la consola.
Comparar los tiempos estimados de entrega correspondientes a cada tipo de pedido.


🔗 Repositorio GitHub

Repositorio: POO2ActividadS2
https://github.com/cpintomartinezsoc-cmyk/Poo2Actividad2.git
Fecha de entrega: 24/08/2026
