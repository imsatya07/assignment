
public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0; // Handle division by zero
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        // Test add method
        int sum = mathUtils.add(10, 20);
        System.out.println("Sum: " + sum);

        // Test subtract method
        int difference = mathUtils.subtract(30, 15);
        System.out.println("Difference: " + difference);

        // Test multiply method
        int product = mathUtils.multiply(5, 6);
        System.out.println("Product: " + product);

        // Test divide method
        double quotient = mathUtils.divide(20, 4);
        System.out.println("Quotient: " + quotient);
    }
}

