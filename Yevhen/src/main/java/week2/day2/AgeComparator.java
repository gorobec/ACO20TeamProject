package week2.day2;

import week1.day1.Student;

import java.util.Comparator;

/**
 * Created by gorobec on 21.05.17.
 */
public class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
