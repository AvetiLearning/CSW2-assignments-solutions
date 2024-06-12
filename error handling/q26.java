// Implement try-catch-finally blocks to handle ClassNotFoundException and
// MethodNotFoundException.

import java.lang.reflect.Method;

public class q26 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.util.String");
            Method method = c.getMethod("eqdsfsduals");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        } finally {
            System.out.println("Finally block");
        }
}
}
