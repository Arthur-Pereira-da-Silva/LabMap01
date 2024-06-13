package factories;

import ingredientes.*;

public interface SanduicheFactory {
    Pao criarPao();
    Queijo criarQueijo();
    Presunto criarPresunto();
    Ovo criarOvo();
    Tomate criarTomate();
    String getNome();

    default String criarSanduiche() {
        Pao pao = criarPao();
        Queijo queijo = criarQueijo();
        Presunto presunto = criarPresunto();
        Ovo ovo = criarOvo();
        Tomate tomate = criarTomate();

        return "Preparando " + getNome() + " com:\n" +
                "Pão: " + pao.getTipo() + "\n" +
                "Queijo: " + queijo.getTipo() + "\n" +
                "Presunto: " + presunto.getTipo() + "\n" +
                "Ovo: " + ovo.getTipo() + "\n" +
                "Tomate: " + tomate.getTipo();
    }
}
