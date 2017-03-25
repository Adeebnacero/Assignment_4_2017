package cput.ac.za.Question1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class SportsTest {

    @Test
    public void testFootballers(){

        Football footy1 = new Football("","",11,"Manchester United",28);

        Assert.assertEquals("Manchester United",footy1.getTeamName());
        System.out.println(footy1.getTeamName());
    }

    @Test
    public void testRugby(){

        Rugby rugga1 = new Rugby("","",15,"Stormers",5);

        Assert.assertEquals(15,rugga1.getNumberOfPlayers());
        System.out.println(rugga1.getNumberOfPlayers());
    }

    @Test
    public void testBasketballers(){

        Basketball ball1 = new Basketball("","",5,"",8);

        Assert.assertEquals(8,ball1.getTeamTitles());
        System.out.println(ball1.getTeamTitles());
    }

}