import java.util.*;

class LambdaDemo{
    public static void main(String args[]){

        List<String> list=new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Orange");

        Collections.sort(list,(a,b)->a.compareTo(b));

        for(String s:list){
            System.out.println(s);
        }
    }
}