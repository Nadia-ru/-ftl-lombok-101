package task12;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Set;

@Builder
@ToString
public class BuilderExample {
    @Builder.Default private long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular private Set<String> occupations;
}