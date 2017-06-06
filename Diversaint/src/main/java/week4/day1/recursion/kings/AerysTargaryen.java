package week4.day1.recursion.kings;

/**
 * Created by gorobec on 03.06.17.
 */
public class AerysTargaryen extends King {
    private String victimName;
    private Integer number;

    AerysTargaryen() {

        System.out.println("Call Aerys Targaryen constructor");
        victimName = "Lyanna Stark";
        number = 150;
        speech();
    }

    @Override
    public void speech() {
        System.out.println("Burn " + victimName + "!");
    }

}
