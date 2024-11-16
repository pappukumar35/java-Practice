package OOPS;

public class Student {
     int StudentId;
     String studentName;
     String studentCity;

     public void study() {
          System.out.println(studentName + "is studing");
     }

     public void showfulldetails() {
          System.out.println("my name " + studentName);
          System.out.println("my id " + StudentId);
          System.out.println("my city" + studentCity);
     }
}
