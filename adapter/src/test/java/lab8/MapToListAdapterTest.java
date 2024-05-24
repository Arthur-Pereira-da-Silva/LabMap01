package lab8;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import lab8.adapters.MapToListAdapter;

public class MapToListAdapterTest {

    private MapToListAdapter<Integer, String> adapter;

    @Before
    public void setUp() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        adapter = new MapToListAdapter<>(map);
    }

    @Test
    public void testGet() {
        assertEquals("Apple", adapter.get(0).getValue());
        assertEquals("Banana", adapter.get(1).getValue());
        assertEquals("Orange", adapter.get(2).getValue());
    }

    @Test
    public void testSize() {
        assertEquals(3, adapter.size());
    }

    @Test
    public void testRemove() {
        assertTrue(adapter.remove(adapter.get(1)));
        assertEquals(2, adapter.size());
        assertEquals("Orange", adapter.get(1).getValue());
    }

    @Test
    public void testIsEmpty() {
        assertFalse(adapter.isEmpty());
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd() {
        adapter.add(Map.entry(4, "Grapes"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testContains() {
        adapter.contains(Map.entry(1, "Apple"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testToArray() {
        adapter.toArray();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator() {
        adapter.iterator();
    }
}
