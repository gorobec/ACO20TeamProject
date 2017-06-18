package design_patterns.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 17.06.17.
 */
public class PoliceDepartment {
    private List<Policeman> policemen;

    public PoliceDepartment() {
        policemen = new ArrayList<>();
    }

    public void startWorkingDay(){
        for (Policeman policeman : policemen) {
            policeman.work();
        }
    }


    public boolean hirePoliceman(Policeman policeman){
        return policemen.add(policeman);
    }
}
