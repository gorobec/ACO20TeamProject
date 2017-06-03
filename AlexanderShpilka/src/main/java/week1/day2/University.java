package week1.day2;

public class University {
    private String name;
    private Group[] groups;
    private int size;

    public University(String name, Group[] groups) {
        this.name = name;
        this.groups = groups;
        size = countGroups(groups);
    }

    private int countGroups(Group[] groups) {
        if (groups == null) return 0;

        int counter = 0;
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != null) {
                // move not null groups to the left
                groups[counter] = groups[i];
                counter++;
            }
        }
        // fill the rest groups array with null
        for (int i = counter; i < groups.length; i++) {
            groups[i] = null;
        }
        return counter;
    }

    public University(String name, int universitySize) {
        this.name = name;
        groups = new Group[universitySize];
        size = 0;
    }

    /*public boolean addGroup(Group group) {
        if (group == null) return false;
        if (size == groups.length) return false;

        for (int i = 0; i < size; i++) {
            if (group.equals(groups[i])) {
                return false;
            }
        }
        groups[size++] = group;
        return true;
    }*/

    public boolean addGroup(Group group) {
        if (group == null) return false;

        for (int i = 0; i < size; i++) {
            if (group.equals(groups[i])) {
                return false;
            }
        }

        if (size < groups.length) {
            groups[size++] = group;
            return true;
        } else {
            Group[] biggerGroupsArray = new Group[groups.length + 10];
            System.arraycopy(groups, 0, biggerGroupsArray, 0, groups.length);
            biggerGroupsArray[size++] = group;
            groups = biggerGroupsArray;
            return true;
        }
    }

    public boolean removeGroup(Group group) {
        if (group == null || size == 0) return false;
        int indexOfGroup = findGroupIndex(group);
        if (indexOfGroup == -1) return false;

        if (indexOfGroup == size - 1) {
            groups[indexOfGroup] = null;
        } else {
            System.arraycopy(groups, indexOfGroup+1, groups, indexOfGroup, groups.length - indexOfGroup-1);
            groups[groups.length-1] = null;
        }

        size--;
        return true;
    }

    private int findGroupIndex(Group group) {
        for (int i = 0; i < size; i++) {
            if (group.equals(groups[i])) {
                return i;
            }
        }
        // if not found
        return -1;
    }

    public String asString() {
        String toReturn = "University - " + name + "\n";
        for (int i = 0; i < size; i++) {
            toReturn += groups[i].asString() + "\n";
        }
        return toReturn;
    }
}
