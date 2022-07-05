import task10.DataExample;

public class Main {
    public static void main(String[] args){
        String[] tags = new String[]{"fff","ddd"};
        var x = new DataExample("Nadya");
        x.setAge(21);
        x.setScore(2.0f);
        x.setTags(tags);
        System.out.println(x);
        Object f ="dd";
        var x2 = new DataExample.Exercise("exercise", f);
        System.out.println(x2);
    }
}
