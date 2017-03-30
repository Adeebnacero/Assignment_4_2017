package cput.ac.za.Question3;

import cput.ac.za.Question3.isp.ISPViolation.SquadPlayer;
import cput.ac.za.Question3.lsk.LSKCorrection.car;
import cput.ac.za.Question3.lsk.LSKCorrection.saloon;
import cput.ac.za.Question3.lsk.LSKCorrection.suv;
import cput.ac.za.Question3.ocp.OCPCorrection.Circle;
import cput.ac.za.Question3.ocp.OCPCorrection.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Adeebo on 2017/03/30.
 */
public class runTest {

    @Test
    public void testMain() throws Exception {

        car c1 = new saloon();
        c1.speed();
        c1 = new suv();
        c1.capacity();

        int result = c1.capacity();
        int expected = 9;

        Assert.assertEquals(result,expected);
    }

    @Test
    public void drawingSquare() throws Exception {

        Square s1 = new Square();
        String result = s1.draw();

        assertEquals("Drawing a square",result);
    }

    @Test
    public void drawingCircle() throws Exception {

        Circle s1 = new Circle();
        String result = s1.draw();

        assertEquals("Drawing a circle",result);
    }

    public void squadPlayers() throws  Exception {

        SquadPlayer sq1 = new SquadPlayer();

        String result = sq1.play();

        assertEquals("Team player",result);

    }


}