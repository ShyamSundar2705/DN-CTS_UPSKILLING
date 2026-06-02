import java.util.Scanner;
class TryCatchDemo{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a");
        int a=sc.nextInt();

        System.out.println("Enter b");
        int b=sc.nextInt();

        try{
            int c=a/b;
            System.out.println("Result = "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}