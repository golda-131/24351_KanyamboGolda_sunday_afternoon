package exceptionHandlinge;

public class ClassCastException {
	public static void main(String[] args) {
        try {
            Object obj = new Integer(100);
            // Attempting an invalid type cast
            String str = (String) obj;
        } catch (Exception e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}
