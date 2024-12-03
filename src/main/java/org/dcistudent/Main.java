package org.dcistudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("John Doe", "Java", "Lagos", true);

        System.out.println("Enter your name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter your course: ");
        student.setCourse(scanner.nextLine());
        System.out.println("Enter your city: ");
        student.setCity(scanner.nextLine());
        System.out.println("Are you an internationalist? (true/false): ");
        student.setIsInternationalist(scanner.nextBoolean());

        student.printStudentInfo();

        scanner.close();
    }
}