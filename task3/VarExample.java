package task3;

import java.util.Random;

public class VarExample {
    public String example() {
        var foo = "��������� �����:";
        Random random = new Random();
        foo = foo + random.nextInt();
        return foo;
    }

}