package MissionDSA.ObjectOrientedProgramming;

//Inheritance is when properties and methods of base class are passed on to a derived class.

public class Inheritance {

    public static void main(String[] args) {
        cricketer c = new cricketer();
        c.bowl();
    }
}

class Athlete {
    float height;
    void run(){
        System.out.println("Player can run");
    }
    void jump(){
        System.out.println("Player can jump");
    }
}
//Class cricketer inherit class Athlete
class cricketer extends Athlete{
    float bowling_Speed;
    void bowl(){
        System.out.println("Player can bowl in cricket...");
    }
}
