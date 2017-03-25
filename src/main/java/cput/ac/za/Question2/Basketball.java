package cput.ac.za.Question2;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class Basketball extends Sport {

    public Basketball(String discipline, String ballType, String topTeam){

        super(discipline,ballType,topTeam);
    }

    public int numberOfPlayers(){

        return 5;
    }

    @Override
    public String toString(){

        return super.toString() + "Number of players: " +numberOfPlayers();
    }
}
