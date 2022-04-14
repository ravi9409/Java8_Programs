package lambdasinaction.appa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringArraytoString {

	public static void main(String[] args) {
		
		List<String> l1=Arrays.asList("Hello","world");
		List<String> list=l1.stream().map(s->s.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
		list.forEach(System.out::print);
	}

	
}
