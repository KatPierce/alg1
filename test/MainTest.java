/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Eugenia
 */
public class MainTest {
    
    int[] price1 = {14,2,3,4,5,6};
    Result expResult1 = new Result(1,5,4); 
    Result result1 = Main.foo(price1);
    int[] price2 = {16, 15, 1, 2};
    Result expResult2 = new Result(2,3,1); 
    Result result2 = Main.foo(price2);
    int[] price3 = {10, 11, 7, 10, 6};
    Result expResult3 = new Result(2,3,3); 
    Result result3 = Main.foo(price3);
    int[] price4 = {36, 11, 13, 21};
    Result expResult4 = new Result(1,3,10); 
    Result result4 = Main.foo(price4);    
    int[] price5 = {36, 11, 2, 9};
    Result expResult5 = new Result(2,3,7); 
    Result result5 = Main.foo(price5);
    int[] price6 = {6, 10, 96};
    Result expResult6 = new Result(0,2,90); 
    Result result6 = Main.foo(price6);
    int[] price7 = {6, 10};
    Result expResult7 = new Result(0,1,4); 
    Result result7 = Main.foo(price7);
    int[] price8 = {6, 10,1,3,1,17};
    Result expResult8 = new Result(2,5,16); 
    Result result8 = Main.foo(price8); 
    
    
   
    
    
    
    
    /**
     * Test of finding method, of class Main.
     */
    @Test
    public void FooCheck() {
        System.out.println("* MainTest: FooCheck()");   
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
        assertEquals(expResult4, result4);
        assertEquals(expResult5, result5);
        assertEquals(expResult6, result6);
        assertEquals(expResult7, result7);
        assertEquals(expResult8, result8);
    }
    
    @Test (expected=IllegalArgumentException.class)
    public void checkExpectedException() {
    System.out.println("* MainTest: test method 2 - checkExpectedException()");
        int[] price9 = {50, 40,13,1};
        System.out.println(price9+ " " + Main.foo(price9));
            
}
    @Test (expected=IllegalArgumentException.class)
    public void checkIndexException() {
    System.out.println("* MainTest: test method 3 - checkIndexException()");
        int[] price10 = {50};
        System.out.println(price10 + " " + Main.foo(price10));
            
}
    
}
