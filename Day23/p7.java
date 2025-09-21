package Day23;
	// 23. Stream GroupingBy
	import java.util.*;
	import java.util.stream.Collectors;
	public class p7 {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("apple","banana","apricot");
	        Map<Character, List<String>> grouped = list.stream()
	                .collect(Collectors.groupingBy(s -> s.charAt(0)));
	        System.out.println(grouped);
	    }
	}
