public abstract class Producto {
    private int numero;

    protected Producto(int numero) { // protected para permitir herencia
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public abstract String informacion();
}
