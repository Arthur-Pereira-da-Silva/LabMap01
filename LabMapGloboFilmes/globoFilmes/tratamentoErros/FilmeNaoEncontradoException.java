package globoFilmes.tratamentoErros;

public class FilmeNaoEncontradoException extends Exception {
    public FilmeNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
