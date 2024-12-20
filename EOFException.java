package exceptionHandlinge;

public class EOFException {
	 public static void main(String[] args) {
	        try {
	            // EOFException with array
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[5]); // Accessing invalid index
	        } catch (Exception e) {
	            System.out.println("EOFException: " + e.getMessage());
	        }
	    }
}
