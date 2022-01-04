import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstElement {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
        System.out.println(myList.stream().findFirst().get());
    }
}
