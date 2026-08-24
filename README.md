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
