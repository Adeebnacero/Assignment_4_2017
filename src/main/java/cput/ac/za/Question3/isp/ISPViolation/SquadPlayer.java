package cput.ac.za.Question3.isp.ISPViolation;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class SquadPlayer implements PlayerInterface{

    public String play() {

        System.out.println("Squad Player");

        return "Squad Player";
    }

    public void incentives() {

        System.out.println("Appearance fee");
    }

    public void teamRep() {

        //Not required
    }
}
