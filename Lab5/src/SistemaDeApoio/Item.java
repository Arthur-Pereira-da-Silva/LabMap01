package src.SistemaDeApoio;

// Representa um item
public class Item {

    private float preco;
    private String nome;
    private String descricao;

    // Construtor que define o preço e nome do item
    public Item(float preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    // Construtor que define o preço, nome e descrição do item
    public Item(float preco, String nome, String descricao) {
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Métodos getters e setters para os atributos do item
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Sobrescrita do método toString para fornecer informações sobre o item
    @Override
    public String toString() {
        return "Descrição do produto: " + "\nNome: " + nome + "\nPreço: " + preco + "\nDescrição: " + descricao;
    }

}
