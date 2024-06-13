import Restaurante.Restaurante;
import factories.SanduicheFactory;

public class Main {
    public static void main(String[] args) {
        SanduicheFactory factory1 = Restaurante.obterFactory("integral");
        String sanduiche1 = factory1.criarSanduiche();
        System.out.println(sanduiche1);
        System.out.println("-------------------------");

        SanduicheFactory factory2 = Restaurante.obterFactory("frances");
        String sanduiche2 = factory2.criarSanduiche();
        System.out.println(sanduiche2);        
        System.out.println("-------------------------");

        SanduicheFactory factory3 = Restaurante.obterFactory("bola");
        String sanduiche3 = factory3.criarSanduiche();
        System.out.println(sanduiche3);
    }
}
