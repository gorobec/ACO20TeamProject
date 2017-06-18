package design_patterns.adapter;

/**
 * Created by gorobec on 17.06.17.
 */
public class Policeman {
    private String name;

    public Policeman() {
    }

    public Policeman(String name) {
        this.name = name;
    }


    public void work(){
        System.out.println("Good worker, no bribes");
    }
}
