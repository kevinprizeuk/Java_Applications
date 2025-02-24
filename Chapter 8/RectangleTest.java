public class RectangleTest {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle();

        // Display default values
        System.out.println("Default Length: " + rectangle.getLength());
        System.out.println("Default Width: " + rectangle.getWidth());
        System.out.println("Default Perimeter: " + rectangle.perimeter());
        System.out.println("Default Area: " + rectangle.area());

        // Set new values
        try {
            rectangle.setLength(5.0);
            rectangle.setWidth(3.0);
            System.out.println("\nUpdated Length: " + rectangle.getLength());
            System.out.println("Updated Width: " + rectangle.getWidth());
            System.out.println("Updated Perimeter: " + rectangle.perimeter());
            System.out.println("Updated Area: " + rectangle.area());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test invalid values
        try {
            rectangle.setLength(25.0); // Invalid length
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            rectangle.setWidth(-5.0); // Invalid width
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}