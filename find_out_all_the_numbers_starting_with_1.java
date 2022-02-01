import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class find_out_all_the_numbers_starting_with_1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 2, 1, 4, 9,6,12);
        numbers.stream().map(e->e+"").filter(e1->e1.startsWith("1")).forEach(System.out::println);
    }
}

