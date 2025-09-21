package Day23;
	// 21. Sorting with Streams
	import java.util.*;
	import java.util.stream.Collectors;
	public class p5 {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("Banana","Apple","Mango");
	        List<String> sorted = list.stream().sorted().collect(Collectors.toList());
	        System.out.println(sorted);
	    }
	}
