package BlackJack;


import java.util.ArrayList;
import java.util.Random;

public class Deck {
    // tjis creats an arrayList of cards  .
    private ArrayList<Card> cards;
// this creats an  constructor to create deck.
    public Deck() { this.cards=cards; cards = new ArrayList<Card>(); }
// this method is use to creats 52 cards in deck.
    public void createDeck() {
        for (Card.Suit cardSuit : Card.Suit.values()) {
            for (Card.Value cardValue : Card.Value.values()) { cards.add(new Card(cardSuit, cardValue)); } } }
   public String toString() {
      String cardListOutput = "";
        for (Card aCard : cards) {
            cardListOutput += "\n" + aCard;
        }
        return cardListOutput; }
// this method is to shuffle all the cards in deck  using random.
    public void shuffle() {
        ArrayList<Card> newDeck = new ArrayList<Card>();
        Random rand = new Random();
        int randomeCardIndex ;
        int originalSize =cards.size();
        for (int i = 0; i < originalSize; i++) {
            randomeCardIndex = rand.nextInt((cards.size() - 1) + 1);
            newDeck.add(cards.get(randomeCardIndex));
            cards.remove(randomeCardIndex);
        }
        cards = newDeck;
    }
//  this  method is to get cards.
    public Card getCard(int i) {
        return cards.get(i);
    }
    // this method is to add card in deck.
    public void addCard(Card addCard) {
        cards.add(addCard);
    }
    // to draws a card form deck and give it to player and dealer.
    public void takeCard(Deck deck) {
        cards.add(deck.getCard(0));
        deck.cards.remove(0); }
        // to know  how many card in deck.
    public int size() { return cards.size();}
// when round is done  . it will move the the player deck  and dealer deck  to playing deck and everything goes as begingign in new round.
    public void newdeck(Deck deck) {
        int thisDeckSize = size();
        for (int i = 0; i < thisDeckSize; i++) {
            deck.addCard(this.getCard(i));
        }
        for (int i = 0; i < thisDeckSize; i++) {
            cards.remove(0);
        }
    }
    // this method is to get the value of the cards  using thos enums in cars to  it integer value.

    public int valueOfCard() {
        int integerValueofCard = 0;
        int aces = 0;
        for (Card acard : this.cards) {
                 if (acard.getValue().equals(Card.Value.ACE)) {
                     aces += 1;
                     for (int i = 0; i < aces; i++) {
                         if (integerValueofCard > 10) {
                             integerValueofCard += 1;
                         } else {
                             integerValueofCard += 11;
                         }
                     }

                 } else if (acard.getValue().equals(Card.Value.TWO)) {
                         integerValueofCard += 2;
                 } else if (acard.getValue().equals(Card.Value.THREE)) {
                     integerValueofCard += 3;
                 } else if (acard.getValue().equals(Card.Value.FOUR)) {
                     integerValueofCard += 4;
                 } else if (acard.getValue().equals(Card.Value.FIVE)) {
                     integerValueofCard += 5;
                 } else if (acard.getValue().equals(Card.Value.SIX)) {
                     integerValueofCard += 6;
                 } else if (acard.getValue().equals(Card.Value.SEVEN)) {
                     integerValueofCard += 7;
                 } else if (acard.getValue().equals(Card.Value.EIGHT)) {
                     integerValueofCard += 8;
                 } else if (acard.getValue().equals(Card.Value.NINE)) {
                     integerValueofCard += 9;
                 } else if (acard.getValue().equals(Card.Value.TEN)) {
                     integerValueofCard += 10;
                 } else if (acard.getValue().equals(Card.Value.JACK)) {
                     integerValueofCard += 10;
                 } else if (acard.getValue().equals(Card.Value.QUEEN)) {
                     integerValueofCard += 10;
                 } else if (acard.getValue().equals(Card.Value.KING)) {
                     integerValueofCard += 10;
                 }
             }
        return integerValueofCard;
    }

}