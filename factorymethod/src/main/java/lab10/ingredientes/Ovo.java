package lab10.ingredientes;

public class Ovo {
    private String tipo;

    public Ovo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Ovo{" + "tipo='" + tipo + '\'' + '}';
    }
}
