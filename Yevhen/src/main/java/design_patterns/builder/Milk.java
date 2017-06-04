package design_patterns.builder;

/**
 * Created by gorobec on 04.06.17.
 */
public class Milk {
    private final int volume;
    private final int proteins;
    private final int fats;
    private final int carbohydrates;
    private final int vitamins;
    private final int minerals;
    private final int water;
    private final int price;


    private Milk(MilkBuilder milkBuilder) {

        this.volume = milkBuilder.volume;
        this.proteins = milkBuilder.proteins;
        this.fats = milkBuilder.fats;
        this.carbohydrates = milkBuilder.carbohydrates;
        this.vitamins = milkBuilder.vitamins;
        this.minerals = milkBuilder.minerals;
        this.water = milkBuilder.water;
        this.price = milkBuilder.price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Milk{");
        sb.append("volume=").append(volume).
        append(", proteins=").append(proteins).
        append(", fats=").append(fats).
        append(", carbohydrates=").append(carbohydrates).
        append(", vitamins=").append(vitamins).
        append(", minerals=").append(minerals).
        append(", water=").append(water).
        append(", price=").append(price).
        append('}');
        return sb.toString();
    }



    public static class MilkBuilder{

        private int volume;
        private int proteins;
        private int fats;
        private int carbohydrates;
        private int vitamins;
        private int minerals;
        private int water;
        private int price;

        public MilkBuilder() {
        }


        public MilkBuilder setVolume(int volume) {
            this.volume = volume;
            return this;
        }

        public MilkBuilder setProteins(int proteins) {
            this.proteins = proteins;
            return this;
        }

        public MilkBuilder setFats(int fats) {
            this.fats = fats;
            return this;
        }

        public MilkBuilder setCarbohydrates(int carbohydrates) {
            this.carbohydrates = carbohydrates;
            return this;
        }

        public MilkBuilder setVitamins(int vitamins) {
            this.vitamins = vitamins;
            return this;
        }

        public MilkBuilder setMinerals(int minerals) {
            this.minerals = minerals;
            return this;
        }

        public MilkBuilder setWater(int water) {
            this.water = water;
            return this;
        }

        public MilkBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Milk build(){
            return new Milk(this);
        }
    }

}
