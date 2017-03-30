package cput.ac.za.Question1;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class Sports {

    private String ballShape;
    private String teamCity;
    private int numberOfPlayers;

    public Sports(String bShape,String tCity, int players){

        this.ballShape = bShape;
        this.teamCity = tCity;
        this.numberOfPlayers = players;
    }

    public String getBallType() {
        return ballShape;
    }

    public Sports setBallType(String ballType) {
        this.ballShape = ballType;
        return this;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public Sports setTeamCity(String teamCity) {
        this.teamCity = teamCity;
        return this;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public Sports setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        return this;
    }

    public String toString(){

        return "Ball shape: " + ballShape +
                "\nSquadPlayers City: " + teamCity + "\n" +
                "\nNumber of Players: " + numberOfPlayers + "\n";
    }

}
