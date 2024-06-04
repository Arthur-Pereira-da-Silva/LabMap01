package ObserverMVC.model;

public class Assentos {
    private int numero;
    private StatusEnum status;

    public Assentos(int numero, StatusEnum status) {
        this.numero = numero;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getStatusColorido() {
        switch (status) {
            case DISPONIVEL:
                return "\033[32m" + status + "\033[0m"; // Verde
            case RESERVADO:
                return "\033[33m" + status + "\033[0m"; // Amarelo
            case INDISPONIVEL:
                return "\033[31m" + status + "\033[0m"; // Vermelho
            default:
                return status.toString();
        }
    }
}
