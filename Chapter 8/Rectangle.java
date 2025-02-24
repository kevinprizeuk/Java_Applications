public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0; // Default length
        this.width = 1.0;  // Default width
    }

    // Set methods with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be > 0.0 and < 20.0");
        }
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be > 0.0 and < 20.0");
        }
    }

    // Get methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }

    // Calculate area
    public double area() {
        return length * width;
    }
}