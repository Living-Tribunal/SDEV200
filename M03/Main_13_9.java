
// Circle
// AUTHOR: <|Cody Dalton|>
// Date: 11.8.2023
// Purpose: <| Rewrite the Circle class in Listing 13.2 to extend GeometricObject and implement the Comparable interface.|>
public class Main_13_9 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(12.23);
        Circle circle2 = new Circle(67.89);
        Circle circle3 = new Circle(65.43);
        Circle circle4 = new Circle(12.23);

        System.out.println("c1.equals(c2): " + circle1.equals(circle2));
        System.out.println("c1.equals(c4): " + circle1.equals(circle4));
        System.out.println("c2.compareTo(c3): " + circle2.compareTo(circle3));
    }
}
