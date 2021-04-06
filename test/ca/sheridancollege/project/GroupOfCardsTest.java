/*
 * Shivam Mungra
 * Student ID: 991593532
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Shivam
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
   

    /**
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        GroupOfCards instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = null;
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        GroupOfCards instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class GroupOfCards.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 2;
        GroupOfCards instance = null;
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
