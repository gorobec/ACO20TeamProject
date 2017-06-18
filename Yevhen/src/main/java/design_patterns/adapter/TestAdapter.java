package design_patterns.adapter;

/**
 * Created by gorobec on 17.06.17.
 */
public class TestAdapter {
    public static void main(String[] args) {
        PoliceDepartment department = new PoliceDepartment();
        Policeman policeman = new Policeman("Smith");
        Militioner militioner = new Militioner("Stepa");
        department.hirePoliceman(policeman);
        department.hirePoliceman(new PolicemanAdapter(militioner));

        department.startWorkingDay();
    }
}
