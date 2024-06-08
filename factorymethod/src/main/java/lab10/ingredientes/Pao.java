package lab10.ingredientes;

public class Pao {
    private String tipo;

    public Pao(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Pao{" + "tipo='" + tipo + '\'' + '}';
    }
}
