import java.util.*;

public class find_the_maximum_value_element_present {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,8,49,25,98,32,15);
        System.out.println(myList.stream().max(Comparator.naturalOrder()).get());
    }
}

