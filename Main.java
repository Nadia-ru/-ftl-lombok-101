import task9.ConstructorExample;

public class Main {
    public static void main(String[] args){
        var x = new ConstructorExample.NoArgsExample();
        var des = "desk";
        var x2 = new ConstructorExample(3,7,des);
        System.out.println(x);
        System.out.println(x2);
    }
}
