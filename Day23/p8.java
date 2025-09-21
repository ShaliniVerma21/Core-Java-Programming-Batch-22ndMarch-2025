package Day23;
	// 24. Stream AnyMatch, AllMatch, NoneMatch
	import java.util.Arrays;
	public class p8 {
	    public static void main(String[] args) {
	        boolean anyEven = Arrays.asList(1,3,5,6).stream().anyMatch(n -> n % 2 == 0);
	        System.out.println("Any Even: " + anyEven);
	    }
	}
