public class Cliente {
    private int cedula;
    private String nombre;
    private int numeroTarjetaCredito;

    public Cliente(int cedula, String nombre, int numeroTarjetaCredito) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }
}
