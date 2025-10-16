public class Camara extends Producto {
    private String marca;
    private String modelo;

    // 🔒 Constructor privado
    private Camara(Builder builder) {
        super(builder.numero);
        this.marca = builder.marca;
        this.modelo = builder.modelo;
    }

    @Override
    public String informacion() {
        return "Cámara " + getNumero() + " | Marca: " + marca + " | Modelo: " + modelo;
    }

    // Builder interno de camaras
    public static class Builder {
        private int numero;
        private String marca;
        private String modelo;

        public Builder setNumero(int numero) {
            this.numero = numero;
            return this;
        }

        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Camara build() {
            return new Camara(this);
        }
    }
}
