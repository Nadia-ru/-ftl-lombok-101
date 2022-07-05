import task15.GetterLazyExample;

public class Main {
    public static void main(String[] args){
        GetterLazyExample x = new GetterLazyExample();

        for (int i =0;i< x.getCached().length;i++){
        System.out.print(x.getCached()[i]+"+");}
        for (int i =0;i< x.getCached().length;i++){
        System.out.print(x.getCached()[i]+";");}
    }
}
