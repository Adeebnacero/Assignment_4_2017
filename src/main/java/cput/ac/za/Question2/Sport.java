package cput.ac.za.Question2;

/**
 * Created by Adeebo on 2017/03/25.
 */
public abstract class Sport implements SportsInterface {

    private String discipline;
    private String ballShape;
    private String topTeam;

    public Sport(){}

    public Sport(String disc, String bShape, String tTeam){

        this.discipline = disc;
        this.ballShape = bShape;
        this.topTeam = tTeam;
    }

    public String getTopTeam() {
        return topTeam;
    }

    public Sport setTopTeam(String topTeam) {
        this.topTeam = topTeam;
        return this;
    }

    public String getDiscipline() {
        return discipline;
    }

    public Sport setDiscipline(String discipline) {
        this.discipline = discipline;
        return this;
    }

    public String getBallShape() {
        return ballShape;
    }

    public Sport setBallShape(String ballShape) {
        this.ballShape = ballShape;
        return this;
    }

    @Override
    public String toString() {
        return "Sports Information: " +
                "\nSport: " + discipline +
                "\nBall shape: " + ballShape +
                "\nTop team: " + topTeam + "\n";
    }



}
