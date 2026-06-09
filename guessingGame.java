import java.util.*;
public class guessingGame{
    public static void guessNumber(int num){
       
         while(true){
            System.out.print("Enter The Number: ");
            Scanner sc = new Scanner(System.in);
            int guessNum = sc.nextInt();
            if(num == guessNum){
                System.out.println("Congrates You Guess Right!!");
                   break;
            }else if(num>guessNum){
                System.out.println("Your Number Is Too Small");
            }else{
                System.out.println("Your Number Is Too High");
            }
         }

    }
    public static void main(String args[]){
        int num = (int)(Math.random()*100) + 1;
        guessNumber(num);
    }
}
