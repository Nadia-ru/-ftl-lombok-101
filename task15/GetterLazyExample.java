package task15;
import lombok.Getter;

public class GetterLazyExample {
    @Getter(lazy=true) private final double[] cached = expensive();

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] =(double) i;
        }
        return result;
    }
}