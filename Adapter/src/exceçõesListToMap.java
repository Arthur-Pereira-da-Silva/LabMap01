import org.javatuples.Pair;

public class exceçõesListToMap {
    public static void main(String[] args) {
        AdapterListoToMap adapter = new AdapterListoToMap();

        // Adicionar pares chave-valor à lista
        adapter.put(new Pair<>("chave1", "valor1"));
        adapter.put(new Pair<>("chave2", "valor2"));
        adapter.put(new Pair<>("chave3", "valor3"));

        // Verificar se a lista está vazia
        System.out.println("A lista está vazia? " + adapter.isEmpty()); // Deve imprimir false

        // Obter o tamanho da lista
        System.out.println("Tamanho da lista: " + adapter.size()); // Deve imprimir 3

        // Tentar chamar métodos não suportados
        try {
            adapter.containsKey("chave1");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            adapter.containsValue("valor1");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            adapter.equals();
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            adapter.get("chave1");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            adapter.remove("chave1");
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            adapter.values();
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        adapter.clear();
        System.out.println("Tamanho da lista após limpar: " + adapter.size());
        System.out.println("A lista está vazia após limpar? " + adapter.isEmpty());

    }
}




