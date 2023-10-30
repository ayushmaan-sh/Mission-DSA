package MissionDSA.Recursion;
// Recursion is a method of solving a computational problem where the solution depends upon the solutions
// to smaller the instances of the same problem.

//Problem 1 -> Print numbers n to 1 (Decreasing order) using recursion
public class Intro {

    public static void printN(int n){
        if(n ==1){          //This condition ios the base case
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printN(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printN(n);
    }
}
