package java8;

import java.util.stream.Collectors;
import java.util.*;

public class Test {

	public static void main(String[] args) {

//		Problem: Remove duplicates while preserving order.
//		Input: List = Arrays.asList(1, 2, 2, 3, 4, 4, 5)
//		Output: [1, 2, 3, 4, 5]

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 2, 6, 6, 5, -1, -2, 5, -6, -3);
//		
//		List unique=list.stream().distinct().collect(Collectors.toList());
//		
//		System.out.println(unique);

		// ==============================================

//		Problem: Return only even numbers from the list.
//		Input: List = Arrays.asList(1, 2, 3, 4, 5, 6)
//		Output: [2, 4, 6]

//		List evenNumber=list.stream().distinct().filter(x->x%2==0).collect(Collectors.toList());
//		
//		System.out.println(evenNumber);

//		List oddNumbers=list.stream().distinct().filter(x->x%2!=0).toList();
//		System.out.println(oddNumbers);

//		List squareNumbers=list.stream().map(x->x*x).collect(Collectors.toList());
//		System.out.println(squareNumbers);

//		Integer sum=list.stream().map(x->x*x).reduce(0,Integer::sum);
//		System.out.println(sum);

		// OR

//	int sum1=list.stream().mapToInt(Integer::intValue).sum();
//	System.out.println(sum1);

//		double average=list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
//		System.out.println(average);
//		
//		Set<Integer> positiveNumbers=list.stream().filter(n->n>=0).collect(Collectors.toSet());
//		System.out.println(positiveNumbers);

//		List sort = list.stream().sorted().distinct().toList();
//		System.out.println(sort);
//
//		List reverse = list.stream().distinct().sorted(Comparator.reverseOrder()).toList();
//		System.out.println(reverse);
//
		List sortByAlpha = Arrays.asList(new Emp(1, "Jaggu"), new Emp(2, "Raja"), new Emp(3, "Surendra"),
				new Emp(4, "King"), new Emp(1, "Apple"),new Emp(3,"Apple"));
//
//		List name = sortByAlpha.stream().sorted(Comparator.comparing(Emp::getName)).toList();
//		System.out.println(name.toString());
//
//		Comparator<Emp> comp = Comparator.comparingInt(Emp::getId).thenComparing(Emp::getName);
//		List l = sortByAlpha.stream().sorted(comp).toList();
//
//		System.out.println(l);
//		
//		List top3=list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
//		System.out.println(top3);
		
		List<String> names=Arrays.asList("Apple","Mango","Apple","fruit","Mango","Papaya","Papaya");
		
//	Map<String,Long> map=names.stream().collect(Collectors.groupingBy(s-> s,Collectors.counting()));
//	System.out.println(map);
		
		
//	Map<Integer, List<String>> map=	names.stream().collect(Collectors.groupingBy(String::length));
//	
//	System.out.println(map);
	
//		Map<Boolean, List<Integer>> m=list.stream().collect(Collectors.partitioningBy(n-> n%2==0));
//		System.out.println(m);
//		
//	Object s=sortByAlpha.stream().collect(Collectors.groupingBy(Emp::getName,Collectors.summingInt(Emp::getId)));
//	System.out.println(s);
		
	Object s=sortByAlpha.stream().collect(Collectors.groupingBy(Emp::getId,Collectors.mapping(Emp::getName,Collectors.joining(","))));
	System.out.println(s);
	}
}

class Emp {
	int id;
	String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return id + " " + name;
	}

}
