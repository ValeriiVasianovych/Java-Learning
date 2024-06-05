public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4, 7);

        double sum = triangle.getSumOfSides();
        System.out.println("Sum of sides: " + sum);
    }
}
