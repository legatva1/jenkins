package math;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by venju on 5.12.2014.
 */


public class MainTest {


    @Test
    public void testPlus() throws Exception {

        Assert.assertEquals(Main.plus(8,6),14);
        Assert.assertEquals(Main.plus(8,-6),2);
        Assert.assertEquals(Main.plus(-8,6),-2);
        Assert.assertEquals(Main.plus(-8,-6),-14);

    }

    @Test
    public void testMinus() throws Exception {

        Assert.assertEquals(Main.minus(8,6),2);
        Assert.assertEquals(Main.minus(8, -6),14);
        Assert.assertEquals(Main.minus(-8, 6),-14);
        Assert.assertEquals(Main.minus(-8, -6),-2);

    }

    @Test
    public void multiply() throws Exception {

        Assert.assertEquals(Main.multiply(8,6),48);
        Assert.assertEquals(Main.multiply(8,-6),-48);
        Assert.assertEquals(Main.multiply(-8,6),-48);
        Assert.assertEquals(Main.multiply(-8,-6),48);
        Assert.assertEquals(Main.multiply(9,0),0);

    }
}
