package week4.day1.generics.Intro;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndInheritance {
    public static void main(String[] args) {
        List<String> lstr = new ArrayList<>();

        // compile error
//        List<Object> lobj = lstr;
    }
}
