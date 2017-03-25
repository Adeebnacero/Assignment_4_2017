package cput.ac.za.Question1;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class runSports {

    public static void main(String [] args){

        Football footy1 = new Football("Round","Manchester",11,"Manchester United",28);
        Rugby rugga1 = new Rugby("Oval","Cape Town",15,"Stormers",5);
        Basketball ball1 = new Basketball("Round","Cleveland",5,"Cleveland Cavaliers",18);

        System.out.println(footy1.toString());
        System.out.println(rugga1.toString());
        System.out.println(ball1.toString());
    }
}
