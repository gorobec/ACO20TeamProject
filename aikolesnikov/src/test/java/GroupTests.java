import org.junit.Assert;
import org.junit.Test;

/**
 * tests for Group class
 */
public class GroupTests {
    @Test
    public void checkGroupsCreation() {
        Group gr1 = new Group();
        Group gr2 = new Group(2);

        Student[] arSt = new Student[]{
            new Student("st_name1"),
            new Student("st_name2"),
            new Student("st_name3"),
        };

        Group gr3 = new Group(3, arSt);
        Group gr4 = new Group(4, null);

        Student[] arSt2 = new Student[]{
                new Student("st_name1", "st_surname1"),
                null,
                new Student("st_name3"),
        };

        Group gr5 = new Group(5, arSt2);
        Group gr6 = new Group(5, arSt2);

        Assert.assertTrue(gr1.getId() == 0);
        Assert.assertTrue(gr1.getStudents().length == Group.getInitGrSize());
        Assert.assertTrue(gr1.getSize() == 0);

        Assert.assertTrue(gr2.getId() == 2);
        Assert.assertTrue(gr2.getStudents().length == Group.getInitGrSize());
        Assert.assertTrue(gr2.getSize() == 0);

        Assert.assertTrue(gr3.getId() == 3);
        Assert.assertTrue(gr3.getStudents().length == 3);
        Assert.assertTrue(gr3.getSize() == 3);
        Assert.assertTrue(gr3.getStudents()[2].getName().equals("st_name3"));

        Assert.assertTrue(gr4.getStudents().length == Group.getInitGrSize());
        Assert.assertTrue(gr4.getSize()==0);

        Assert.assertTrue(gr5.getStudents().length == 3);
        Assert.assertTrue(gr5.getSize()==2);

        Assert.assertTrue(gr5.toString().equals("Group 5 includes:\nStudent: " +
                "{st_name1 st_surname1};null;Student: {st_name3};"));

        Assert.assertFalse(gr5.equals(gr1));
        Assert.assertFalse(gr6.equals(gr5));

        Student[] arSt33 = new Student[]{
                new Student("st_name1", "st_sname1", 1),
                new Student("st_name2", "st_sname2", 2),
                new Student("st_name3", "st_sname3", 3),
        };

        Group gr33 = new Group(33, arSt33);
        Group gr34 = new Group(33, arSt33);
        Assert.assertTrue(gr33.equals(gr34));
    }

    @Test
    public void checkAddStudentsOperations(){
        Group gr1 = new Group();
        Student st1 = new Student();
        Assert.assertFalse(gr1.addStudent(null));
        Assert.assertTrue(gr1.addStudent(st1));
        Assert.assertTrue(gr1.getSize()==1);

        Student[] arSt2 = new Student[]{
                new Student("st_name1"),
                new Student("st_name2"),
                new Student("st_name3"),
                null,
                new Student("st_name4")
        };
        Group gr2 = new Group(2,arSt2);
        Assert.assertTrue(gr2.getSize()==4);
        Student st2 = new Student("nn","ss",25);

        Assert.assertTrue(gr2.addStudent(st2));
        Assert.assertTrue(gr2.getSize()==5);

        Student[] arSt3 = new Student[]{
                new Student("st_name1"),
                new Student("st_name2"),
                new Student("st_name3"),
                null

        };
        Group gr3 = new Group(3,arSt3);

        Student st3 = new Student();
        Assert.assertTrue(gr3.addStudent(st3));

        Assert.assertTrue(gr2.findStudent(st2)==3);
        Assert.assertTrue(gr2.findStudent(null)==-1);
    }

    @Test
    public void checkDeleteStudentsOperations(){

        Group gr = new Group (1, new Student[]{
                new Student("student1","ss",23),
                new Student("student2","ss",23),
                new Student("student3","ss",23),
        });

        gr.deleteStudent(gr.getStudents()[1]);
        Assert.assertTrue(gr.getStudents()[1].getName().equals("student3"));
        gr.deleteStudentInd(0);
        Assert.assertTrue(gr.getStudents()[0].getName().equals("student3"));
    }

    @Test
    public void checkReplaceStudentsOperations(){

        Group gr = new Group (1, new Student[]{
                new Student("student1"),
                new Student("student2"),
                new Student("student3"),

        });

        gr.replaceStudent(1, new Student("aaa_name"));
        Assert.assertTrue(gr.getStudents()[1].getName().equals("aaa_name"));
        gr.replaceStudent(0, null);
        Assert.assertTrue(gr.getStudents()[0]==null);

    }

    @Test
    public void checkSortStudentsOperations(){

        Group gr = new Group (1, new Student[]{
                null,
                new Student("student4"),
                null,
                new Student("student2"),
                new Student("student3"),
                new Student("student_aaa"),
                null,
                new Student("student0")
        });

        System.out.println(gr.toString());
        gr.sortStudents();
        System.out.println(gr.toString());
        //Assert.assertTrue(gr.getStudents()[1].getName().equals("aaa_name"));

    }

    @Test
    public void checkGroupEqualsWhenNoStudents(){
        Group group = new Group(1);
        Group copy = new Group(1);

        group.addStudent(new Student("Smith"));
        copy.addStudent(new Student("Smith"));

        // Assert.assertEquals(group, copy);
        // Assert.assertTrue(group.equals(copy));
        Assert.assertTrue(copy.equals(group));

    }

}

