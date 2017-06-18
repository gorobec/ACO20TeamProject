package design_patterns.adapter;

/**
 * Created by gorobec on 17.06.17.
 */
public class PolicemanAdapter extends Policeman{

    private Militioner militioner;



    public PolicemanAdapter(String name) {
        super(name);
    }

    public PolicemanAdapter(Militioner militioner){
        this.militioner = militioner;
    }

    @Override
    public void work(){
        militioner.work();
    }
}
