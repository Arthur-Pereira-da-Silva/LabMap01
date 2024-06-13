package factories;

import ingredientes.*;

public class SanduicheIntegralFactory implements SanduicheFactory {
    public Pao criarPao() {
        return new PaoIntegral();
    }
    public Queijo criarQueijo() {
        return new QueijoPrato();
    }
    public Presunto criarPresunto() {
        return new PresuntoFrango();
    }
    public Ovo criarOvo() {
        return new OvoCapoeira();
    }
    public Tomate criarTomate() {
        return new Tomate();
    }
    public String getNome() {
        return "Sanduíche INTEGRAL";
    }
}
