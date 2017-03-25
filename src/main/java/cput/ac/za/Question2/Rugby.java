package cput.ac.za.Question2;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class Rugby extends Sport {

    public Rugby(String discipline, String ballType, String topTeam){

        super(discipline,ballType,topTeam);
    }

    public int numberOfPlayers(){

        return 15;
    }

    @Override
    public String toString(){

        return super.toString() + "Number of players: " +numberOfPlayers();
    }
}
