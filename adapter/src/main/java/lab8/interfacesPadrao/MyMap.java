package lab8.interfacesPadrao;

import java.util.Collection;

public interface MyMap<K, V> {
    void clear();
    boolean containsKey(Object key);
    boolean containsValue(Object value);
    boolean equals(Object o);
    V get(Object key);
    boolean isEmpty();
    V put(K key, V value);
    V remove(Object key);
    int size();
    Collection<V> values();
}