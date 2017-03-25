package cput.ac.za.Question1;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class Basketball extends Sports{

    private String teamName;
    private int teamTitles;

    public Basketball(String ballShape,String teamCity, int numberOfPlayers, String tName, int tTitles){

        super(ballShape,teamCity, numberOfPlayers);
        this.teamName = tName;
        this.teamTitles = tTitles;
    }

    public int getTeamTitles() {
        return teamTitles;
    }

    public Basketball setTeamCity(int teamTitles) {
        this.teamTitles = teamTitles;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public Basketball setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public String toString(){

        return "Team News " + "\n" +
                "Team name: " + teamName + "\n" +"City: " + teamTitles + "\n" + super.toString();
    }
}