public class exceçõesMapToList {
    public static void main(String[] args) {
        AdapterMapToList adapter = new AdapterMapToList();

        // Adicionar pares chave-valor ao mapa
        adapter.add("chave1", "valor1");
        adapter.add("chave2", "valor2");
        adapter.add("chave3", "valor3");

        // Verificar se o mapa está vazio
        System.out.println("O mapa está vazio? " + adapter.isEmpty()); // Deve imprimir false

        // Obter o tamanho do mapa
        System.out.println("Tamanho do mapa: " + adapter.size()); // Deve imprimir 3

        // Verificar se uma chave existe no mapa
        System.out.println("O mapa contém a chave 'chave1'? " + adapter.contains("chave1")); // Deve imprimir true
        System.out.println("O mapa contém a chave 'chave4'? " + adapter.contains("chave4")); // Deve imprimir false

        // Obter um valor com base em uma chave
        System.out.println("Valor associado à chave 'chave2': " + adapter.get("chave2")); // Deve imprimir "valor2"

        // Remover uma entrada do mapa
        adapter.remove("chave1");
        System.out.println("Tamanho do mapa após remover 'chave1': " + adapter.size()); // Deve imprimir 2

        // Limpar o mapa
        adapter.clear();
        System.out.println("Tamanho do mapa após limpar: " + adapter.size()); // Deve imprimir 0
        System.out.println("O mapa está vazio após limpar? " + adapter.isEmpty()); // Deve imprimir true

        // Tentar chamar métodos não suportados
        try {
            adapter.equals();
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            adapter.iterator();
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            adapter.toArray();
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
