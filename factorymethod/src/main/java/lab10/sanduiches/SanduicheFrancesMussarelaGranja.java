package lab10.sanduiches;

import lab10.factory.SanduicheFactory;
import lab10.ingredientes.Ovo;
import lab10.ingredientes.Pao;
import lab10.ingredientes.Presunto;
import lab10.ingredientes.Queijo;
import lab10.ingredientes.Tomate;
import lab10.model.OvoEnum;
import lab10.model.PaoEnum;
import lab10.model.PresuntoEnum;
import lab10.model.QueijoEnum;

public class SanduicheFrancesMussarelaGranja extends SanduicheFactory {
    @Override
    public Pao criarPao() {
        return new Pao(PaoEnum.FRANCES.name());
    }

    @Override
    public Queijo criarQueijo() {
        return new Queijo(QueijoEnum.MUSSARELA.name());
    }

    @Override
    public Presunto criarPresunto() {
        return new Presunto(PresuntoEnum.FRANGO.name());
    }

    @Override
    public Ovo criarOvo() {
        return new Ovo(OvoEnum.GRANJA.name());
    }

    @Override
    public Tomate criarTomate() {
        return new Tomate();
    }
}
