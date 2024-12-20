package exceptionHandlinge;

public class NullPointerException {
	public static void main(String[] args) {
        try {
            String str = null;
            // Attempting to access method on a null object
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
