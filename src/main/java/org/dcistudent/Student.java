package org.dcistudent;

import lombok.*;

@Getter @Setter
public class Student {
    private Integer id = 1;
    private String name;
    private String course;
    private String city;
    private Boolean isInternationalist = true;

    public Student(String name, String course, String city, Boolean isInternationalist) {
        this.name = name;
        this.course = course;
        this.city = city;
        this.isInternationalist = isInternationalist;
        this.setId(this.getId() + 1);
    }

    public void printStudentInfo(){
        if (this.getCourse().equalsIgnoreCase("java")) {
            System.out.println(this);
            return;
        }

         System.out.println("Sorry, but we only allow students of the java course, Try again some other time.");
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nCourse: " + course + "\nCity: " + city + "\nInternationalist: " + isInternationalist;
    }
}
