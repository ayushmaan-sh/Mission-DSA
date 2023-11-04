package MissionDSA.Recursion;
// Recursion is a method of solving a computational problem where the solution depends upon the solutions
// to smaller the instances of the same problem.

//Problem 1 -> Print numbers n to 1 (Decreasing order) using recursion
public class PrintDecOrder {

    public static void printN(int n){
        if(n ==1){          //This condition is the base case
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");  // For example -> 10
        printN(n-1); // These are the numbers 9 to 1.
    }
    public static void main(String[] args) {
        int n = 10;
        printN(n);
    }
}
