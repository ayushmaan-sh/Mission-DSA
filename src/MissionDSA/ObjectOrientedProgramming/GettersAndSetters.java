package MissionDSA.ObjectOrientedProgramming;

public class GettersAndSetters {
    public static void main(String[] args) {
        Student st2 = new Student();
        st2.setName("Rahul");
        System.out.println("Name : "+st2.getName());
        st2.setClass(12);
        System.out.println("Class : " + st2.getClas());
        st2.setRollNo(500257);
        System.out.println("Roll Number : "+st2.getRollNo());
        st2.calPercentage(71,75,74,85,82);
        System.out.println("CGPA : "+st2.getPercentage());
    }
}
  class Student{
        int Class , RollNo;
        float cgpa;
        String Name;

         int getClas(){              //Getter
            return this.Class;
        }
        int getRollNo(){
             return this.RollNo;
        }
        float getPercentage(){
             return this.cgpa;
        }
        String getName(){
             return this.Name;
        }

      void setName(String newName){
          Name = newName;
      }
      void setRollNo(int newRollNo){
          RollNo = newRollNo;
      }
      void setClass(int newClass){       //Setter
            Class = newClass;
        }
      void calPercentage(int phy, int chem, int maths, int ped, int eng){
          cgpa = (phy+chem+maths+ped+eng) / 5;
      }
    }

