import java.util.*;

record Person(String name,int age){}

class RecordDemo{
    public static void main(String args[]){

        Person p1=new Person("John",20);
        Person p2=new Person("Alice",25);

        System.out.println(p1);
        System.out.println(p2);

        List<Person> list=Arrays.asList(p1,p2);

        list.stream()
            .filter(p->p.age()>21)
            .forEach(System.out::println);
    }
}