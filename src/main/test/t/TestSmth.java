package t;

import org.junit.Assert;
import org.junit.Test;
import sample.Main;

/**
 * Created by AMitrokhin on 08.02.2016.
 */
public class TestSmth {
    @Test
    public void test1(){
        Main main = new Main();
        String result = main.getSumResult(1, 3);
        Assert.assertEquals("4", result);
    }
}
