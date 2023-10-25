package MissionDSA.ObjectOrientedProgramming;

public class TypesOfInheritance {

    public static void main(String[] args) {
    Sportsperson sports = new Sportsperson();
    sports.run(); sports.jump();

    team_India india = new team_India();
    india.captain();

    volleyball v = new volleyball();
    v.attack(); v.defend();
    }
}
//Base class
class Sportsperson {
    float height;
    void run(){
        System.out.println("Player can run");
    }
    void jump(){
        System.out.println("Player can jump");
    }
}

//Single level inheritance -> Single Base class and single derived class.
class volleyball extends Sportsperson{
    void defend(){
        System.out.println("Player can defend in volleyball");
    }
    void attack(){
        System.out.println("Player can attack in volleyball");
    }
}

//Multi level inheritance -> Single Base class ,derived class and it's derived class
class cricket extends Sportsperson{
    int number_of_player;
}
class team_India extends cricket{
    String CaptainName;
    void captain(){
        System.out.println("Captain is Virat Kohli");
    }
}

//hierarchical inheritance -> 1 base class and multiple derived class.
