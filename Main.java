import task4.NonNullExample;
import task4.Person;

public class Main {
    public static void main(String[] args){
        Person a = new Person("Nadya");
        NonNullExample b = new NonNullExample(a);
        System.out.println(b);
    }
}
