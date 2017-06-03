package week4.day1.generics.Intro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GensAndInh {
    static void print(Collection<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        print(strList);
        // compile error ()method can take only Collection of String
//        print(objList);
    }
}
