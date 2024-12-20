package exceptionHandlinge;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            // Trying to access an invalid array index
            System.out.println(numbers[6]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
