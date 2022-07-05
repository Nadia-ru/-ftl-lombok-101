import task12.BuilderExample;

import java.util.Collections;

public class Main {
    public static void main(String[] args){
        BuilderExample example = BuilderExample.builder()
                .created(12)
                .age(21)
                .name("Pasha")
                .occupation("programing")
                .occupations(Collections.singleton("cooking"))
                .build();
        System.out.println(example);
    }
}
