package day4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

class StudentDetails {
    String name;
    int age;
    boolean gender;
    int grade;

    StudentDetails(String name, int age, boolean gender, int grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }

    public String toString() {
        return "Name :" + this.name + " \nAge:" + this.age + " \nGender:" + this.gender + " \nGrade:" + this.grade;
    }

}

class StudentList {
    ArrayList<StudentDetails> studentList = new ArrayList<>();

    public void addStudent(StudentDetails s) {
        this.studentList.add(s);
    }

    public void addToFile() throws IOException, FileNotFoundException {
        FileOutputStream fout = new FileOutputStream("day4\\student.dat", true);
        DataOutputStream dos = new DataOutputStream(fout);
        for (int i = 0; i < this.studentList.size(); i++) {
            dos.writeUTF(this.studentList.get(i).name);
            dos.writeBoolean(this.studentList.get(i).gender);
            dos.writeInt(this.studentList.get(i).age);
            dos.writeInt(this.studentList.get(i).grade);
        }
        dos.close();
        fout.close();
    }

    public void printStudentDetails() throws IOException, FileNotFoundException {
        FileInputStream fout = new FileInputStream("day4\\student.dat");
        DataInputStream dos = new DataInputStream(fout);
        // byte[] students = dos.readAllBytes();
        // String s = new String(students);
        // System.out.println(s);
        while (dos.available() != 0) {
            System.out.println("Name: " + dos.readUTF());
            System.out.println("Gen: " + dos.readBoolean());
            System.out.println("Age: " + dos.readInt());
            System.out.println("Grade: " + dos.readInt());
            System.out.println("-----------------x----------------");
        }
        dos.close();
        fout.close();
    }
}

public class Student {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        StudentList obj = new StudentList();

        obj.addStudent(new StudentDetails("suresh", 25, false, 87));
        obj.addStudent(new StudentDetails("Ramesh", 15, true, 95));
        obj.addToFile();
        obj.printStudentDetails();
    }
}
