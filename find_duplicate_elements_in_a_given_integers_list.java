import java.util.*;

public class find_duplicate_elements_in_a_given_integers_list {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        myList.stream().filter(e1->!set.add(e1)).forEach(System.out::println);
    }
}

