package assignment4;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.*;

import java.util.Arrays;
public class presentationTest {

	/**
	 * this class creates stubs for testing the UI of the application
	 * each test case will create a stub for the panel using mockitO
	 */
	
	public  BaglePanelView b = mock(BaglePanelView.class);
	public  CoffeePanelView c = mock(CoffeePanelView.class);
	public calculations cc = new calculations();
	public ToppingPanelView t = mock(ToppingPanelView.class);
	
	//tests UI instance
	@Test
	public void test1() {
		
		when(b.getType()).thenReturn("WHITE");
		boolean[] returnThis = {false, true , false, true};
		when(t.getToppingType()).thenReturn(returnThis);
		when(c.selection()).thenReturn(2);
		
		double[] bill = cc.gettheBill(b.getType(),c.selection(), t.getToppingType());
		double[] expectedBill = {1.25, 1.5 , 1.0, .165, 3.91};
		for(int i = 0 ; i < 5; i++)
			assertEquals(bill[i], expectedBill[i], .01);
	
	}
	
	//tests UI instance
	@Test
	public void test2() {
		when(b.getType()).thenReturn("WHEAT");
		boolean[] returnThis = {true, true , true, true};
		when(t.getToppingType()).thenReturn(returnThis);
		when(c.selection()).thenReturn(4);
		
		double[] bill = cc.gettheBill(b.getType(),c.selection(), t.getToppingType());
		double[] expectedBill = {2.0, 1.5 , 2.25, .21, 5.96};
		for(int i = 0 ; i < 5; i++)
			assertEquals(bill[i], expectedBill[i], .01);
		
	}
	
	//test UI instance
	@Test
	public void test3() {
		when(b.getType()).thenReturn("WHITE");
		boolean[] returnThis = {false, false , false, true};
		when(t.getToppingType()).thenReturn(returnThis);
		when(c.selection()).thenReturn(3);
		
		double[] bill = cc.gettheBill(b.getType(),c.selection(), t.getToppingType());
		double[] expectedBill = {1.25, 1.5 , .75, .165, 3.67};
		for(int i = 0 ; i < 5; i++)
			assertEquals(bill[i], expectedBill[i], .01);
		
	}

}
