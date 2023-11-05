package MissionDSA.Recursion;

public class FibonnaciNumbers {
    public static int FibNum(int n){
        if(n==0 || n==1){
            return n;
        }
        int Fnm1 = FibNum(n-1);
        int Fnm2 = FibNum(n-2);
        int Fn = Fnm1 + Fnm2;
        return Fn;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(FibNum(n));
    }
}
