package globoFilmes.entidades;

public class Cinegrafista implements Funcionario {
    private String nome;

    public Cinegrafista(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getFuncao() {
        return "Cinegrafista";
    }
}