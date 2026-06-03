import java.util.HashMap;
import java.util.Scanner;

class HashMapDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        System.out.println("How many students?");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("Enter ID");
            int id=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name");
            String name=sc.nextLine();

            hm.put(id,name);
        }

        System.out.println("Enter ID to search");
        int id=sc.nextInt();

        System.out.println("Name = "+hm.get(id));
    }
}