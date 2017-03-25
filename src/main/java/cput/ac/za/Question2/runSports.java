package cput.ac.za.Question2;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class runSports {

    public static void main( String[] args )
    {
        Football soccer = new Football("Soccer","Round","Manchester United");
        Rugby rugga = new Rugby("Rugby","Oval","Stormers");
        Basketball ball = new Basketball("Basketball","Round","Cleveland Cavaliers");

        System.out.printf(soccer.toString()+"\n"+"\n");
        System.out.printf(rugga.toString()+"\n"+"\n");
        System.out.printf(ball.toString()+"\n"+"\n");
    }
}