package lab8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lab8.adapters.ListToMapAdapter;
import lab8.interfacesPadrao.MyList;

public class ListToMapAdapterTest {

    private ListToMapAdapter<String> adapter;

    @Before
    public void setUp() {
        // Criando uma lista de teste
        MyList<String> list = new MyList<String>() {
            private java.util.List<String> internalList = new java.util.ArrayList<>();

            @Override
            public boolean add(String e) {
                return internalList.add(e);
            }

            @Override
            public void clear() {
                internalList.clear();
            }

            @Override
            public boolean contains(Object o) {
                return internalList.contains(o);
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                MyList<?> that = (MyList<?>) o;

                return internalList.equals(that);
            }

            @Override
            public String get(int index) {
                return internalList.get(index);
            }

            @Override
            public boolean isEmpty() {
                return internalList.isEmpty();
            }

            @Override
            public java.util.Iterator<String> iterator() {
                return internalList.iterator();
            }

            @Override
            public boolean remove(Object o) {
                return internalList.remove(o);
            }

            @Override
            public int size() {
                return internalList.size();
            }

            @Override
            public Object[] toArray() {
                return internalList.toArray();
            }
        };
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        adapter = new ListToMapAdapter<>(list);
    }

    @Test
    public void testGet() {
        assertEquals("Apple", adapter.get(0));
        assertEquals("Banana", adapter.get(1));
        assertEquals("Orange", adapter.get(2));
    }

    @Test
    public void testSize() {
        assertEquals(3, adapter.size());
    }

    @Test
    public void testRemove() {
        assertEquals("Banana", adapter.remove(1));
        assertEquals(2, adapter.size());
        assertEquals("Orange", adapter.get(1));
    }

    @Test
    public void testIsEmpty() {
        assertFalse(adapter.isEmpty());
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }
}
