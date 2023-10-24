package MissionDSA.ObjectOrientedProgramming;

public class ClassesAndObjects {
    public static void main(String[] args) {
        //Creating object of student.
        student st = new student();

        //Setting name
        st.setName("Ayushmaan Shukla");
        System.out.println("Name : "+st.Name);

        //Setting roll number
        st.setRollNo(19);
        System.out.println("Roll Number : "+st.RollNo);

        //Calculating Percentage
        st.calPercentage(80,90,85,95,95);
        System.out.println("Total percentage : "+st.cgpa);
    }
}
class student{
    // All properties and functions goes here.
    String Name;
    int RollNo;
    float cgpa;
    void setName(String newName){
        Name = newName;
    }
    void setRollNo(int newRollNo){
        RollNo = newRollNo;
    }
    void calPercentage(int phy, int chem, int maths, int ped, int eng){
        cgpa = (phy+chem+maths+ped+eng) / 5;
    }
}
