import task13.SynchronizedExample;

public class Main {
    public static void main(String[] args){
        SynchronizedExample example = new SynchronizedExample();
        
        for(int i=0; i<100;i++) {
            example.hello();
            System.out.println(example.answerToLife());
            example.foo();
        }
    }
}
