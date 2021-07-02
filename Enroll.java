package Uni_stu_record_system;

public class Enroll {
    String stuID;
    String specialization;
    public void enrollStudent(String StuID, String Specialization){
        this.specialization = Specialization;
        this.stuID = StuID;
    }
    public void displayEnrolledStudents(){
        System.out.println(stuID);
    }
}
