import java.util.Scanner;  
public class Long{  
    public static void main(String[] args) {  
      System.out.println("Enter the Two numbers for addtion: ");  
      Scanner readInput = new Scanner(System.in);  
      long a = readInput.nextInt();  
        long b = readInput.nextInt();  
        readInput.close();  
        // It will return the sum of a and b.  
        System.out.println("The subtract of a and b is = " + Math.subtractExact(a, b));  
    }  
}  