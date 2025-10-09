import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Creacion del cliente
        Cliente cliente = new Cliente("123456789", "Bruce Wayne");

        // Uso de polimorfismo: Mismo comportamiento,
        // diferentes implementaciones
        Producto camara = new Camara(1, "Nike", "Cortez");
        Producto impresion = new Impresion(2, "Color", 3);

        // Acceso a métodos propios de Impresion, se hace un cast
        // (el cast lo que hace es decirle que aunque el objeto
        // es declardo como producto este es de tipo impresion y hereda sus metodos)

        ((Impresion) impresion).addFoto(new Foto("foto1.jpg"));
        ((Impresion) impresion).addFoto(new Foto("foto2.jpg"));

        // Creacion de pedido (composición: Pedido contiene Cliente y Productos)
        Pedido pedido = new Pedido(cliente, new Date(), 987654, 5);
        pedido.addProducto(camara);
        pedido.addProducto(impresion);

        // Mostrar resumen pedido
        pedido.resumenPedido();
    }
}
