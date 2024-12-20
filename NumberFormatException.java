package exceptionHandlinge;

public class NumberFormatException {
	public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc"); // Invalid format
        } catch (Exception e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
