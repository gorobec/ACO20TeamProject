package data_structures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by gorobec on 18.06.17.
 */
public class MyTreeSetTest {

    private MyTreeSet<String> set;

    @Before
    public void setup(){
        set = new MyTreeSet<>();
    }

    @Test
    public void test_add_root(){
        assertEquals(0, set.size());
        assertTrue(set.add("1"));
        assertEquals(1, set.size());
    }

    @Test
    public void test_add_root_left_child(){
        assertEquals(0, set.size());
        assertTrue(set.add("1"));
        assertEquals(1, set.size());
        assertTrue(set.add("0"));
        assertEquals(2, set.size());;
    }

    @Test
    public void test_add_root_right_child(){
        assertEquals(0, set.size());
        assertTrue(set.add("1"));
        assertEquals(1, set.size());
        assertTrue(set.add("2"));
        assertEquals(2, set.size());
    }
    @Test
    public void test_add_mane_elements(){
        assertEquals(0, set.size());
        assertTrue(set.add("1"));
        assertEquals(1, set.size());
        assertTrue(set.add("4"));
        assertEquals(2, set.size());
        assertTrue(set.add("2"));
        assertEquals(3, set.size());
        assertTrue(set.add("6"));
        assertEquals(4, set.size());
    }

}
