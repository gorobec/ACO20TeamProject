package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * self ArrayList
 */
public class MyArrayListTest {

    private Object[] array;
    private Object object;
    private MyArrayList myArList;

    @Before
    public void setUp() {
        array = new Object[]{1, 2, 3, 4, 5, 6};
        myArList = new MyArrayList(array);
    }

    @Test
    public void getArListObject() {
        Assert.assertTrue(myArList.get(-1) == null);
        Assert.assertTrue(myArList.get(6) == null);
        Assert.assertTrue(myArList.get(5) == myArList.getAr()[5]);
    }

    @Test
    public void checkSize() {
        Assert.assertTrue(myArList.size() == 6);
    }

    @Test
    public void checkAddObject(){
        Assert.assertTrue(myArList.add(null));
        Assert.assertNull(myArList.getAr()[6]);
        Assert.assertTrue(myArList.add(7));
        Assert.assertEquals(myArList.getAr()[7],7);
        Assert.assertTrue(myArList.size()==8);
    }

/*    @After
    public void tearDown(){
    }*/

}
