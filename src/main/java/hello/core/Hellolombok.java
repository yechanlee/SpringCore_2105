package hello.core;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Hellolombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        Hellolombok hellolombok = new Hellolombok();
        hellolombok.setName("asd");

        String name= hellolombok.getName();
        System.out.println("name = " + name);
    }
}
