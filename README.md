Name : rajesh Upadhayaya

I did all of my project rom scratch. I first started with slot machie and then roulette and finally blackjack.

 slot machine :
 main class is slot machine and my code will run from that.
  my whole project starts form slot machine.
  slot machine consists of  one class FOR  slot machine and 3 class for blackjack and 3 method including main method. 
  methods of slots machine : 
 1) main method: 
  a)will ask you for how much money do you wannet to convert to chips.chips to money ratio is 1 to 1.
  b)now if you wanna play it will again ask you  for which game.
  c) I all of my slot machine game and blackjack game is in slotmachine package and roulette game in roulette package
 2) random method: it will generate random numbers
 3) slot machine: it will show three symbols form using random and then giv you chips from the results.  and  asks you to play or quit.

BlackJack:
 for black , I created three classes Deck, Card, and blackjack
 1) Card:
  a) this class will create the instance of  cards using suit and value 
  b) suit enum: it comsits of 4 suit of cards.
  c) value: it consits of 13 values.
  d) getValue give value of cards and tostring to see the  card.
 2) Deck:
 a) it consists of arraylist of card with instance of Deck . so that they can be use later in blackJack method.
 b)it consists of Deck, createDeck,shuffle,getcard ,takecard, newdeck, valueofCard, to string methods.
 deck : instance of deck for palyer , dealer later in black jack.
 createDeck: it will create the 52 card deck from card.
 shuffle: it will shuffle cards that are generated from createCard method.
 get card: it will give the card from that deck.
 takecard: it will take a card from the deck and give  deck of player and dealer.
 new deck:  it act like clearing a deck and when another round is started it will put everything in its place.
 valueOfCard: it will give the value of cards  that you have in your deck.
 toString: to see the output of  what cards you have in your deck.
 3) blackJack:
  this class is to paly black jack game and use all of caed and deck class created. so far.
  it consists of : black jack method whic first create three deck form deck class. pdeck for player deck, ddeck for dealer deck and deck for playing deck. 
  first it uses createDeck method in deck to create deck and then shuffle method to shuffle cards
  After shuffling cards it will give two cards to Each player and thos palyer will give an input to 
  hit stand  or doubledoun and surrendered option to choose and it will check for that.
   it will also check for the naturalbalck jack.
  when it check for hit, stand, doublebown and surrendered. it will then   give dealer cards untill 
  his cardvalue is gteater than 17.
  then finally it will check for the results.  and give a payout based on their result.
  
 Roultette game:
  it is in seperate packAGE  called rouletteGame. 
  inside rouletteGame it consists of  4 class ,bet, betCheck, betOption,rGame.
  
 Bet:
  it creates an instances of  bet consisting of an array list and bet amount. to keep tracks of bet numbers on which method and  and how much bet on them
  it have getBetAmount method to get the bet amount of the bet instance to  use later on how much bet on what number.
 rouletteGame:
  this will consist of a random method to renerate a random number when betting is done. 
  first it will ask you you betamount and then it will also ask you for the  bet types to know which type of bet it is and then it iwllgo that method of betOption cass  and store that value in theat betanme list.
  finally when you do done betting. it iwll check for the result of all the methods in betcheck. to find the output  the result .
 
 betCheck: 
  it will check for the every list that is keeping tracks of which bet and how much money on that .
  It consists of several method of bet name check. that wil user the bet name list to check if that is equal to winning number and give payout bbased on that.
 
 betOption:
 
 this class is  keep track of  add value to betList when used put a bet on any bet methods.
 it also consists of several method that will first ask for the value number then add it in list and than add that list in bet field.
 finally that field will get added in betList. so that betlist is being accessed when the betting is done and run rollwheel to get a random number and then check results.
 
 no bug: it will run and compile however if you give a wrong value it will not compile.
  