package factories;

import ingredientes.*;

public class SanduicheBolaFactory implements SanduicheFactory {
    public Pao criarPao() {
        return new PaoBola();
    }
    public Queijo criarQueijo() {
        return new QueijoCheddar();
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
        return "Sanduíche BOLA";
    }
}
