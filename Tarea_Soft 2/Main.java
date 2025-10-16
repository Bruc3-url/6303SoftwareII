public class Main {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(10101010, "Juan Pérez", 987654321);
        Pedido pedido1 = new Pedido(cliente1);

        // Crear productos usando Builder
        Camara camara = new Camara.Builder()
                .setNumero(1)
                .setMarca("Canon")
                .setModelo("EOS R10")
                .build();

        Foto[] fotos = { new Foto("foto1.jpg"), new Foto("foto2.jpg") };
        Impresion impresion = new Impresion.Builder()
                .setNumero(2)
                .setColor("Color")
                .setFotos(fotos)
                .build();

        // Agregar productos al pedido
        pedido1.agregarProducto(camara);
        pedido1.agregarProducto(impresion);

        // Mostrar detalles del pedido
        pedido1.mostrarPedido();
    }
}
