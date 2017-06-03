package week4.day1.generics.Intro;

import java.util.Arrays;
import java.util.List;

public class SomeTypeTest {
    public static void main(String[] args) {
        SomeType<?> someType = new SomeType();
        List<String> list = Arrays.asList("value");
        someType.test(list);
    }
}
