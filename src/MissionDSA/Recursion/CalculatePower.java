package MissionDSA.Recursion;
public class CalculatePower {

    public static int calcPower(int x, int n){
    if(n == 0){
        return 1;
    }
    return x * calcPower(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(calcPower(2,3));
    }
}
