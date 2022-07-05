import task11.ValueExample;

public class Main {
    public static void main(String[] args){
        String[] tags = new String[]{"ddd"};
        var x = new ValueExample("Nadya",21,5.0f,tags);
        System.out.println(x.getAge());
        System.out.println(x);
        String s ="ddd";
        var x2 = new Exception("tt");
        System.out.println(x2);
    }
}
