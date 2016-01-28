package com.mavenfundamentals.simplejavaproject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testmax(){
    	int arr[]={0,1,3,4,5};
    	assertEquals(5,App.findmax(arr));
    	int arr1[]={-4,-3,-2,-1,-5};
    	assertEquals(-1,App.findmax(arr1));
    }
    
    public void testadd(){
    	assertEquals(10,App.add(5,5));    	
    	assertEquals(-10,App.add(-5,-5));
    	assertEquals(0,App.add(5,-5));
    	assertEquals(0,App.add(0,0));
    }
    public void testsub(){
    	assertEquals(0,App.sub(5,5));
    	assertEquals(10,App.sub(5,-5));
    	assertEquals(-5,App.sub(0,5));
    	assertEquals(5,App.sub(5,0));
    	assertEquals(0,App.sub(0,0));  	
    }
    public void testdiv(){
    	assertEquals(0,App.div(2,5));
    	assertEquals(0,App.div(0,5));
    	assertEquals(1,App.div(5,5));
    	assertEquals(-1,App.div(-5,5));
    	
    	assertEquals(-1,App.div(29,0));   //// imp
     	
    }
    public void testmul(){
    	assertEquals(0,App.mul(2,0));
    	assertEquals(0,App.mul(0,2));
    	assertEquals(4,App.mul(2,2));
    	assertEquals(-2,App.mul(2,-1));   	
    	
    }
    
    


}
