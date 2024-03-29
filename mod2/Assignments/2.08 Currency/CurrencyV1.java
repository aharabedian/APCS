/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Charles Babbage (replace with your name)
 * @version 06/02/17       (replace with today's date)
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here
        double yenSpent = 112342.50;
        double yenExchangeRate = 112.39;
        double dollarsSpentInJapan = 0.0;
        double dollarsAfterJapan = 0.0;
        
        double eurosSpent = 1221.52;
        double euroExchangeRate = 1.18;
        double dollarsSpentInSpain = 0.0;
        double dollarsAfterSpain = 0.0;
        
        double remainingDollars = 0.0;

        // Message to user stating purpose
        System.out.println("+------------------------------------------------+");
        System.out.println("| This program converts an amount of money       |");
        System.out.println("| from a specific country into the equivalent    |");
        System.out.println("| currency of another country given the current  |");
        System.out.println("| exchange rate.                                 |");
        System.out.println("+------------------------------------------------+");
        System.out.println();

        // Conversion
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
        
        dollarsSpentInJapan = yenSpent / yenExchangeRate;
        dollarsAfterJapan = dollarsAfterMexico - dollarsSpentInJapan;
        
        dollarsSpentInSpain = eurosSpent / euroExchangeRate;
        dollarsAfterSpain = dollarsAfterJapan - dollarsSpentInSpain;
        
        remainingDollars = dollarsAfterSpain;
        
        //Print functions
        System.out.println("Starting US dollars:        " + startingUsDollars );
        System.out.println();
        System.out.println("Mexico:");
        System.out.println("| Pesos spent:              " + pesosSpent );
        System.out.println("| US dollars equivalent:    " + dollarsSpentInMexico );
        System.out.println("| US dollars remaining:     " + dollarsAfterMexico );
        System.out.println();
        System.out.println("Japan:");
        System.out.println("| Yen spent:                " + yenSpent );
        System.out.println("| US dollars equivalent:    " + dollarsSpentInJapan );
        System.out.println("| US dollars remaining:     " + dollarsAfterJapan);
        System.out.println();
        System.out.println("Spain:");
        System.out.println("| Euros spent:              " + eurosSpent );
        System.out.println("| US dollars equivalent:    " + dollarsSpentInSpain );
        System.out.println("| US dollars remaining:     " + dollarsAfterSpain );
        System.out.println();
        
        
        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = 0; 		//how many items can be purchased
		int fundsRemaining1 = 0;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = 0; 	//how many items can be purchased
		double fundsRemaining2 = 0.0;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
