package week4.day1.generics.GenericContainer;

public abstract class Product<T extends Product<T>>
        implements Comparable<T> {

    String name;
    int price;

    @Override
    public int compareTo(T p) {
        return this.price - p.price;
    }

    abstract boolean subCompare(T p);
}
