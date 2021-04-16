package defaultMethods.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class java8Tester {
	
	public static void main(String[] args) {
		
		List<String> lis = new ArrayList<String>();
		lis.add("ramyaa");
		lis.add("ram");
		lis.add("ramkumar");
		lis.add("sasi");
		lis.add("dhana");
		lis.add("hemu");
		
		lis.forEach(System.out::println);
		
		List<Integer> integers = Arrays.asList(1,2,3,4,15,45,67);
		
		Optional<Integer> max = integers.stream().reduce(Math::max);
		max.ifPresent(value -> System.out.println(value));
		
		Optional<Integer> min = integers.stream().reduce(Math::min);
		min.ifPresent(value -> System.out.println(value));
		
		String strings = "how"+"to"+"do"+"java"+"program";
		List<String> sorted = strings.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		
		
	}

}
