import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo5 {
    public static void main(String[] args) throws IOException {
      //Stream.of(1,2,3).forEach(System.out::println);
   //   Stream.generate(()->"hello").forEach(System.out::println);
       // Files.lines(Paths.get("great.txt")).forEach(System.out::print);
        Predicate<Integer> mytest=Predicate.isEqual()
        System.out.println(mytest.test(2));
//        List<Integer> list= Arrays.asList(1,2,5,67,8,4,21,4,6,7).stream().filter(predicate).collect(Collectors.toList());
//        for (int a:list)
//            System.out.println(a);

    }
}
