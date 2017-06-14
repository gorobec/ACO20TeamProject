package week1.homework;

import javax.jws.Oneway;

/**
 * Created by saint on 18.05.17.
 */
public class University implements Cloneable{
    private String name;
    private Group[] groups;
    private int size;
    // fixed! when in groups will be null between group, size will be fixed and null will be delete

    public University(String name, Group[] groups){
        this.name = name;
        this.groups = groups;
        size = countGroups(groups);
        for (int i = 0; i < groups.length; i++)
            if (this.groups[i] == null && i != groups.length - 1)
                deleteGroup(i);
    }

    private int countGroups(Group[] groups) {
        int count = 0;
        for (Group group : groups) {
            if(group != null) count++;
        }
        return count;
    }
    // fixed! when in students will be null between students, size will be fixed and null will be delete

    public University(String name, int size){
        this.name = name;
        this.groups = new Group[size];
    }
    public String asString(){
        StringBuffer info = new StringBuffer();
        info.append(name).append("\n");
        int numberOfGroup = 1;
        for (Group group : groups) {
            if (group != null)
                info.append(numberOfGroup).append(") ").append(group.asString()).append("\n");
        }
        return info.toString();
    }
    public boolean addGroup(Group group){
        if (group == null)
            return false;
        for (int i = 0; i < size; i++) {
            if (group.equals(groups[i]))
                return false;
        }
        if (size == groups.length) {
            Group[] tempGroup = new Group[size + 1];
            System.arraycopy(groups, 0, tempGroup, 0, size);
            tempGroup[size++] = group;
            groups = tempGroup;
            return true;
        }
        groups[size++] = group;
        return true;
    }

    public boolean deleteGroup(int position){
        if (position >= size || position < 0)
            return false;
        System.arraycopy(groups, position + 1, groups, position, size - position - 1);
        groups[size - 1] = null;
        size--;
        return true;

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof University)) throw new ClassCastException();
        if (this.groups.length != ((University) obj).groups.length) return false;
        for (int i = 0; i < this.groups.length; i++) {
            if(!(this.groups[i].equals(((University) obj).groups[i]))) return false;
            for (int j = 0; j < this.groups[i].students.length; j++) {
                if (!(this.groups[i].students[j].equals(((University) obj).groups[i].students[j]))) return false;
            }
        }

        return true;
    }

    @Override
    public University clone() throws CloneNotSupportedException {
        Group[] cloneGroups = new Group[groups.length];
        for (int i = 0; i < groups.length; i++) {
            cloneGroups[i] = groups[i].clone();
        }
        University clone = (University) super.clone();
        clone.groups = cloneGroups;
        return clone;
    }


}
