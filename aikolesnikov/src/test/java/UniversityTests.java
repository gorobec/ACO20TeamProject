import org.junit.Assert;
import org.junit.Test;

/**
 * tests for University class
 */
public class UniversityTests {
    @Test
    public void checkUniversitysCreation() {
        University un1 = new University();
        University un2 = new University(2);

        Group[] arGr = new Group[]{
                new Group(1),
                new Group(2),
                new Group(3),
        };


        Group[] arGr2 = new Group[]{
                new Group(4),
                null,
                new Group(6),
        };


        Assert.assertTrue(un1.getId() == 0);
        Assert.assertTrue(un1.getGroups().length == University.getInitGrSize());
        Assert.assertTrue(un1.getSize() == 0);

        Assert.assertTrue(un2.getId() == 2);
        Assert.assertTrue(un2.getGroups().length == University.getInitGrSize());
        Assert.assertTrue(un2.getSize() == 0);

    }

    @Test
    public void checkAddGroupsOperations(){
        University un1 = new University();
        Group gr1 = new Group();
        Assert.assertFalse(un1.addGroup(null));
        Assert.assertTrue(un1.addGroup(gr1));
        Assert.assertTrue(un1.getSize()==1);

        Group[] arGr2 = new Group[]{
                new Group(1),
                new Group(2),
                new Group(3),
                null,
                new Group(4)
        };
        University un2 = new University(2,"Univer2", arGr2);
        Assert.assertTrue(un2.getSize()==4);
        Group gr2 = new Group();

        Assert.assertTrue(un2.addGroup(gr2));
        Assert.assertTrue(un2.getSize()==5);

        Group[] arGr3 = new Group[]{
                new Group(1),
                new Group(2),
                new Group(3),
                null

        };
        University un3 = new University(3,"Univer3", arGr3);

        Group gr3 = new Group();
        Assert.assertTrue(un3.addGroup(gr3));

        Assert.assertTrue(un2.findGroup(gr2)==3);
        Assert.assertTrue(un2.findGroup(null)==-1);
    }

    @Test
    public void checkDeleteGroupsOperations(){

        University un = new University (1, "Univer1", new Group[]{
                new Group(1),
                new Group(2),
                new Group(3),

        });

        un.deleteGroup(un.getGroups()[1]);
        Assert.assertTrue(un.getGroups()[1].getId()==3);
        un.deleteGroupInd(0);
        Assert.assertTrue(un.getGroups()[0].getId()==3);
    }

    @Test
    public void checkReplaceGroupsOperations(){

        University un = new University (1, "Univer1", new Group[]{
                new Group(1),
                new Group(2),
                new Group(3),

        });

        un.replaceGroup(1, new Group(111));
        Assert.assertTrue(un.getGroups()[1].getId()==111);
        un.replaceGroup(0, null);
        Assert.assertTrue(un.getGroups()[0]==null);

    }

    @Test
    public void checkSortGroupsOperations(){

        University un = new University (1, "Univer1", new Group[]{
                new Group(4),
                new Group(2),
                new Group(3),
                new Group(111),
                new Group(0)
        });

        System.out.println(un.toString());
        un.sortGroups();
        System.out.println(un.toString());
    }
}

