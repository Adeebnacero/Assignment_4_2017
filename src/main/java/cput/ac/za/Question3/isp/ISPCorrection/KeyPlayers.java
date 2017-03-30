package cput.ac.za.Question3.isp.ISPCorrection;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class KeyPlayers {

    PlayerInterface player;

    public void setPlayer (PlayerInterface p){

        player = p;
    }

    public void captains(){

        player.play();
    }
}
