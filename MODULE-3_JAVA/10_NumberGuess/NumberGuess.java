import java.util.Scanner;
class NumberGuess{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int num=(int)(Math.random()*100)+1;
        int guess;

        do{
            System.out.println("Enter your guess");
            guess=sc.nextInt();

            if(guess>num){
                System.out.println("Too High");
            }
            else if(guess<num){
                System.out.println("Too Low");
            }
            else{
                System.out.println("Correct Guess");
            }

        }while(guess!=num);
    }
}