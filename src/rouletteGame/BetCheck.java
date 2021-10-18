package rouletteGame;

import java.util.ArrayList;
import java.util.Arrays;
import static BlackJack.main.chips;
import static rouletteGame.rouletteGame.winningNumber;
// this class is to check the results when betting is done.

public class BetCheck {
    // checks in  straight list to see if  player winn or not and  increase it chips as equal to 35.
        public static void straightCheck(ArrayList<Bet> straightList) {
            for (Bet i:straightList){
                if (i.getBetNumberList().contains(winningNumber)){
                    for (int o:i.getBetNumberList()){
                        if (o==winningNumber){
                            System.out.println("You hit straight in "+o+" of bet "+ i.getBetAmonunt());
                            chips+=(i.getBetAmonunt()*35);
                        }
                    }
                }
                else {
                    System.out.println("You didn't win in straight of bet "+i.getBetAmonunt());
                }
            }
            straightList.clear();
        }

    // checks in  splitlist to see if  player winn or not and  increase it chips as equal to 17.
        public static void splitCheck(ArrayList<Bet> splitList) {
            for (Bet i:splitList){
                if (i.getBetNumberList().contains(winningNumber)){
                    for (int o:i.getBetNumberList()){
                        if (o==winningNumber){
                            System.out.println("You hit split in "+o+" of bet "+ i.getBetAmonunt());
                            chips+=(i.getBetAmonunt()*17);
                        }
                    }
                }
                else {
                    System.out.println("You didn't win in split of bet "+i.getBetAmonunt());
                }
            }
            splitList.clear();
        }
    // checks in  streetlist to see if  player winn or not and  increase it chips as equal to 17.
        public static void streetCheck(ArrayList<Bet> streetList){
            int winningRow=0;
            int[][] row = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15},{16,17,18},
                    {19,20,21},{22,23,24},{25,26,27},{28,29,30},{31,32,33},{34,35,36}};
            for(int i =0 ; i<row.length;i++){
                for( int j :row[i]){
                    if(j==winningNumber){
                        winningRow=i;
                    }
                }

            }
            for (Bet i:streetList){
                if (i.getBetNumberList().contains(winningRow)){
                    for (int o:i.getBetNumberList()){
                        if (o==winningRow){
                            System.out.println("You hit street in "+o+" of bet "+ i.getBetAmonunt());
                            chips+=(i.getBetAmonunt()*17);
                        }
                    }
                }
                else {
                    System.out.println("You didn't win in street of bet "+i.getBetAmonunt());
                }
            }
            streetList.clear();

        }
    // checks in  sixline list to see if  player winn or not and  increase it chips as equal to 5.
        public  static void sixLineCheck(ArrayList<Bet> sixLineList) {
            int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}, {16, 17, 18},
                    {19, 20, 21}, {22, 23, 24}, {25, 26, 27}, {28, 29, 30}, {31, 32, 33}, {34, 35, 36}};
            int winningRow = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j : numbers[i]) {
                    if (j == winningNumber) {
                        winningRow = i;
                    }
                }

            }
            for (Bet i:sixLineList){
                System.out.println(Arrays.toString(i.getBetNumberList().toArray()));
                if (i.getBetNumberList().contains(winningRow)){
                    for (int o:i.getBetNumberList()){
                        if (o==winningRow){
                            System.out.println("You hit six line in "+o+" of bet "+ i.getBetAmonunt());
                            chips+=(i.getBetAmonunt()*5);
                        }
                    }
                }
                else {
                    System.out.println("You didn't win in six line of bet "+i.getBetAmonunt());
                }
            }
            sixLineList.clear();
        }
    // checks in  redBlack list to see if  player winn or not and  increase it chips as equal to 1.
        public static void redBlackCheck(ArrayList<Bet> redBlackList){
            int winner=2;
            int[] redArray = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
            int[] blackArray = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
            for(int i:redArray){
                if(i==winningNumber){
                    winner=1;

                }
            }

            for (Bet i: redBlackList){
                System.out.println(Arrays.toString(i.getBetNumberList().toArray()));
                if (i.getBetNumberList().contains(winner)){
                    for (int o:i.getBetNumberList()){
                        if (o==winner){
                            System.out.println("You hit red and Black in "+o+" of bet "+ i.getBetAmonunt());
                            chips+=(i.getBetAmonunt());
                        }
                    }
                }
                else {
                    System.out.println("You didn't win in red and black of bet "+i.getBetAmonunt());
                }
            }
           redBlackList.clear();

        }
    // checks in  oddEven list to see if  player winn or not and  increase it chips as equal to bet amount.
        public static void oddEvenCheck(ArrayList<Bet> oddEvenList){
            int winner=1;
            if((winningNumber/2)==0){
                winner=2;
            }
            for (Bet i: oddEvenList){
                System.out.println(Arrays.toString(i.getBetNumberList().toArray()));
                if (i.getBetNumberList().contains(winner)){
                    for (int o:i.getBetNumberList()){
                        if (o==winner){
                            System.out.println("You hit odd and even in "+o+" of bet "+ i.getBetAmonunt());
                            chips+=(i.getBetAmonunt());
                        }
                    }
                }
                else {
                    System.out.println("You didn't win in oddEven of bet "+i.getBetAmonunt());
                }
            }
           oddEvenList.clear();

        }
    // checks in  highLows list to see if  player winn or not and  increase it chips as equal to bet amount.
        public static void highLowsCheck(ArrayList<Bet> highLowsList){
            int winner=0;
            if(winningNumber>18){
                winner =1;
            }
            for (Bet i:highLowsList){
                System.out.println(Arrays.toString(i.getBetNumberList().toArray()));
                if (i.getBetNumberList().contains(winner)){
                    for (int o:i.getBetNumberList()){
                        if (o==winner){
                            System.out.println("You hit highLows in "+o+" of bet "+ i.getBetAmonunt());
                            chips+=(i.getBetAmonunt());
                        }
                    }
                }
                else {
                    System.out.println("You didn't win in highLows of bet "+i.getBetAmonunt());
                }
            }
            highLowsList.clear();
        }
    // checks in  dozen list to see if  player winn or not and  increase it chips as equal to  bet amount.
        public static void dozenCheck(ArrayList<Bet> dozenList) {
            int winner=3;
            if(winningNumber<13){
                winner=1;
            }else if(winner<24){
                winner=2;
            }
            for (Bet i: dozenList){
                System.out.println(Arrays.toString(i.getBetNumberList().toArray()));
                if (i.getBetNumberList().contains(winner)){
                    for (int o:i.getBetNumberList()){
                        if (o==winner){
                            System.out.println("You hit dozen in "+o+" of bet "+ i.getBetAmonunt());
                            chips+=(i.getBetAmonunt()*2);
                        }
                    }
                }
                else {
                    System.out.println("You didn't win in dozenCheck of bet "+i.getBetAmonunt());
                }
            }
           dozenList.clear();


        }
    // checks in  column list to see if  player winn or not and  increase it chips as equal to bet amount.
        public static void columnCheck(ArrayList<Bet> columList){
            int winner=3;
            int [] column1={1,4,7,10,13,16,19,22,25,28,31,34};
            int[] column2={2,5,8,11,14,17,20,23,26,29,32,35};
            int [] column3= {3,6,9,12,15,18,21,24,27,30,33,36};
            for(int i :column1){
                if(winningNumber==i) {
                    winner = 1;
                }
            }
            for(int i:column2){
                    if(winningNumber==i){
                        winner=2;
                    }
            }
            for (Bet i: columList){
                System.out.println(Arrays.toString(i.getBetNumberList().toArray()));
                if (i.getBetNumberList().contains(winner)){
                    for (int o:i.getBetNumberList()){
                        if (o==winner){
                            System.out.println("You hit column in "+o+" of bet "+ i.getBetAmonunt());
                            chips+=(i.getBetAmonunt()*2);
                        }
                    }
                }
                else {
                    System.out.println("You didn't win in column of bet "+i.getBetAmonunt());
                }
            }
           columList.clear();

        }
    }


