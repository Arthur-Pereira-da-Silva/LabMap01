package lab10;

import lab10.factory.SanduicheFactory;
import lab10.sanduiches.SanduicheBolaPratoPeru;
import lab10.sanduiches.SanduicheFrancesMussarelaGranja;
import lab10.sanduiches.SanduicheIntegralCapoeira;

public class Main {
    public static void main(String[] args) {
        SanduicheFactory[] sanduiches = {
            new SanduicheIntegralCapoeira(),
            new SanduicheFrancesMussarelaGranja(),
            new SanduicheBolaPratoPeru()
        };

        for (SanduicheFactory sanduiche : sanduiches) {
            sanduiche.montarSanduiche();
            System.out.println();
        }
    }
}
