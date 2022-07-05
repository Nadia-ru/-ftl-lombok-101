import task8.EqualsAndHashCodeExample;
import task8.Shape;

public class Main {
    public static void main(String[] args){
        Shape shape = new EqualsAndHashCodeExample.Square(5, 10);
        var x = new EqualsAndHashCodeExample();
        Shape v = x.getShape();
        System.out.println(x);
        System.out.println(shape);
        System.out.println(v);

    }
}
