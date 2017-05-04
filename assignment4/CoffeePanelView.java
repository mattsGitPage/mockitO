package assignment4;
import javax.swing.*;
import java.awt.*;

/**
   The CoffeePanel class allows the user to select coffee.
*/

public class CoffeePanelView extends JPanel
{
   // The following constants are used to indicate
   // the cost of coffee.
  

   private JRadioButton noCoffee;      // To select no coffee
   private JRadioButton regularCoffee; // To select regular coffee
   private JRadioButton decafCoffee;   // To select decaf
   private JRadioButton cappuccino;    // To select cappuccino
   private ButtonGroup bg;             // Radio button group

   /**
      Constructor
   */

   public CoffeePanelView()
   {
      // Create a GridLayout manager with 
      // four rows and one column.
      setLayout(new GridLayout(4, 1));

      // Create the radio buttons.
      noCoffee = new JRadioButton("None");
      regularCoffee = new JRadioButton("Regular coffee", true);
      decafCoffee = new JRadioButton("Decaf coffee");
      cappuccino = new JRadioButton("Cappuccino");

      // Group the radio buttons.
      bg = new ButtonGroup();
      bg.add(noCoffee);
      bg.add(regularCoffee);
      bg.add(decafCoffee);
      bg.add(cappuccino);

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("Coffee"));

      // Add the radio buttons to the panel.
      add(noCoffee);
      add(regularCoffee);
      add(decafCoffee);
      add(cappuccino);
   }

    public int selection()
    {
    	int type;
    	if(noCoffee.isSelected())
    	type=0;
    	else if(regularCoffee.isSelected())
    		type = 1;
    		else if(decafCoffee.isSelected())
    			type = 2;
    		else
    			type = 3;
    		    
    	
    	  return type;
    		       	
      	
    	
    }

  
}

