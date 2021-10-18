package rouletteGame;
import java.util.ArrayList;

public class Bet {
     // create an arraylist of integers to keep tracks of value for betamount.
    private  ArrayList<Integer> array =new ArrayList<Integer>();
    // to keep tracks of bet chisp
    private int betAmonunt;
    //creats an constructor to know list in which nubmer and what ap\mount
    public Bet(ArrayList<Integer> number, int betAmonunt){
        this.betAmonunt=betAmonunt;
        this.array=number;
    }
    // to get the list numberList.
    public ArrayList<Integer> getBetNumberList(){
        return this.array;
    }
    public String toString(){
        String output =" ";
        for(int i: array){
            output += "\n number: " + i + "betamount :" +betAmonunt ;
        }
        return output;
    }
    // to get the betAmount
    public int getBetAmonunt(){return this.betAmonunt; }

}

