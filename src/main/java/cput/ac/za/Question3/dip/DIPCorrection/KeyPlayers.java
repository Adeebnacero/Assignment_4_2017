package cput.ac.za.Question3.dip.DIPCorrection;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class KeyPlayers {

    PlayerInterface playerInterface;

    public void setPlayer(PlayerInterface p){

        playerInterface = p;
    }

    public void captains(){

        playerInterface.play();
    }
}
