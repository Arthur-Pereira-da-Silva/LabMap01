package lab10.factory;

import lab10.ingredientes.Ovo;
import lab10.ingredientes.Pao;
import lab10.ingredientes.Presunto;
import lab10.ingredientes.Queijo;
import lab10.ingredientes.Tomate;

public abstract class SanduicheFactory {
    public abstract Pao criarPao();
    public abstract Queijo criarQueijo();
    public abstract Presunto criarPresunto();
    public abstract Ovo criarOvo();
    public abstract Tomate criarTomate();

    public void montarSanduiche() {
        Pao pao = criarPao();
        Queijo queijo = criarQueijo();
        Presunto presunto = criarPresunto();
        Ovo ovo = criarOvo();
        Tomate tomate = criarTomate();

        System.out.println("Montando sanduíche com: ");
        System.out.println(pao);
        System.out.println(queijo);
        System.out.println(presunto);
        System.out.println(ovo);
        System.out.println(tomate);
    }
}
