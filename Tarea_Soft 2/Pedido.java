import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.fecha = new Date();
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println(" - " + p.informacion());
        }
    }
}
