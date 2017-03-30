package cput.ac.za.Question4.ADPCorrection;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/03/31.
 */
public class saleTest {

    @Test
    public void testSlip() throws Exception {

        calculateCost c1 = new calculateCost();

        c1.calCost(1000.00,0.14);
        double expected = 1140;

        Assert.assertEquals(expected,c1.getSaleCost());
    }
}