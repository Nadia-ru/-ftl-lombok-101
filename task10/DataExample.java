package task10;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.Data;
import lombok.ToString;

@Data public class DataExample {
    private final String name;
    @Setter(AccessLevel.PUBLIC) private int age;
    private double score;
    private String[] tags;

    @ToString(includeFieldNames=true)
    @Data(staticConstructor="of")
    public static class Exercise<T> {
        private final String name;
        private final T value;

        public Exercise(String name, T value) {
            this.name = name;
            this.value = value;
        }
    }
}