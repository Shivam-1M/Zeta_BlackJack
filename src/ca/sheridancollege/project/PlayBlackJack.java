package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * Main Program where execution of the game begins.
 *
 * @author Shivam Mungra, Siamak Tavana, Stacy Benny, Jatin Mahajan
 */
public class PlayBlackJack {

    private static int totChips = 100;
    private static int userChips = 0;
    private static int userTotal = 0;
    private static int dealerTotal = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Card[] userHand = RandomHandGenerator.generateHand(2);
        Card[] dealerHand = RandomHandGenerator.generateHand(1);
        // print entire hand
        System.out.print("Enter You Name: ");
        String name = input.next();
        Player one = new Player(name);
        System.out.println("Welcome! " + one.getName());
        char playChoice = 'Y';
        while (playChoice == 'Y') {
            System.out.println("Total Available Chips: " + totChips);
            System.out.print("Enter Amount of Chips to be Dealt: ");
            userChips = input.nextInt();
            if (userChips > totChips) {
                System.out.println("Please Enter Valid Chips!");
                userChips = input.nextInt();
            }
            System.out.println("User Cards: ");
            valueUserConverter(userHand);

            System.out.println("Total " + one.getName() + "'s Points: " + userTotal);

            System.out.println("Dealer one Card: ");
            valueDealerConverter(dealerHand);
            System.out.println("Total Dealer Points: " + dealerTotal);
            if (userTotal > 21) {
                totChips -= userChips;
                System.out.println("You Lost! Value greater than 21.");
                System.out.println("You have now " + totChips + " chips.");
            } else {
                System.out.print("Do you want to take another Card?(Y/N) ");
                char choice;
                choice = input.next().charAt(0);
                while (choice == 'Y') {
                    Card[] anotherHand = RandomHandGenerator.generateHand(1);
                    valueUserConverter(anotherHand);
                    System.out.println("Total " + one.getName() + "'s Points: " + userTotal);
                    if (userTotal > 21) {
                        totChips -= userChips;
                        System.out.println("You Lost! Value greater than 21.");
                        System.out.println("You have now " + totChips + " chips.");
                        break;
                    }

                    System.out.print("Do you want to take another Card?(Y/N) ");
                    choice = input.next().charAt(0);
                    if (userTotal > 21) {
                        totChips -= userChips;
                        System.out.println("You Lost! Value greater than 21.");
                        System.out.println("You have now " + totChips + " chips.");
                        break;
                    }
                }
                Card[] anotherDealerHand = RandomHandGenerator.generateHand(1);
                System.out.println("Dealer's another Card: ");
                valueDealerConverter(anotherDealerHand);
                System.out.println("Total Dealer Points: " + dealerTotal);

                if (userTotal > 21) {
                    totChips -= userChips;
                    System.out.println("Final Result: You Lost! Value greater than 21.");
                    System.out.println("You have now " + totChips + " chips.");
                } else if (dealerTotal > 21) {
                    totChips += userChips;
                    System.out.println("Final Result: You Won! Dealer's value is greater than 21.");
                    System.out.println("You have now " + totChips + " chips.");
                } else if (dealerTotal > userTotal) {
                    totChips -= userChips;
                    System.out.println("Final Result: Dealer Wins! Please Try Again");
                    System.out.println("You have now " + totChips + " chips.");
                } else if (dealerTotal < userTotal) {
                    totChips += userChips;
                    System.out.println("Final Result: You Won! Congratulations");
                    System.out.println("You have now " + totChips + " chips.");
                }
            }
            if (totChips <= 0) {
                System.out.println("You have 0 chips left! Please Try Next Time.");
                break;
            } else {
                System.out.print("Do You want to play another Round? (Y/N)");
                playChoice = input.next().charAt(0);
            }
        }
    }

    /* Method to convert the values into integers to follow the 'rule of 21' for the
    BlackJack Game. This is for the player against dealer.
     */
    public static void valueUserConverter(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card.getValue() + " of " + card.getSuit());
            switch (card.getValue()) {
                case ACE:
                    userTotal += 1;
                    break;
                case TWO:
                    userTotal += 2;
                    break;
                case THREE:
                    userTotal += 3;
                    break;
                case FOUR:
                    userTotal += 4;
                    break;
                case FIVE:
                    userTotal += 5;
                    break;
                case SIX:
                    userTotal += 6;
                    break;
                case SEVEN:
                    userTotal += 7;
                    break;
                case EIGHT:
                    userTotal += 8;
                    break;
                case NINE:
                    userTotal += 9;
                    break;
                case TEN:
                    userTotal += 10;
                    break;
                case JACK:
                    userTotal += 11;
                    break;
                case QUEEN:
                    userTotal += 11;
                    break;
                case KING:
                    userTotal += 11;
                    break;

            }

        }
    }

     /* Method to convert the values into integers to follow the 'rule of 21' for the
    BlackJack Game. This is for the player against dealer.
     */
    
    public static void valueDealerConverter(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card.getValue() + " of " + card.getSuit());
            switch (card.getValue()) {
                case ACE:
                    dealerTotal += 1;
                    break;
                case TWO:
                    dealerTotal += 2;
                    break;
                case THREE:
                    dealerTotal += 3;
                    break;
                case FOUR:
                    dealerTotal += 4;
                    break;
                case FIVE:
                    dealerTotal += 5;
                    break;
                case SIX:
                    dealerTotal += 6;
                    break;
                case SEVEN:
                    dealerTotal += 7;
                    break;
                case EIGHT:
                    dealerTotal += 8;
                    break;
                case NINE:
                    dealerTotal += 9;
                    break;
                case TEN:
                    dealerTotal += 10;
                    break;
                case JACK:
                    dealerTotal += 11;
                    break;
                case QUEEN:
                    dealerTotal += 11;
                    break;
                case KING:
                    dealerTotal += 11;
                    break;

            }

        }
    }

}
