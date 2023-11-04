package MissionDSA.Recursion;

public class PrnitIncOrder {

    public static void printInc(int n){
        // Base Case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);          // First print number 1 to 9
        System.out.print(n+" ");   // Then print n i.e. 10
    }

    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}
