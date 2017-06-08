package week4.day2.TestBinarySearchComparator;

import utils.ArrayUtils;

import java.util.Arrays;

public class StarTest {
    public static void main(String[] args) {
        Star star1 = new Star("Sun", 100);
        Star star2 = new Star("Rigel", 250);
        Star star3 = new Star("Betelgeuse", 300);
        Star star4 = new Star("Polaris", 70);
        Star star5 = new Star("Sirius", 95);
        Star star6 = new Star("Vega", 250);
        Star star7 = new Star("Antares", 180);
        Star star8 = new Star("Canopus", 300);

        Star[] stars = new Star[8];
        stars[0] = star1;
        stars[1] = star2;
        stars[2] = star3;
        stars[3] = star4;
        stars[4] = star5;
        stars[5] = star6;
        stars[6] = star7;
        stars[7] = star8;

//        System.out.println(Arrays.asList(stars));
        Arrays.sort(stars);
//        System.out.println(Arrays.asList(stars));

        StarNameComparator starNameComparator = new StarNameComparator();
        StartBrightnessComparator startBrightnessComparator = new StartBrightnessComparator();

        // take the first two stars
        // change brightness here
        Star star21 = new Star("Sun",200);
        // change name here
        Star star22 = new Star("Rigel2", 250);

        // test binarySearch with comparator
        boolean expected = true;
        boolean actual = ArrayUtils.binarySearch(stars, star21, starNameComparator);
        System.out.printf("binarySearch(), result - %s, expected - %s, actual - %s\n",
                expected == actual, expected, actual);

        actual = ArrayUtils.binarySearch(stars, star22, startBrightnessComparator);
        System.out.printf("binarySearch(), result - %s, expected - %s, actual - %s\n",
                expected == actual, expected, actual);

        expected = false;
        actual = ArrayUtils.binarySearch(stars, star22, starNameComparator);
        System.out.printf("binarySearch(), result - %s, expected - %s, actual - %s\n",
                expected == actual, expected, actual);

        actual = ArrayUtils.binarySearch(stars, star21, startBrightnessComparator);
        System.out.printf("binarySearch(), result - %s, expected - %s, actual - %s\n",
                expected == actual, expected, actual);
    }
}
