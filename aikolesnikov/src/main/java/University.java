/**
 * univer class
 */

public class University {
    private static final int INIT_UN_SIZE = 5;
    private int id;
    private String name;
    private int size;
    private Group[] groups;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public static int getInitGrSize() {
        return INIT_UN_SIZE;
    }

    public University() {
        this.groups = new Group[INIT_UN_SIZE];
        size = 0;
    }

    public University(int id) {
        this.id = id;
        this.groups = new Group[INIT_UN_SIZE];
        size = 0;
    }


    public University(int id, String name, Group[] groups) {
        this.id = id;
        this.name = name;
        if (groups == null) {
            this.groups = new Group[INIT_UN_SIZE];
            this.size = 0;
        } else {
            this.groups = groups;
            for (Group group : groups) {
                if (!(group == null)) size++;
            }
        }
    }

    public boolean addGroup(Group group) {
        if (group == null) return false;
        if (this.size == groups.length) return false;

        for (int i = 0; i < groups.length - 1; i++) {
            if (groups[i] == null) {
                groups[i] = group;
                size++;
                return true;
            }
        }
        groups[size] = group;

        return true;
    }

    public int findGroup(Group group) {
        if (group != null) {
            for (int i = 0; i < groups.length; i++) {
                if (group == groups[i]) return i;
            }
            return -1;
        }
        for (int i = 0; i < groups.length; i++) {
            if (null == groups[i]) return i;
        }
        return -1;

    }

    public boolean deleteGroup(Group group) {

        int index = findGroup(group);
        if (findGroup(group) != -1) {
            Group[] newAr = new Group[this.groups.length - 1];
            this.size--;

            System.arraycopy(this.groups, 0, newAr, 0, index);
            System.arraycopy(this.groups, index + 1, newAr, index, this.groups.length - 1 - index);

            this.groups = newAr;
            return true;
        }
        return false;
    }

    public boolean deleteGroupInd(int index) {

        if (index < 0 || index > this.groups.length - 1) return false;

        Group[] newAr = new Group[this.groups.length - 1];
        this.size--;

        System.arraycopy(this.groups, 0, newAr, 0, index);
        System.arraycopy(this.groups, index + 1, newAr, index, this.groups.length - 1 - index);

        this.groups = newAr;
        return true;
    }

    public boolean replaceGroup(int index, Group group) {
        if (index < 0 || index > this.groups.length - 1) return false;
        this.groups[index] = group;

        return true;
    }

    public void sortGroups() {
        int bound = groups.length;
        Group tmpSt;

        for (int i = 0; i < bound; i++) {
            for (int j = bound - 1; j > i; j--) {
                if (groups[j].getId() < groups[j - 1].getId()) {
                    tmpSt = groups[j];
                    groups[j] = groups[j - 1];
                    groups[j - 1] = tmpSt;
                }
            }
        }
    }


    @Override
    public String toString() {
        String str = "";
        for (Group group : groups) {
            if (!(group == null))
                str = str.concat(group.getId() + ";");
            else str = str.concat("null;");
        }

        return name + " groups: " + str;
    }

    @Override
    public boolean equals(Object gr) {
        return gr != null &&
                // gr instanceof Group &&
                gr.getClass() == this.getClass() &&
                this.toString().equals(gr.toString());
    }

}
