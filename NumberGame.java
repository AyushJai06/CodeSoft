import java.util.*;
public class NumberGame {
    static int Maxattempts=5;
    static Random rnum=new Random();
    static Scanner sc=new Scanner(System.in);
    static int roundwon=0;
    static int totalscore=0;
    static int round=0;
    static void game(){
        int score=0;
        int attempts=0;
        int random_num=rnum.nextInt(1,101);
        do{
            System.out.println("Attempts left: "+(Maxattempts-attempts));
            System.out.print("Guess your number: ");
            int guess=sc.nextInt();
            sc.nextLine();
            attempts+=1;
            if(guess==random_num){
                System.out.println("Currect guess is: "+random_num);
                System.out.println("--Hurray!! you guessed correctly--\n");
                roundwon++;
                score=(Maxattempts-(attempts-1))*10;
                totalscore+=score;
                System.out.println("Your score: "+score+" points");
                break;

            }
            else if(Maxattempts==attempts){
                System.out.println("Attempts left: "+(Maxattempts-attempts)+"\n");
                System.out.println("--OOPS!! OUT OF ATTEMPTS--\n");
                System.out.println("Correct answer is: "+random_num+"\n");
                break;

            }
            else if(guess<random_num){
                System.out.println("Your guess is low!! Try again\n");
            }
            else if(guess>random_num){
                System.out.println("Your guess is high!! Try again\n");
            }

        }while(attempts!=Maxattempts); 
     }
     public static void main(String[] args) {
        System.out.println("--Welcome--");
        System.out.println("Guess a number between 1-100");
        System.out.println("You have 5 attempts\n");
        String choice;
        do{
            round++;
            System.out.println("\n--Round "+round+"--");
            game();
            System.out.print("Do you want to play again ? (yes/no)  :");
            choice=sc.nextLine();
            
        }while(choice.equalsIgnoreCase("yes"));
        System.out.println("Rounds played: "+round);
        System.out.println("Rounds won: "+roundwon);
         System.out.println("Your total score: "+totalscore);
     }
}


