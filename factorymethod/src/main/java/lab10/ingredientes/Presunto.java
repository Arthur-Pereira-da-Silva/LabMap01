package lab10.ingredientes;

public class Presunto {
    private String tipo;

    public Presunto(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Presunto{" + "tipo='" + tipo + '\'' + '}';
    }
}
