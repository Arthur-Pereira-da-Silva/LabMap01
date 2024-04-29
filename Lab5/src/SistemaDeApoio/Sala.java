package src.SistemaDeApoio;

// Representa uma sala na infraestrutura da instituição
public class Sala {
    
    private int num;
    private String descricao;
    private TiposDeSalas tipo = TiposDeSalas.AULA;

    // Construtor sem descrição
    public Sala(int num) {
        this.num = num;
    }

    // Construtor com tipo
    public Sala(int num, TiposDeSalas tipo) {
        this.num = num;
        this.tipo = tipo;
    }

    // Construtor completo
    public Sala(int num, TiposDeSalas tipo, String descricao) {
        this.num = num;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    // Métodos getters e setters
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TiposDeSalas getTipo() {
        return tipo;
    }

    public void setTipo(TiposDeSalas tipo) {
        this.tipo = tipo;
    }

    // Sobrescrita do método toString para fornecer informações sobre a sala
    @Override
    public String toString() {
        return "Tipo de sala: " + tipo.getTipo() + "\nNúmero: " + num + "\nDescrição: " + descricao;
    }
}
