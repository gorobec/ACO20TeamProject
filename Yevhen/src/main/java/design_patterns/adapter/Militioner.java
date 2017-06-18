package design_patterns.adapter;

/**
 * Created by gorobec on 17.06.17.
 */
public class Militioner {

    private String name;

    public Militioner(String name) {
        this.name = name;
    }


    public void work(){
        System.out.println("Take bribes");
    }
}
