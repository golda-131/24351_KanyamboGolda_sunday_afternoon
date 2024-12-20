package exceptionHandlinge;

public class FileNotFoundException {
	 public static void main(String[] args) {
	        try {
	            // Simulating the "file not found" error
	            String fileName = "nonExistentFile.txt";
	            if (fileName.equals("nonExistentFile.txt")) {
	                throw new Exception("File not found: " + fileName);
	            }
	        } catch (Exception e) {
	            System.out.println("FileNotFoundException: " + e.getMessage());
	        }
	    }
}
