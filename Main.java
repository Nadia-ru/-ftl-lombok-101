import task14.WithExample;

public class Main {
    public static void main(String[] args){
        WithExample I = new WithExample("Nadya",21);
        WithExample I2 =I.withAge(22);
        System.out.println(I);
        System.out.println(I2);
    }
}
