package rouletteGame;
import BlackJack.main;
import java.util.*;
import static rouletteGame.betOptions.*;

public class rouletteGame extends main {
    private static  Scanner scanner = new Scanner(System.in);
    protected static int winningNumber;
    protected static int betValue;

// roulttte game method dor
    public static void rouletteGame() {
            System.out.println("Welcome to roulette game");
            play();
        }

        public static void play(){
        // to play roulette you needto have more than 10 chips.
            if (chips>=10) {
                System.out.println("You have "+chips+ " chips");
                System.out.println("What do you want to do?, bet [b] , done betting [d], quit [q]");
                String p = scanner.nextLine();

                if (p.equals("b")) {
                    System.out.println("How much would you like to bet");
                    betValue = scanner.nextInt();
                    chips-= betValue;
                    chooseBet();
                    Table();
                }else if (p.equals("q")){
                    return;
                }else if(p.equals("d")) {
                    rollWheel();
                    System.out.println("The winning number is:" + winningNumber);
                    BetCheck.straightCheck(straightList);
                    BetCheck.splitCheck(splitList);
                    BetCheck.streetCheck(streetList);
                    BetCheck.sixLineCheck(sixLineList);
                    BetCheck.redBlackCheck(redBlackList);
                    BetCheck.oddEvenCheck(oddEvenList);
                    BetCheck.highLowsCheck(highLowsList);
                    BetCheck.columnCheck(columList);
                    BetCheck.dozenCheck(dozenList);
                    System.out.println("The total amount of chips you have : "  +chips);

                }else{
                    System.out.println("Please enter valid input");
                    play(); }
            }
        }
// this method is to know what bet you are betting.
        public static void chooseBet(){
            System.out.println("Choose your bet:\n "
                    +"Inside Bets:\n" + "[straight] Straight\n" + "[split] Split\n"+ "[street] Street\n"+
                    "[sixLine] SixLine\n"+ " Outside bets:\n" + "[rb] Red or Black\n" + "[oe] Odd or Even\n"+
                    "[hl] 1-18 or 19-36\n"+ "[dz] 1-12 or 13-24 or 25-36\n"+ "[co] Columns");

            String optionValue = scanner.nextLine();

            switch (optionValue){
                case "straight": { Straight(betValue);break; }
                case "split":{ Split();break; }
                case "street":{ Street();break; }
                case "sixLine":{ sixLine();break; }
                case "rb":{ RedOrBlack();break; }
                case "oe":{ OddOrEven();break; }
                case "hl":{ highLows();break; }
                case "dz":{ Dozens();break; }
                case "co":{ Columns();break; }
                default:{ System.out.println("Please enter valid input");
                    chooseBet();break; }

            }
        }
        // this will generate a random number to get a winning numbmer and use that for  roulette game.
        public static void rollWheel(){
            Random random = new Random();
            winningNumber =random.nextInt(36)+1;
        }
// creates a roulette table of 36 numbers
    public static void Table(){
            List list = new ArrayList(36);
            for (int i=1;i<=37;i++){
                list.add(i);
            }
        }



}