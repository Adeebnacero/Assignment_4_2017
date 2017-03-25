package cput.ac.za.Question2;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class SportsTest {

    @Test
    public void testNumberOfFootballers() throws Exception {

        Football footy1 = new Football("","","");

        Assert.assertEquals(11,footy1.numberOfPlayers());
        System.out.println(footy1.numberOfPlayers());
    }

    @Test
    public void testNumberOfRugby() throws Exception {

        Rugby rugga1 = new Rugby("","","");

        Assert.assertEquals(15,rugga1.numberOfPlayers());
        System.out.println(rugga1.numberOfPlayers());
    }

    @Test
    public void testNumberOfBasketballers() throws Exception {

        Basketball baller1 = new Basketball("","","");

        Assert.assertEquals(5,baller1.numberOfPlayers());
        System.out.println(baller1.numberOfPlayers());
    }

    @Test
    public void testNameFootballers() throws Exception {

        Football footy2 = new Football("Soccer","","");

        Assert.assertEquals("Soccer",footy2.getDiscipline());
        System.out.println(footy2.getDiscipline());
    }

    @Test
    public void testShapeRugby() throws Exception {

        Rugby rugga2 = new Rugby("","Oval","");

        Assert.assertEquals("Oval",rugga2.getBallShape());
        System.out.println(rugga2.getBallShape());
    }

    @Test
    public void testTopTeamBasketball() throws Exception {

        Basketball baller2 = new Basketball("","","Cleveland Cavaliers");

        Assert.assertEquals("Cleveland Cavaliers",baller2.getTopTeam());
        System.out.println(baller2.getTopTeam());
    }
}