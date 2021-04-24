package ca.sheridancollege.project;

import java.util.Random;

/**
 * Class to generate cards with values and Suit.
 * @author Shivam Mungra, Siamak Tavana, Stacy Benny, Jatin Mahajan
 */
public class RandomHandGenerator  {
    
   /**
	 * The method for generating random cards for the player and the dealer.
	 * @param numCards
	 */
	public static Card[] generateHand(int numCards) {
		//
                Card[] hand=new Card[numCards];
                Random random=new Random();
                for(int i=0;i<hand.length;i++)
                {
                     // int value=random.nextInt(13)+1;
                       //  String suit=Card.SUITS[random.nextInt(4)];
                    
            
                       //a random value generation
                       Value value=Value.values()[random.nextInt(13)];
                       //a random suit generation
                       Card.Suit suit=Card.Suit.values()[random.nextInt(4)];
        
                         Card card=new Card(value,suit);
                         hand[i]=card;
                  }
                
                return hand;
	}

}
