package week4.day1.generics.GenericContainer;

public class Phone extends Product<Phone> {
    String model;

    @Override
    boolean subCompare(Phone p) {
        if (p != null) {
            return this.model.equals(((Phone)p).model);
        }
        return false;
    }
}
