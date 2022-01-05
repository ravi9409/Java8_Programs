import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {

        List<Person> personList= Arrays.asList(new Person(1,"Ram",25),
        new Person(2,"Peter",31),
        new Person(3,"Steve",25));

        Person person=personList.stream().filter(x->"Peter".equals(x.getName())).findAny().orElse(null);

        System.out.println(person);


    }
}
