package restaurante;
import factories.SanduicheBolaFactory;
import factories.SanduicheFactory;
import factories.SanduicheFrancesFactory;
import factories.SanduicheIntegralFactory;

public class Restaurante {
    public static SanduicheFactory obterFactory(String tipo) {
        switch (tipo) {
            case "integral":
                return new SanduicheIntegralFactory();
            case "frances":
                return new SanduicheFrancesFactory();
            case "bola":
                return new SanduicheBolaFactory();
            default:
                throw new IllegalArgumentException("Tipo de sanduíche desconhecido");
        }
    }
}
