import java.util.*;
import java.util.stream.Collectors;

public class Reverse_words_in_string {
    public static void main(String[] args) {
        String sentence="how! to do in java!!";
        Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator().forEachRemaining(System.out::println);
    }
}

