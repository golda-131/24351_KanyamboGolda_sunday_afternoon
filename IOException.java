package exceptionHandlinge;

public class IOException {
	public static void main(String[] args) {
        try {
            // Simulating an I/O error by trying to divide by zero
            String filePath = null; // Null file path can simulate an I/O error
            if (filePath.equals("path")) { // Will throw NullPointerException
                System.out.println("File Found!");
            }
        } catch (Exception e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
