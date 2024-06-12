// Develop a program that performs complex mathematical (may have log, trigonometric
// and algebraic functions) computations. Handle nchecked NullPointerExceptionu
// gracefully using try-catch block and provide a meaningful error message.

public class q5 {
    
    public static void main(String[] args) {
        try{
            double y = 0;
            double a = Math.log(y);
            double b = Math.sin(y);
            double c =  Math.pow(a, b);
            System.out.println(c);
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception");  
    }
}
}
