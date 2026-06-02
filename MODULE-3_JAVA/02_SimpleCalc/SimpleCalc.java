import java.util.Scanner;
class SimpleCalc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        System.out.println("Enter operation(+,-,*,/):");
        char op=sc.next().charAt(0);
        int c;
        switch(op){
            case '+':
                c=a+b;
                System.out.println("Sum="+c);
                break;
            case '-':
                c=a-b;
                System.out.println("Difference="+c);
                break;
            case '*':
                c=a*b;
                System.out.println("Product="+c);
                break;
            case '/':
                if(b!=0){
                    c=a/b;
                    System.out.println("Quotient="+c);
                    break;
                }
                else{
                    System.out.println("Error DIvidant cannot be 0");
                    break;
                }
            default:
                System.out.println("Enter valid operation");

        }
    }
}