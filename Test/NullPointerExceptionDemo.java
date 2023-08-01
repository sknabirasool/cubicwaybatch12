package Test;


public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null; // str is assigned a null value

        try {
            int length = str.length(); // Attempt to access the length() method on a null object
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}
