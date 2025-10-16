public class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    private Impresion(Builder builder) {
        super(builder.numero);
        this.color = builder.color;
        this.fotos = builder.fotos;
    }

    @Override
    public String informacion() {
        return "Impresión " + getNumero() + " | Color: " + color + " | Fotos: " + (fotos != null ? fotos.length : 0);
    }

    // Builder interno de impresiones
    public static class Builder {
        private int numero;
        private String color;
        private Foto[] fotos;

        public Builder setNumero(int numero) {
            this.numero = numero;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setFotos(Foto[] fotos) {
            this.fotos = fotos;
            return this;
        }

        public Impresion build() {
            return new Impresion(this);
        }
    }
}
