package factories;

import ingredientes.*;

public class SanduicheFrancesFactory implements SanduicheFactory {
    public Pao criarPao() {
        return new PaoFrances();
    }
    public Queijo criarQueijo() {
        return new QueijoMussarela();
    }
    public Presunto criarPresunto() {
        return new PresuntoPeru();
    }
    public Ovo criarOvo() {
        return new OvoGranja();
    }
    public Tomate criarTomate() {
        return new Tomate();
    }
    public String getNome() {
        return "Sanduíche FRANCÊS";
    }
}
