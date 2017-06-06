package week4.day2.TestBinarySearchComparator;

public class Star implements Comparable<Star> {
    private String name;
    private int brightness;

    public Star(String name, int brightness) {
        this.name = name;
        this.brightness = brightness;
    }

    public String getName() {
        return name;
    }

    public int getBrightness() {
        return brightness;
    }

    @Override
    public int compareTo(Star o) {
        int result = this.name.compareTo(o.name);
        if (result != 0) return result;
        return this.brightness - o.brightness;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", brightness=" + brightness +
                '}';
    }
}
