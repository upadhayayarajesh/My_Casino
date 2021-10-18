package rouletteGame;
import java.util.*;
public class betOptions extends rouletteGame {
    private static  Scanner scanner = new Scanner(System.in);
    // lists for all the bets method to sore bet whic will be used to check in betcheck class for the output.
    protected static  ArrayList<Bet> straightList =new ArrayList<Bet>();
    protected static  ArrayList<Bet> splitList =new ArrayList<Bet>();
    protected static  ArrayList<Bet> streetList =new ArrayList<Bet>();
    protected static  ArrayList<Bet> sixLineList =new ArrayList<Bet>();
    protected static  ArrayList<Bet> redBlackList =new ArrayList<Bet>();
    protected static  ArrayList<Bet> oddEvenList =new ArrayList<Bet>();
    protected static  ArrayList<Bet> highLowsList =new ArrayList<Bet>();
    protected static  ArrayList<Bet> columList =new ArrayList<Bet>();
    protected static  ArrayList<Bet> dozenList =new ArrayList<Bet>();

// straight method for straight bet.
    // this method is isking ofr a number from the user and ading that in list and  creating an bet add
//  using that bet it add it in straightList. same applies for other methods
    public static void Straight(int betChips){
        System.out.println("Enter your winning number: ");

        int betnumber = scanner.nextInt();
        if (betnumber>0 && betnumber<=36) {
            ArrayList<Integer> stList= new ArrayList<>();
            stList.add(betnumber);
            Bet straightBet= new Bet(stList, rouletteGame.betValue);
            straightList.add(straightBet);


        }else{
            System.out.println("please enter a valid number.");
            Straight(betChips);
        }
        play();

    }
    // split method for split bet.
    public static void Split(){
        System.out.print("Enter your winning numbers:\nfirst number:  ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.print("Second number:  ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == (secondNumber - 1) || firstNumber == (secondNumber -3)
                || firstNumber == (secondNumber + 1) || firstNumber== (secondNumber +3)) {
            ArrayList<Integer> spList=new ArrayList<>();
            spList.add(firstNumber);
            spList.add(secondNumber);
            Bet splitBet= new Bet(spList, betValue);
            splitList.add(splitBet);

        } else {
            System.out.println(" Not an adjacent numbers.");
            Split();
        }
        play();


    }// street method for street bet.
    public static void Street(){
        System.out.println(" which row form 1 to 11");
        int number = scanner.nextInt();
        ArrayList<Integer> stList=new ArrayList<>();
        stList.add(number);
        Bet streetBet= new Bet(stList, betValue);
        streetList.add(streetBet);
        play();

    }
    // sixline method for sixLine bet.
    public static void sixLine(){
        System.out.println("which row from 0 to 11");
        System.out.print("First row ");
        int first = scanner.nextInt();
        System.out.print("second row: ");
        int second = scanner.nextInt();
        if ((first-second)==1 || (first-second)==-1) {
            ArrayList<Integer> sixList=new ArrayList<>();
            sixList.add(first);
            sixList.add(second);
            Bet sixLineBet= new Bet(sixList, betValue);
            sixLineList.add(sixLineBet);
            play();
        }else{
            System.out.println("Not adjescent rows.");
          sixLine();
        }

    }
    // Redor Black method for RebOrBLack bet.
    public static void RedOrBlack(){
        System.out.println("Enter [1]red, [2]black");
        int number= scanner.nextInt();
        ArrayList<Integer> rbList=new ArrayList<>();
        rbList.add(number);
        Bet rebBlackBet= new Bet(rbList, betValue);
        redBlackList.add(rebBlackBet);
        play();

    }// odd or even method for oddOrEven bet.
    public static void OddOrEven(){
        System.out.println("Where do you want to bet\n"+"[1] odd,[2] even");
        int number= scanner.nextInt();
        ArrayList<Integer> oeList=new ArrayList<>();
        oeList.add(number);
        Bet oddEvenBet= new Bet(oeList, betValue);
        oddEvenList.add(oddEvenBet);
        play();

    }
    // high  lowsmethod to  store the highlows value and bet amount in highLows list
    public static void highLows(){
        System.out.println(" you want to bet on. [1] high [0] lows");
        int number= scanner.nextInt();
        ArrayList<Integer> hlList=new ArrayList<>();
        hlList.add(number);
        Bet highLowsBet= new Bet(hlList, betValue);
        highLowsList.add(highLowsBet);
        play();


    }
    // dozens method to  store the dozens value and bet amount in  dozens list
    public static void Dozens(){
        System.out.println("you want to bet on : [1] 1-12,[2] 13-24,[3] 25-36");
        int number= scanner.nextInt();
        ArrayList<Integer> dozList=new ArrayList<>();
        dozList.add(number);
        Bet highLowsBet= new Bet(dozList, betValue);
        dozenList.add(highLowsBet);
        play();

    }
    // column method to  store the colume value and bet amount in colums list
    public static void Columns(){
        System.out.println("you want to bet on :[1] first column,[2] second column,[3] third column");
        int number= scanner.nextInt();
        ArrayList<Integer> colList=new ArrayList<>();
        colList.add(number);
        Bet columsBet= new Bet(colList, betValue);
        columList.add(columsBet);
        play();

    }
}
