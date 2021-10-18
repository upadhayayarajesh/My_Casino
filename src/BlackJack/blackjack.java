package BlackJack;

import java.util.Scanner;

import static BlackJack.main.chips;

public class blackjack  {
    // to check for surrendered value.
    private static boolean surrendered=false;
    // new  deck for playing.
    private  static Deck deck = new Deck();
    // new deck for player.
    private static Deck pDeck= new Deck();
    // new deck for dealer.
    private static Deck dDeck = new Deck();
    // boolean variable to check round.
    private  static boolean round = false;
    //scanner variable to use all over the class while taking inputs form users.
    private static  Scanner scanner = new Scanner(System.in);
     // blackjack method to run all the card , deck and play black jack.
    public static void jackBlack(){
        // creats 52 cards in deck
        deck.createDeck();
        // shuffle that 52 cards
        deck.shuffle();
        //when chis is more than 10 palyer is allowed to play
        while(chips>10){
            System.out.println("press [p] play blackjack or [q] quit");
            char quit = scanner.next().charAt(0);
            if(quit=='q') {
                System.out.println(" your total chips is : "+ chips + " .");
                System.out.println("Thank you for visiting our casino.");
                break;
            }
// this is when player wanned to aply it iwll ask you for your bet
                System.out.println("You have : " + chips + " chips. How much would you like to bet ?");
                int playerBet = scanner.nextInt();
                if (playerBet > chips) {
                    System.out.println("you don't have enough money to play. Thank you");
                    break;
                } else {
                    // when you are betting it will first decrease your chips equal to bet amount and then when you
                    // when you win it will again add it to your chips value.
                    chips -= playerBet;
                }
                // give two cards for the deck to player deck and dealer deck.
                pDeck.takeCard(deck);
                pDeck.takeCard(deck);
                dDeck.takeCard(deck);
                dDeck.takeCard(deck);
                // when round is still palying then it will know game is to continue.
                while (true) {
                    System.out.print("your hand");
                    System.out.print(pDeck);
                    System.out.println("\nyour deck is valued at " + pDeck.valueOfCard());
                    System.out.println("Dealer cards in hand is: " + dDeck.getCard(0)+ " and [hidden]");
                    // it will check for natural black jack.
                    if((pDeck.valueOfCard()==21 )&&(dDeck.valueOfCard()!=21)){
                        System.out.println("you got a natural blackjack the winner.");
                        chips+=4*playerBet;
                        surrendered=true;
                        break;

                    }// ask what you wanned to do.
                    System.out.println("What Would you like to do[h]Hit ,[s]stand,[d]doubledown and [u]surrendered ");
                    char response = scanner.next().charAt(0);
                    if (response == 'd' ){
                        // make bet to twice when doing doubledown
                        playerBet *= 2;
                        pDeck.takeCard(deck);
                        System.out.println("you draw a: " + pDeck.getCard(pDeck.size() - 1));
                        if (pDeck.valueOfCard() > 21) {
                            System.out.println(" you bust. your card value is " + pDeck.valueOfCard());
                            round = true; }

                        break;
                        // for hitting option.
                    }else if (response == 'h') {
                        pDeck.takeCard(deck);
                        System.out.println("you draw a: " + pDeck.getCard(pDeck.size() - 1));
                        if (pDeck.valueOfCard() > 21) {
                            System.out.println(" you bust.your card value is " + pDeck.valueOfCard());
                            round = true;
                            break;
                        }
                        // for stand.
                    }else if (response == 's') {
                        break;
                        // for surrendered.
                    }else if (response =='u') {
                        System.out.println("you surrendered for your bet");
                        chips += playerBet / 2;
                        surrendered = true;
                        break;
                    }
                }
                System.out.println("Dealer cards: " + dDeck.toString());
                // if not surrendered.
                if (surrendered == false) {
                    //picks a cards for dealer when  his card value is less than 17.
                    while ((dDeck.valueOfCard() < 17) && round == false) {
                        dDeck.takeCard(deck);
                        System.out.println("Dealer draw: " + dDeck.getCard(dDeck.size() - 1));
                    }
                    System.out.println("dealer card value: " + dDeck.valueOfCard());
                    // here it checks for the results and  give tha payout according to results.
                    if((dDeck.valueOfCard() > 21) && round == false) {
                        System.out.println("dealer busts. you are the winner");
                        chips += 2 * playerBet;
                        round = true;
                    }else if ((dDeck.valueOfCard() > pDeck.valueOfCard()) && round == false) {
                        System.out.println("you loose the round.");
                        round = true;
                    }else if ((pDeck.valueOfCard() == dDeck.valueOfCard()) && round == false) {
                        System.out.println("push!");
                        round = true;
                    }else if ((pDeck.valueOfCard() > dDeck.valueOfCard()) && round == false) {
                        System.out.println("you win");
                        chips += 3*playerBet;
                        round = true;
                    } else if (round == false) {
                        System.out.println("you loose this round.");
                        chips -= playerBet;
                        round = true;
                    }
                    // once round is done it will move all the card to deck for player deck and dealer deck.
                    pDeck.newdeck(deck);
                    dDeck.newdeck(deck);
                    System.out.println("End of hand");
                } else {
                    System.out.println("you surrendered your round.");

                }

        }

    }

}