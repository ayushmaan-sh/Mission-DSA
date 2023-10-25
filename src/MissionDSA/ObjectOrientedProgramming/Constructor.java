package MissionDSA.ObjectOrientedProgramming;

public class Constructor {

    public static void main(String[] args) {
        Student2 s2 = new Student2("Rahul");
        System.out.println("Name : "+s2.name);
    }
}

class Student2{
    String name;
    int rollNo;

    //constructor
    Student2(String name){
        this.name = name;
    }
}
