// Create a custom checked exception class named CustomCheckedException. Use this
// exception in your program to handle a specific error condition and demonstrate its usage
// using try-catch block

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class q22 {
    public static void main(String[] args) {
       int arr[] = new int[5];
         try {
              if(arr.length < 6){
                throw new CustomCheckedException("Array length is less than 6");
              }
            } catch (CustomCheckedException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred.");
            }

        arr[6] = 10;

    }
}
