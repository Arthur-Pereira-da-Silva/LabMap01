package globoFilmes.entidades;

import java.util.List;

public class Filme {
    private String nome;
    private int ano;
    private Funcionario diretor;
    private Funcionario roteirista;
    private Funcionario cinegrafista;
    private List<Funcionario> elenco;

    public Filme(String nome, int ano, Funcionario diretor, Funcionario roteirista, Funcionario cinegrafista, List<Funcionario> elenco) {
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
        this.roteirista = roteirista;
        this.cinegrafista = cinegrafista;
        this.elenco = elenco;
    }

    public void retornarCastFilme(){
        System.out.println();
        System.out.println("Nome " + "- " + this.nome);
        System.out.println("ano " + "- " + this.ano);
        System.out.println("Cast do filme:");
        System.out.println(this.diretor.getNome() + " - Diretor");
        System.out.println(this.roteirista.getNome() + " - Roteirista");
        System.out.println(this.cinegrafista.getNome() + " - Cinegrafista");
        for(Funcionario ator : this.elenco){
            System.out.println(ator.getNome() + " - Ator");
        }
        System.out.println();
    }


    //Gets e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public Funcionario getRoteirista() {
        return roteirista;
    }

    public void setRoteirista(Funcionario roteirista) {
        this.roteirista = roteirista;
    }

    public Funcionario getCinegrafista() {
        return cinegrafista;
    }

    public void setCinegrafista(Funcionario cinegrafista) {
        this.cinegrafista = cinegrafista;
    }

    public List<Funcionario> getElenco() {
        return elenco;
    }

    public void setElenco(List<Funcionario> elenco) {
        this.elenco = elenco;
    }

    
}

