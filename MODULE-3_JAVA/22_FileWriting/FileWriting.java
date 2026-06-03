import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class FileWriting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter text");
        String str=sc.nextLine();

        try{
            FileWriter fw=new FileWriter("output.txt");
            fw.write(str);
            fw.close();

            System.out.println("Data written successfully");
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}