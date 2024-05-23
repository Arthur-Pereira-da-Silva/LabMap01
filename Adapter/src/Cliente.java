import java.util.HashMap;
import java.util.Map;

import org.javatuples.Pair;

public class Cliente {
    public static void main(String[] args) {
        //SEÇÃO ADAPTER LIST PARA MAP
        Pair<String, String> tupla1 = new Pair<>("chave1", "valor1");
        Pair<String, String> tupla2 = new Pair<>("chave2", "valor2");
        Pair<String, String> tupla3 = new Pair<>("chave3", "valor3");
        AdapterListoToMap listaParaMapa = new AdapterListoToMap();
        listaParaMapa.put(tupla1);
        listaParaMapa.put(tupla2);
        listaParaMapa.put(tupla3);

        //listaParaMapa.containsKey("chave1");
        //listaParaMapa.containsValue("valor1");
        //listaParaMapa.equals();
        //.get("chave1");
        System.out.println(listaParaMapa.isEmpty());
        System.out.println(listaParaMapa.size());
        listaParaMapa.clear();
        //listaParaMapa.remove("chave1");
        //listaParaMapa.values();
        System.out.println("============");

        //SEÇÃO ADAPTER MAP PARA LISTA
        Map<String, String> listaMap = new HashMap<>();
        AdapterMapToList mapParaLista = new AdapterMapToList(listaMap);
        mapParaLista.add("1", "valor1");
        mapParaLista.add("2", "valor2");
        mapParaLista.add("3", "valor3");

        mapParaLista.get("1");
        System.out.println(mapParaLista.isEmpty());
        //mapParaLista.iterator();
        //mapParaLista.equals();
        System.out.println(mapParaLista.contains("1"));
        //mapParaLista.iterator();
        mapParaLista.remove("2");
        System.out.println(mapParaLista.size());
        //mapParaLista.toArray();
        mapParaLista.clear();
    }
}
