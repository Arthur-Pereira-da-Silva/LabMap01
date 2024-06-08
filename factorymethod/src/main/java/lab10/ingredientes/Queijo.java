package lab10.ingredientes;

public class Queijo {
    private String tipo;

    public Queijo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Queijo{" + "tipo='" + tipo + '\'' + '}';
    }
}
