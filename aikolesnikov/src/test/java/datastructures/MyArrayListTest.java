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

    @Test
    public void checkRemoveObjIndex(){

        // remove nonexistent
        Assert.assertNull(myArList.remove(-1));
        Assert.assertNull(myArList.remove(6));

        // remove last
        Assert.assertEquals(myArList.size(),6);
        Assert.assertEquals(myArList.getAr()[5],myArList.remove(5));
        Assert.assertNull(myArList.getAr()[5]);
        Assert.assertEquals(myArList.getAr()[4],5);

        Assert.assertEquals(myArList.size(),5);

        // remove first
        Assert.assertEquals(myArList.getAr()[0],myArList.remove(0));
        Assert.assertEquals(myArList.getAr()[0],2);
        Assert.assertEquals(myArList.size(),4);

        // remove second
        Assert.assertEquals(myArList.getAr()[1],myArList.remove(1));
        Assert.assertEquals(myArList.getAr()[1],4);
        Assert.assertEquals(myArList.size(),3);
    }

/*    @After
    public void tearDown(){
    }*/

}
