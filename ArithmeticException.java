package exceptionHandlinge;

public class ArithmeticException {
	public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
        } catch (Exception e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
