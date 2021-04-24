/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Megha Patel
 * @author Shivam Mungra, Siamak Tavana, Stacy Benny, Jatin Mahajan
 * date: April 5, 2021 
 */
public class Card {

    public enum Suit{
            HEARTS, CLUBS, SPADES,DIAMONDS
        }
    
        private Value value;
        private Suit suit;
        
        //public static final String[] SUITS={"Hearts","Diamonds","Spades","Clubs"};
        
        public Card(Value value,Suit suit)
        {
            this.value=value;
            this.suit=suit;
        }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
