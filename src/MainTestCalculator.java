public class MainTestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test add method
        System.out.println("Testing add method:");
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("-2 + 1 = " + calculator.add(-2, 1));
        System.out.println();

        // Test subtract method
        System.out.println("Testing subtract method:");
        System.out.println("5 - 3 = " + calculator.subtract(5, 3));
        System.out.println("2 - 5 = " + calculator.subtract(2, 5));
        System.out.println();

        // Test multiply method
        System.out.println("Testing multiply method:");
        System.out.println("2 * 3 = " + calculator.multiply(2, 3));
        System.out.println("2 * -5 = " + calculator.multiply(2, -5));
        System.out.println();

        // Test divide method
        System.out.println("Testing divide method:");
        System.out.println("5 / 2 = " + calculator.divide(5, 2));
        try {
            System.out.println("5 / 0 = " + calculator.divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
