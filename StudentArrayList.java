import java.util.Scanner;
import java.util.*;
//import java.util.ArrayList;

class Student{
    private int uid;
    private int rno;
    private int age;
    private String name;
    private String course;

    /**
     * @return int return the uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * @return int return the rno
     */
    public int getRno() {
        return rno;
    }

    /**
     * @param rno the rno to set
     */
    public void setRno(int rno) {
        this.rno = rno;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    Student(int uid,int rno, int age, String name, String course ){
        this.rno = rno;
        this.uid = uid;
        this.age = age;
        this.course = course;
        this.name = name;
    }

}


public class StudentArrayList {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Student> ar = new ArrayList<Student>();

            System.out.println("Enter the number of records to be stored: ");
            int records_no = sc.nextInt();
            //System.out.println(records_no);

            for(int i=0; i<records_no; i++){
                System.out.println("Record number: "+ ( i+1 ) ) ;
                System.out.println("Enter UID: ");
                int temp_uid = sc.nextInt();
                System.out.println("Enter rno: ");
                int temp_rno = sc.nextInt();
                System.out.println("Enter age: ");
                int temp_age = sc.nextInt();
                System.out.println("Enter name: ");
                String temp_name = sc.next();
                System.out.println("Enter Course: ");
                String temp_course = sc.next();


                //to put data into array list
                Student st  = new Student(temp_uid, temp_rno, temp_age, temp_name, temp_course);
                ar.add(st);
            }

            //System.out.println("Data Insertion Completed.\n Would you like to view the data\nEnter Y for yes or N for no");
            //String viewDataDecision = sc.next();
            for(Student s : ar) {
                System.out.println(s.getUid() + " " + s.getAge() + " " + s.getRno() + " " + s.getName() + " " + s.getCourse() + "\n");
            }
        }
    }
}
