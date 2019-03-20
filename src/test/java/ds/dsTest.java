package ds;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class dsTest {
    ds dss;

    @Before
    public void setUp() throws Exception {
        dss = new ds();
        System.out.println("---------------------------");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("---------------------------");
    }

    @Test(expected = Exception.class)
    public void cc() throws Exception {
        ds.cc();
        System.out.println(dss);
        throw new Exception();
    }

    @Test(expected = Exception.class)
    public void cc2() throws Exception {
        ds.cc();
        System.out.println(dss);
        throw new Exception();
    }
}