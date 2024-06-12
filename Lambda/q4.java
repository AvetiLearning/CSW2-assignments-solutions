package Lambda;

interface Shape {
    double area();
    default void printArea() {
        System.out.println(area());
    }
}
public class Q4 {
//     Q4. Create a functional interface Shape with a method double area() and a
// default method void printArea(). Implement the interface using lambda
// expressions for different shapes. Define the Shape functional interface with an
// area method. Implement the interface for shapes like circle, square, and
// rectangle using lambda expressions. Use the default method to print the area of
// each shape

    public static void main(String[] args) {
        Shape circle = () -> 3.14 * 2 * 2;
        Shape square = () -> 2 * 2;
        Shape rectangle = () -> 2 * 3;
        
        circle.printArea();
        square.printArea();
        rectangle.printArea();
    }
}
