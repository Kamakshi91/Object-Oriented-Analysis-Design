/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import java.io.FileNotFoundException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kamakshi
 */
public class DataSetTest {
    static DataSet instance ;
    
    public DataSetTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() throws FileNotFoundException {
        
        instance = new DataSet("nums.dat");
        //instance.sort();
    }
    
    @Before
    public void setUp() {
        //DataSet instance = new DataSet();
    }
    

    @Test
    public void testMean() {
        System.out.println("Mean");
        
        double expResult = 52.08;
        double result = instance.Mean();
        assertEquals(expResult, result, 52.08);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMedian() {
        System.out.println("Median");
        
        instance.sort();
        double expResult = 46.35;
        double result = instance.Median();
        assertEquals(expResult, result, 46.35);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testMinimum() {
        System.out.println("Minimum");
        
        double expResult = 22.1;
        double result = instance.Minimum();
        assertEquals(expResult, result,0.0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMaximum() {
        System.out.println("Maximum");
        
        double expResult = 98.8;
        double result = instance.Maximum();
        assertEquals(expResult, result, 98.8);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testVariance() {
        System.out.println("Variance");
        
        double expResult = 527.7884444444444;
        double result = instance.Variance();
        assertEquals(expResult, result, 527.7884444444444);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testStandardDeviation() {
        System.out.println("StandardDeviation");
        
        double expResult =22.973646738044103 ;
        double result = instance.StandardDeviation();
        assertEquals(expResult, result, 22.973646738044103);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSort() {
        System.out.println("sort");
        
        instance.sort();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPrint() {
        System.out.println("Print");
        boolean table = false;
        
        instance.Print(table);
        //fail("The test case is a prototype.");
    }
    
}
