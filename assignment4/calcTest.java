package assignment4;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @author matthew dunning
 * these test are used to test the calculations class
 * they will test all functionality of each method call
 */
public class calcTest {

	//create an instance of the calculation class
	calculations C = new calculations();
	
	//get bagel cost test
	@Test
	public void testBagelCost() {
		double testWhiteBagelValue = C.getBagelCost("white");
		double testWheatBagelValue = C.getBagelCost("not white");
		assertEquals(1.25 , testWhiteBagelValue, .01);
		assertEquals(1.50 , testWheatBagelValue, .01);
	}
	//get coffee cost test
	@Test
	public void testCoffeCost() {
		double testNoCoffe = C.getCoffeeCost(1);
		double testRegular = C.getCoffeeCost(2);
		double testDecaf = C.getCoffeeCost(3);
		double testCappicino = C.getCoffeeCost(4);
		
		assertEquals(0 , testNoCoffe, .01);
		assertEquals(1.25 , testRegular, .01);
		assertEquals(1.25 , testDecaf, .01);
		assertEquals(2.00 , testCappicino, .01);
	}
	
	//test the toppings cost
	@Test
	public void testToppingCost()
	{
		boolean[] testCream = {true, false, false, false};
		boolean[] testButter = { false, true, false, false};
		boolean[] testPeach = {false , false ,true, false};
		boolean[] testBlue = { false, false, false, true};
		double testCreamCheeseCost = C.getToppingCost(testCream);
		double testButterCost = C.getToppingCost(testButter);
		double testPeachJellyCost = C.getToppingCost(testPeach);
		double testBlueberryJamCost = C.getToppingCost(testBlue);
		
		assertEquals(0.50 , testCreamCheeseCost, .01 );
		assertEquals(0.25 , testButterCost, .01 );
		assertEquals(0.75 , testPeachJellyCost, .01 );
		assertEquals(0.75 , testBlueberryJamCost, .01 );
		
	}
	
	//test the final bill calculated
	@Test
	public void testgettheBill()
	{
		double[] testBill = {1.25, 1.5, .50, .165, 3.42}; 
		
		double testRegular = C.getCoffeeCost(2);
		double testWhiteBagelValue = C.getBagelCost("WHITE");
		boolean[] testCream = {true, false, false, false};
		double testCreamCheeseCost = C.getToppingCost(testCream);
		
		double [] actualBill = C.gettheBill("WHITE", 2, testCream); 
		for(int i = 0 ; i < 5; i++)
			assertEquals(testBill[i] , actualBill[i] , .01);

	}
	

}
