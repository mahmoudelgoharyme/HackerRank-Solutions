import java.util.Scanner;

public class Solution {
  
    // Function to calculate sum of two numbers
    public static int solveMeFirst(int x,int y){
            return x+y;
    }
  
    // Main function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // First input
        int a = input.nextInt();
        
        // Second input
        int b = input.nextInt();

        // Output
        if (a >= 1 && b <= 1000)
            System.out.println(solveMeFirst(a,b));
      
    }
}
