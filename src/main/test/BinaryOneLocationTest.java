package main.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mandan.BinaryOneLocation;

public class BinaryOneLocationTest {

    BinaryOneLocation binaryOneLocation;

    @Before
    public void setup(){
        binaryOneLocation = new BinaryOneLocation();
    }

    @Test
    public void positiveNumberTest(){
        Assert.assertEquals(binaryOneLocation.findlocation(156), 4);
        Assert.assertEquals(binaryOneLocation.findlocation(88), 3);
        Assert.assertEquals(binaryOneLocation.findlocation(27), 1);
    }

    @Test
    public void negativeNumberTest(){
        Assert.assertEquals(binaryOneLocation.findlocation(-156), 1);
        Assert.assertEquals(binaryOneLocation.findlocation(-88), 1);
        Assert.assertEquals(binaryOneLocation.findlocation(-27), 1);
    }

    @Test
    public void zeroTest(){
        Assert.assertEquals(binaryOneLocation.findlocation(0), -1);
    }
}
