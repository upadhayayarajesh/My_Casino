// Name : Rajesh Upadhayaya

package BlackJack;
import java.util.Random;
import java.util.Scanner;
import static rouletteGame.rouletteGame.rouletteGame;
import static BlackJack.blackjack.jackBlack;
public class main {
    // this chips will use in every class to know how much chips the player have left.
        public static int chips ;
        // dollar is the input value which will converted to chips in 1 to 1 ratio.
        public static  int dollar;
         // this creats an object scanner which can be accessed over this class whenever to take an input form the user.
        private static  Scanner scanner = new Scanner(System.in);
        // main method  to run all of my program .
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("please Enter dollars to  play game and get coins");
            dollar = scan.nextInt();
            chips = dollar;
            System.out.println("total chips you have to play is : "+ chips);
            System.out.println("press [p] to play [q] quit");
            String scan1 = scanner.nextLine();
            if(scan1.equals("p")){

                System.out.println("press [s]to play slot machine,[r]roulette,[b]blackjack and [q] quit");
                //this scan2 wil be used to play any game slot, roulette and blackjack;
                String scan2 = scanner.nextLine();
                if(scan2.equals("s")){
                    // to paly slot it iwll take 5 chips and run slot method.
                chips =-5;
                Slot_machine();
                }else if(scan2.equals("b")){
                    System.out.println("welcome to blackJack");
                    // to play blackjack it will take to jackBlack method of blackjack class.
                    jackBlack();

                }else if(scan2.equals("r")) {
                    // this is to play roulette game  it will take to rouletteGame method of package rouletteGame.
                    rouletteGame();

                }
            }else if(scan1.equals("q")){
                System.out.println("thank you for visiting our Casino");
            }

        }
// generagte a random number to see random outpts in array.
        public static  int randomnumbers(int upperBound) {
            Random rand = new Random();
            int random_number = rand.nextInt(upperBound);
            return random_number;
        }


        public static void Slot_machine(){
            String[] symbols = { "Hearts","Diamond","spade","Star", "Liberty bell", "horseshoe"};
            String[] display_array= new String[3];	        // declare an array of integers
            for( int i =0; i<3;i++){
                // it will use random to display random results in display_Array.
                display_array[i]=symbols[randomnumbers(symbols.length)];
            }
            System.out.println(" " +display_array[0] + " | " +display_array[1]+" |" + display_array[2]);
            // this will check for the output results in  in slot machine. and give a payout as  equal to results.
            if(display_array[0].equals(display_array[1])&&display_array[0].equals(display_array[2])){
                if(display_array[0]==symbols[2]){
                    chips +=20;
                }else if (display_array[0].equals(symbols[1])){
                    chips +=30;
                }else if (display_array[0].equals(symbols[0])){
                    chips +=40;
                }else if (display_array[0].equals(symbols[4])){
                    chips +=50;
                }
            }else {
                for(String displaySymbol :display_array){
                    chips +=5;
                    if(displaySymbol.equals(symbols[5])){
                        chips +=5;

                    }
                }

            }
            System.out.println("your total number of chips is : " +chips);
            System.out.println("press [p] to play slotMachine  [q] quit");
            String scan = scanner.nextLine();
            if(scan.equals("p")){
                chips =-5;
                Slot_machine();
            }else if(scan.equals("q")){
                System.out.println("your totla chips: " + chips);
                System.out.println("thank you for visiting our Casino");
            }

        }

    }

