package MissionDSA.Recursion;

public class NatNumSum {

    public static int NaturalNumbersSum(int n){
        if(n==1){
            return 1;
        }
        int Snm1 = NaturalNumbersSum(n-1);
        int Sn = n+NaturalNumbersSum(n-1);
        return Sn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(NaturalNumbersSum(n));
    }
}
