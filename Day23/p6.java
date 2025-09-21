package Day23;
	// 22. Stream Reduce Example
	import java.util.Arrays;
	public class p6 {
	    public static void main(String[] args) {
	        int sum = Arrays.asList(1,2,3,4,5).stream().reduce(0, Integer::sum);
	        System.out.println("Sum = " + sum);
	    }
	}
