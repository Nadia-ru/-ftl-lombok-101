import task6.GetterSetterExample;

public class Main {
    public static void main(String[] args){
        GetterSetterExample x = new GetterSetterExample();
        x.setAge(21);
        int y = x.getAge();
        System.out.println(y);
        x.setName("Nadya");
        System.out.println(x);

    }
}
