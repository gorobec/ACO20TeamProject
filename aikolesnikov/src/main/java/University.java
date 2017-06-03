/**
 * University of universities class
 */
public class University {
    protected static final int INIT_UN_SIZE = 5;
    protected int id;
    protected int size;
    protected Group[] groups;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        groups = new Group[INIT_UN_SIZE];
        size = 0;
    }

    public University(int id) {
        this.id = id;
        this.groups = new Group[INIT_UN_SIZE];
        size = 0;
    }

    public University(int id, Group[] groups) {
        this.id = id;
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
        if ((group == null) || (size == groups.length)) return false;

        for (int i = groups.length - 1; i >= 0; i--) {
            if (groups[i] == null) {
                groups[i] = group;
                size++;
                return true;
            }
        }
        return false;
    }

    public int findGroup(Group group) {
        if (group != null) {
            for (int i = 0; i < groups.length; i++) {
                if (group.equals(groups[i])) return i;
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
            if (index < 0 || index > this.groups.length - 1) return false;
            System.arraycopy(groups, index + 1, groups, index, groups.length - 1 - index);
            size--;
            groups[groups.length - 1] = null;
            return true;
        }
        return false;
    }

    public boolean deleteGroupInd(int index) {
        if (index < 0 || index > this.groups.length - 1) return false;
        System.arraycopy(groups, index + 1, groups, index, groups.length - 1 - index);
        size--;
        groups[groups.length - 1] = null;
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
                if ((groups[j - 1] == null) ||
                        (groups[j] != null) && (groups[j - 1] != null) &&
                                (groups[j].getId() > groups[j - 1].getId())){
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
                str = str.concat(group.toString().concat(";"));
            else str = str.concat("null;");
        }

        return "University " + id + " includes:\n" + str;
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (!(o.getClass() == this.getClass()))) return false;
        University tmpO = (University) o;
        if ((groups == null) || (tmpO.getGroups() == null)) return false;
        int len = groups.length;
        if (len != tmpO.getGroups().length) return false;
        for (int i = 0; i < len; i++) {
            if ((tmpO.getGroups()[i] == null) && (groups[i] != null)) return false;
            if ((tmpO.getGroups()[i] != null) && (groups[i] == null)) return false;
            if (((tmpO.getGroups()[i] != null) && (groups[i] != null)) &&
                    (!(tmpO.getGroups()[i].equals(groups[i]))))
                return false;
        }
        return (tmpO.id == id) && (tmpO.size == size);
    }

}
