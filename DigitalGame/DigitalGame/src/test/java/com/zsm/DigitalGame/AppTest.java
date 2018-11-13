package com.zsm.DigitalGame;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
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
    	simpleOne();
    	simpleTwo();
        assertTrue( true );
    }
    
	public void simpleOne() { //one
		String[] a = new String[100];
		for (int i = 1; i < 100; i++) {
			if(i % 3 == 0 && i % 5 == 0){
				a[i] = "FizzBuzz";
			}else if(i % 3 == 0){
				a[i] = "Fizz";
			}else if(i % 5 == 0){
				a[i] = "Buzz";
			}else{
				a[i] = String.valueOf(i);
			}
			System.out.println(a[i]);
		}
	}
	
	/*
	 * A number is FizzBuzz if it is divisible by 3 or 5 or if it has a 3 or 5 in it 
	 * should be change
	 * A number is FizzBuzz if it is divisible by 3 and 5 or (if it has a 3 and 5 in it)
	 */
	public void simpleTwo() { //two
		String[] a = new String[100];
		for (int i = 1; i < 100; i++) {
			String temp = String.valueOf(i);
			if((i % 3 == 0 && i % 5 == 0) || (temp.contains("3") && temp.contains("5"))){
				a[i] = "FizzBuzz";
			}else if(i % 3 == 0 || temp.contains("3")){
				a[i] = "Fizz";
			}else if(i % 5 == 0 || temp.contains("5")){
				a[i] = "Buzz";
			}else{
				a[i] = String.valueOf(i);
			}
			System.out.println(a[i]);
		}
	}
}
