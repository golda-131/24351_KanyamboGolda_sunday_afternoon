package exceptionHandlinge;

public class IllegalArgumentExceptions {
	public static void main(String[] args) {
        try {
            // Passing a negative invalid argument to Thread.sleep()
            Thread.sleep(-1000); 
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("IllegalArgumentException caught: Invalid argument provided.");
        }
    }
}
