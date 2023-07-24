package basicProjects;
import java.util.*;

public class baiscCalculator {

    void functions(){
        System.out.println("BASIC CALCULATOR ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first operand : ");         //first number.
        int number_1 = sc.nextInt();

        System.out.print("Enter operator : ");              //operator selection (+,-,*,/,%).
        String operator = sc.next();

        System.out.print("Enter second operand : ");        //second number.
        int number_2 = sc.nextInt();


            if(operator.equals("+") ){
                System.out.print("Answer : "+ (number_1 + number_2));
            }else if(operator.equals("-")){
                System.out.print("Answer : "+ (number_1 - number_2));
            }else if(operator.equals("*")){
                System.out.print("Answer : "+(number_1 * number_2));
            }else if(operator.equals("/")){
                System.out.print("Answer : "+ (number_1 / number_2));
            }else if (operator.equals("%")){
                System.out.print("Answer : "+ (number_1 % number_2));
            }else{
                System.out.println("Invalid Operation!");
            }
    }

    public static void main(String[] args) {
        baiscCalculator object = new baiscCalculator();
        object.functions();
    }

}
