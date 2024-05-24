package lab8.cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lab8.adapters.ListToMapAdapter;
import lab8.adapters.MapToListAdapter;

public class Cliente {
    public static void main(String[] args) {
        // Criando um ArrayList diretamente
        List<String> lista = new ArrayList<>();
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        // Criando um adaptador ListToMapAdapter usando o ArrayList criado acima
        ListToMapAdapter<String> adaptadorListaParaMapa = new ListToMapAdapter<>(lista);

        // Restante do código permanece igual...
        System.out.println("Tamanho do ListToMapAdapter: " + adaptadorListaParaMapa.size());
        System.out.println("O ListToMapAdapter está vazio? " + adaptadorListaParaMapa.isEmpty());
        System.out.println("Elemento no índice 1: " + adaptadorListaParaMapa.get(1));
        System.out.println("Removendo elemento no índice 0: " + adaptadorListaParaMapa.remove(0));
        System.out.println("Tamanho do ListToMapAdapter após remoção: " + adaptadorListaParaMapa.size());

        // Continuar com o teste do MapToListAdapter
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Um");
        mapa.put(2, "Dois");
        mapa.put(3, "Três");

        MapToListAdapter<Integer, String> adaptadorMapaParaLista = new MapToListAdapter<>(mapa);

        System.out.println("\nTamanho do MapToListAdapter: " + adaptadorMapaParaLista.size());
        System.out.println("O MapToListAdapter está vazio? " + adaptadorMapaParaLista.isEmpty());
        System.out.println("Elemento no índice 1: " + adaptadorMapaParaLista.get(1));
        System.out.println("Removendo elemento no índice 0: " + adaptadorMapaParaLista.remove(0));
        System.out.println("Tamanho do MapToListAdapter após remoção: " + adaptadorMapaParaLista.size());
    }
}
