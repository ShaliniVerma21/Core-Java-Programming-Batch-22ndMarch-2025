package Day23;
	// 20. Removing Duplicates using Streams
	import java.util.*;
	import java.util.stream.Collectors;
	public class p4 {
	    public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
	        List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
	        System.out.println(unique);
	    }
	}
