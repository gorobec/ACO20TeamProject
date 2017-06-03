import org.junit.Assert;
import org.junit.Test;

/**
 * tests for Dynamicgroup
 */
public class DynamicGroupTests {
    @Test
    public void checkGroupSizing() {

        Student[] arSt2 = new Student[]{
                new Student("st_name1"),
                new Student("st_name2"),
                new Student("st_name3"),
                null,
                new Student("st_name4"),
                new Student("st_name5")
        };

        DynamicGroup gr1 = new DynamicGroup(1, arSt2);

        Assert.assertFalse(gr1.addStudent(null));
        Assert.assertTrue(gr1.getSize() == Group.INIT_GR_SIZE);

        Assert.assertTrue(gr1.addStudent(new Student("st_name6")));
        Assert.assertTrue(gr1.addStudent(new Student("name7")));
        // Assert.assertEquals(gr1.students.length, (Group.INIT_GR_SIZE + 1) * 15 / 10);
        // Assert.assertEquals(gr1.size, 7);

        System.out.println(gr1.toString());
    }
}
