package exceptionHandlinge;

public class SqlException {
	 public static void main(String[] args) {
	        try {
	            // Simulating a database connection error
	            String dbUrl = "jdbc:nonexistentDB";
	            if (dbUrl.equals("jdbc:nonexistentDB")) {
	                throw new Exception("Database not found: " + dbUrl);
	            }
	        } catch (Exception e) {
	            System.out.println("SQLException: " + e.getMessage());
	        }
	    }
}
