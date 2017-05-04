package assignment4;
public class calculations {
	
	 // The following constants are used to indicate
	   // the cost of coffee.
	   public final double NO_COFFEE = 0.0;
	   public final double REGULAR_COFFEE = 1.25;
	   public final double DECAF_COFFEE = 1.25;
	   public final double CAPPUCCINO = 2.00;

	 
	   
	   public final double WHITE_BAGEL = 1.25;
	   public final double WHEAT_BAGEL = 1.50;
	   	   
	   
	   
	// The following constants are used to indicate
	   // the cost of toppings.
	   public final double CREAM_CHEESE = 0.50;
	   public final double BUTTER = 0.25;
	   public final double PEACH_JELLY = 0.75;
	   public final double BLUEBERRY_JAM = 0.75;
	   
	   
	   private final double TAX_RATE = 0.06; // Sales tax rate
		   
	   public double getBagelCost(String bagleType)
	   {
	      double bagelCost = 0.0;

	      if (bagleType.equals("white"))
	         bagelCost = WHITE_BAGEL;
	      else
	         bagelCost = WHEAT_BAGEL;

	      return bagelCost;
	   }
	   
	   public double getCoffeeCost(int coffeeSelection)
	   {
	      double coffeeCost = 0.0;

	      if (coffeeSelection==1)
	         coffeeCost = NO_COFFEE;
	      else if (coffeeSelection==2)
	         coffeeCost = REGULAR_COFFEE;
	      else if (coffeeSelection==3)
	         coffeeCost = DECAF_COFFEE;
	      else 
	         coffeeCost = CAPPUCCINO;

	      return coffeeCost;
	   }
	   
	   
	   public double getToppingCost(boolean[] topping)
	   {
	      double toppingCost = 0.0;

	      if (topping[0])
	         toppingCost += CREAM_CHEESE;
	      if (topping[1])
	         toppingCost += BUTTER;
	      if (topping[2])
	         toppingCost += PEACH_JELLY;
	      if (topping[3])
	         toppingCost += BLUEBERRY_JAM;

	      return toppingCost;
	   }
 
	   public double[] gettheBill(String bType, int cType, boolean[] toppings)
	   {
		   double bill[] = new double[5];
		   bill[0]= getCoffeeCost(cType);
		   
		   bill[1] = getBagelCost(bType);
		    
		   bill[2]  = getToppingCost(toppings);
		   
		   bill[3] = (bill[0] +  bill[1] + bill[2])* TAX_RATE;
		   
		   bill[4] = bill[0] +  bill[1] +  bill[2] +  bill[3];
		   
		   return bill;
		      	   
	   }
	  
	   
	   

}
