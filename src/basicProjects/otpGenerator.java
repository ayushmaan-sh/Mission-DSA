package basicProjects;
import java.util.*;
public class otpGenerator {
    void otpGenerator_function(){
        int minRange = 100000;
        int maxRange = 999999;

        Random random = new Random();
        int rndm = random.nextInt(maxRange-minRange+1)+minRange;
        System.out.println("Your OTP is : "+rndm+" , Please Don't share it with anyone!");
    }
    public static void main(String[] args) {
        otpGenerator otpObject = new otpGenerator();
        otpObject.otpGenerator_function();
    }
}
