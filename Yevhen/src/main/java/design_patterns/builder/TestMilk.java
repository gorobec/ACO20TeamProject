package design_patterns.builder;

/**
 * Created by gorobec on 04.06.17.
 */
public class TestMilk {
    public static void main(String[] args) {
        Milk.MilkBuilder builder = new Milk.MilkBuilder().setVitamins(15).
                setCarbohydrates(25).setFats(15).
                setPrice(13).setMinerals(2);


        builder.setProteins(60);


        System.out.println(builder.build());
    }
}
