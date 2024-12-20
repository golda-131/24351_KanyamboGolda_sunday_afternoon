package exceptionHandlinge;

public class ClassNotFoundException {
	public static void main(String[] args) {
        try {
            // Simulating ClassNotFoundException with custom behavior
            String className = "NonExistentClass";
            if (className.equals("NonExistentClass")) {
                throw new Exception("Class not found: " + className);
            }
        } catch (Exception e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}
