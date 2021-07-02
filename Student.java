package Uni_stu_record_system;

public class Student {

    protected String name;
    protected String address;
    protected String specialization;
    protected String specialAttribute;
    protected String stuID;
    protected Character sex;
    protected int bornYear,  IT, SE, DS, CS, CSN;

    /*specialAttribute : A student can be a week end student or weekday student. Weekend student has the
    special attribute called “job title” and the weekday student has a special attribute called “free day”.*/

    public void addDetails(String name, String address, char sex, int bYear, String specialization, String special_attribute){
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.bornYear = bYear;
        this.specialization = specialization;
        this.specialAttribute = special_attribute;
    }
    public void addMark(int it,int se,int ds,int cs,int csn ){
        this.IT = it;
        this.SE = se;
        this.DS = ds;
        this.CS = cs;
        this.CSN = csn;
    }

    // Optional function for print student's marks for subjects
    public void showMarks(){
        System.out.println("Marks for IT, SE, DS, CS, CSN : " + this.IT+ " " + this.IT+ " " +this.DS+ " " + this.CS + " "+ this.CSN);
    }
    public void showDetails(){
        System.out.println("Student name " + this.name);
        System.out.println("Student Address " + this.address );
        System.out.println("Gender " + this.sex);
        System.out.println("Student year " + this.bornYear);
        System.out.println("Student Specialization " + this.specialization);
    }

    public String IDgeneration(){
        ID_Generation myid = new ID_Generation();
        this.stuID = this.specialization + myid.Idgeneration()+ " : "+ this.specialization;
        return stuID;
    }

   public String getSpecialAttribute() {
        return specialAttribute;
    }

    public void setSpecialAttribute(String special_attribute) {
        this.specialAttribute = special_attribute;
    }
}
class Weekend extends Student{
    public void showDetailsStudent(){
        this.setSpecialAttribute(this.specialAttribute);
        this.showDetails();
        System.out.println(new StringBuilder().append("Student Job Title ").append(this.getSpecialAttribute()).toString());

    };
}
class Weekday extends Student {
    public void showDetailsStudent() {
        this.setSpecialAttribute(this.specialAttribute);
        this.showDetails();
        System.out.println(new StringBuilder().append("Student Freeday ").append(this.getSpecialAttribute()).toString());

    }


    public static void main(String[] args) {

        Weekend student1 = new Weekend();
        student1.addDetails("Jane", "Malabe", 'F', 1990, "DS", "QA");
        String studentid = student1.IDgeneration();
        student1.addMark(56, 34, 12, 46, 78);
        student1.showDetailsStudent();
        System.out.println("Student ID "+ studentid);
        System.out.println();

        Weekday student2 = new Weekday();
        student2.addDetails("Jim", "Kaluthara", 'M', 1991, "SE", "Tuesday");
        String studentid2 = student2.IDgeneration();
        student2.addMark(56, 34, 12, 46, 78);
        student2.showDetailsStudent();
        System.out.println("Student ID "+ studentid2);
        System.out.println();

        Enroll sem1 = new Enroll();
        sem1.enrollStudent(studentid, "DS");
        sem1.enrollStudent(studentid2, "SE");
        System.out.println("\n\nEnrolled student details");
        sem1.displayEnrolledStudents();
    }
}