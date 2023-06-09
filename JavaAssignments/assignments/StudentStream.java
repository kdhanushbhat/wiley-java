package assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StudentList{
	private List<Student> studentlist = new ArrayList<>();
	
	public StudentList() {
		studentlist.add(new Student(1, "dhanush", 10, 20));
		studentlist.add(new Student(2, "deepak", 5, 10));
		studentlist.add(new Student(3, "sagar", 6, 12));
		studentlist.add(new Student(4, "prashanth", 7, 14));
		studentlist.add(new Student(5, "nandana", 2, 4));
		studentlist.add(new Student(6, "yuga", 8, 16));
		studentlist.add(new Student(7, "jack", 12, 24));
		studentlist.add(new Student(8, "sean", 6, 12));
		studentlist.add(new Student(9, "steve", 11, 22));
		studentlist.add(new Student(10, "anil", 1, 2));
	}
	
	public Boolean addStudent() {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int id = sin.nextInt();
		System.out.println("Enter Studetn Name:");
		String name = sin.next();
		System.out.println("Enter Number Questions Solved:");
		int qsolved = sin.nextInt();
		System.out.println("Enter Total Score:");
		int score = sin.nextInt();
		return studentlist.add(new Student(id, name, qsolved, score));
	}
	
	public void showStudents() {
		studentlist.forEach(student -> {
			System.out.println("-----------------------------------");
			System.out.println(student.toString());
		});
		System.out.println("-----------------------------------");
	}
	
	public void sortStudents(int sortChoice) {
		Stream<Student> studentstream = studentlist.stream();
		List<Student> sortedList;
		switch(sortChoice) {
		case 1:
			sortedList = studentstream.sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
			break;
		case 2:
			sortedList = studentstream.sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
			break;
		case 3:
			sortedList = studentstream.sorted(Comparator.comparing(Student::getScore).reversed()).collect(Collectors.toList());
			break;
		case 4:
			sortedList = studentstream.sorted(Comparator.comparing(Student::getQSolved).reversed()).collect(Collectors.toList());;
			break;
		default:
			sortedList = new ArrayList<>();
		}
		sortedList.forEach(student -> {
			System.out.println("-----------------------------------");
			System.out.println(student.toString());
		});
		System.out.println("-----------------------------------");
	}
	
	public void topFiveStudents() {
		List<Student> top5 = studentlist.stream().
				sorted(Comparator.comparingInt(Student::getScore).reversed())
		        .limit(5)
		        .collect(Collectors.toList());
		top5.forEach(student -> {
			System.out.println("-----------------------------------");
			System.out.println(student.toString());
		});
		System.out.println("-----------------------------------");
	}
}

public class StudentStream {
	public static void main(String[] args) {
		
		StudentList st = new StudentList();
		int n;
		boolean control = true;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Menu:\n1: ENTER STUDENT\n2: VIEW STUDENT LIST\n3: SORT "
					+ "AND VIEW\n4: TOP 5 STUDENTS\n5: EXIT");
			n = sc.nextInt();
			switch (n) {
			case 1:
				st.addStudent();

				break;
			case 2:
				st.showStudents();

				break;
			case 3:
				System.out.println("1: ID\t2: Name\t3: Score\t4: Questions Solved");
				int sortControl = sc.nextInt();
				if(sortControl>4||sortControl<1) {
					System.out.println("Invalid Choice");
				} else {
					st.sortStudents(sortControl);
				}

				break;
			case 4:
				st.topFiveStudents();

				break;
			case 5:
				control = false;

				break;
			default:

				System.out.println("Invalid Choice!!! Try Again...");
			}
		} while(control);
		
		
	}
}
