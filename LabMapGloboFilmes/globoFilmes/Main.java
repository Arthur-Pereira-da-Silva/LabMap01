package globoFilmes;

import java.util.ArrayList;
import java.util.List;

import globoFilmes.entidades.*;
import globoFilmes.tratamentoErros.*;

public class Main{
    public static void main(String[] args) throws FuncionarioNaoEncontradoException, FilmeNaoEncontradoException, RegistroFilmeException {
        ClasseControle controle = new ClasseControle();

        Funcionario eduardo = new Diretor("Eduardo");
        Funcionario paulo = new Roteirista("Paulo");
        Funcionario carlos = new Diretor("Carlos");
        Funcionario marcela = new Roteirista("Marcela");
        Funcionario fernando = new Cinegrafista("Fernando");
        Funcionario isis = new Ator("Ísis");
        

        List<Funcionario> elencoCidadeDeDeus= new ArrayList<>();
        elencoCidadeDeDeus.add(eduardo);

        List<Funcionario> elencoTropaDeElite = new ArrayList<>();
        elencoTropaDeElite.add(paulo);
        elencoTropaDeElite.add(isis);


        controle.cadastroFilme("Cidade de Deus", 2002, eduardo, paulo, fernando, elencoCidadeDeDeus);
        controle.cadastroFilme("Tropa de Elite", 2007, carlos, marcela, eduardo, elencoTropaDeElite);

        controle.detalhesFilme("Cidade de Deus");
        controle.detalhesFilme("Tropa de Elite");

        controle.filmografiaFuncionario("Eduardo");
        controle.filmografiaFuncionario("Paulo");
        controle.filmografiaFuncionario("Ísis");
        controle.filmografiaFuncionario("Fernando");
        controle.filmografiaFuncionario("Carlos");
        controle.filmografiaFuncionario("Marcela");



    }
}