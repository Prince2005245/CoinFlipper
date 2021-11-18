package GitHub_Work.CoinFlipper;

import java.util.Scanner;

public class CoinFlipper {
public static void main(String args[]){    
    Scanner input = new Scanner(System.in);
    while (true) {
        System.out.print("Please guess the coin toss (h or t): ");
        String guess = input.nextLine();
        String heads = "h";
        String tails = "t";

        if(guess==null || guess.length() > 1){
            break;
        }

        System.out.println("Tossing the coin...");

        int random=(int)(Math.random()*2);

        if(random<1){ 
            if(heads.equals(guess)){
                System.out.println("The coin came up heads. You win!");
            }
            else{
                 System.out.println("Sorry, incorrect, your guess was " + guess );
            }
        }else{
            if(tails.equals(guess)){
                System.out.println("The coin came up tails. You win!");
            }
            else{
                 System.out.println("Sorry, incorrect, your guess was " + guess);
                 input.close();
                 
            }
        }

    }
  }
}