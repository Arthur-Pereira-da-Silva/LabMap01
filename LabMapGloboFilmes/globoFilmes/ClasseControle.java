package globoFilmes;

import java.util.ArrayList;
import java.util.List;

import globoFilmes.entidades.Filme;
import globoFilmes.entidades.Funcionario;
import globoFilmes.tratamentoErros.FilmeNaoEncontradoException;
import globoFilmes.tratamentoErros.FuncionarioNaoEncontradoException;
import globoFilmes.tratamentoErros.RegistroFilmeException;

public class ClasseControle {
    private List<Filme> filmesProduzidos;

    public ClasseControle() {
        this.filmesProduzidos = new ArrayList<>();
    }

    public void cadastroFilme(String nome, int ano, Funcionario diretor, Funcionario roteirista, Funcionario cinegrafista, List<Funcionario> elenco) throws RegistroFilmeException {
        if (nome == null || nome.isEmpty()) {
            throw new RegistroFilmeException("Nome do filme é inválido.");
        }


        Filme novoFilme = new Filme(nome, ano, diretor, roteirista, cinegrafista, elenco);
        filmesProduzidos.add(novoFilme);
        System.out.println("Filme produzido pela Globo Filmes");
    }


    private Filme procurarFilme(String nome) {
        for (Filme filme : filmesProduzidos) {
            if (filme.getNome().equals(nome)) {
                return filme;
            }
        }
        return null;
    }

    public void detalhesFilme(String nome) throws FilmeNaoEncontradoException {
        Filme filmeProcurado = procurarFilme(nome);
        if (filmeProcurado == null) {
            throw new FilmeNaoEncontradoException("Filme não encontrado: " + nome);
        }
        filmeProcurado.retornarCastFilme();
    }

    public void filmografiaFuncionario(String nome) throws FuncionarioNaoEncontradoException {
        System.out.println();
        System.out.println("Histórico de " + nome);
        boolean encontrado = false;

        for (Filme filme : filmesProduzidos) {
            List<Funcionario> elenco = filme.getElenco();
            for (Funcionario pessoa : elenco) {
                if (pessoa.getNome().equals(nome)) {
                    System.out.println("Filme - " + filme.getNome() + " - Ator");
                    encontrado = true;
                }
            }
            Funcionario diretor = filme.getDiretor();
            if (diretor.getNome().equals(nome)) {
                System.out.println("Filme - " + filme.getNome() + " - Diretor");
                encontrado = true;
            }
            Funcionario roteirista = filme.getRoteirista();
            if (roteirista.getNome().equals(nome)) {
                System.out.println("Filme - " + filme.getNome() + " - Roteirista");
                encontrado = true;
            }

            Funcionario cinegrafista = filme.getCinegrafista();
            if (cinegrafista.getNome().equals(nome)) {
                System.out.println("Filme - " + filme.getNome() + " - Cinegrafista");
                encontrado = true;
            }
        }

        if (!encontrado) {
            throw new FuncionarioNaoEncontradoException(nome);
        }
    }
}
