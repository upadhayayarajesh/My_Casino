package BlackJack;
public class Card {
    // creats an enum of suit and Value to kknwo the whic suit and card value.
    public enum Suit{ DIAMONDS, CLUBS,HEARTS,SPADES}
    public enum Value{ACE,TWO, THREE, FOUR , FIVE, SIX ,SEVEN, EIGHT, NINE , TEN, JACK, QUEEN , KING }
    private  Suit suit;
    private Value value;
     // this create an cosntructor cards to use in deck an blackjack methods using two value enum suit and value.
    public Card(Suit suit, Value value){
        this.value= value;
        this. suit= suit;
    }
    // this will get the value of cards.
    public Value getValue( ){
        return this.value;
    }
    // this is to see the  card
    public String toString(){
        return value + " of " + suit;
    }


}
