/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alanfahy.assignment_1b;

import com.alanfahy.assignment_1.Course;
import com.alanfahy.assignment_1.Modules;
import com.alanfahy.assignment_1.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author alanfahy87
 */
public class DriverClass {

    public static void main(String[] args) {
        Student s1, s2, s3, s4;
        s1 = new Student("John Doe", "1234", 23, "21/10/1997", "CS&IT", "SoftEng");
        s2 = new Student("Joe James", "4567", 25, "21/10/1994", "CS&IT", "SoftEng");
        s3 = new Student("Tim Baker", "7890", 23, "21/10/1997", "CS&IT", "SoftEng");
        s4 = new Student("Simon Shoe", "9876", 23, "21/10/1997", "CS&IT", "SoftEng");
        ArrayList<Student> SoftEngStudends = new ArrayList<>();
        SoftEngStudends.add(s4);
        SoftEngStudends.add(s3);
        SoftEngStudends.add(s1);

        ArrayList<Student> SoftEngStudends2 = new ArrayList<>();
        SoftEngStudends2.add(s2);
        SoftEngStudends2.add(s4);

        Modules m1 = new Modules("SoftEng", SoftEngStudends2);
        Modules m2 = new Modules("ProSkills", SoftEngStudends);

        ArrayList<Modules> csModule = new ArrayList<>();
        csModule.add(m1);
        csModule.add(m2);

        
        Course course = new Course("CS&IT", csModule, new DateTime(2004, 12, 25, 12, 0), new DateTime(2011, 12, 25, 12, 0));
        ArrayList<Course> courseArray = new ArrayList<>();
        courseArray.add(course);
        PrintInfo(courseArray);

    }

    private static void PrintInfo(ArrayList<Course> courseArray) {
        for (int p = 0; p < courseArray.size(); p++) {
            System.out.println("===================================================================");
            System.out.println("Course: " + courseArray.get(p).getCourseName());
            System.out.println("Start Date: " + courseArray.get(p).getStartDate());
            System.out.println("End Date: " + courseArray.get(p).getEndDate());
            for (Modules s : courseArray.get(p).getModules()) {
                System.out.println("Module: " + s.getModuleName());
                System.out.println("\tStudents:");
                for (int i = 0; i < s.getStudents().size(); i++) {
                    System.out.println("\t\t" + s.getStudents().get(i).getName()
                            + ":\n\t\t\t[Username: " + s.getStudents().get(i).getUsername()
                            + ", ID: " + s.getStudents().get(i).getId()
                            + ", Course: " + s.getStudents().get(i).getCourse() + "]");
                }
            }
            System.out.println("===================================================================");
        }
    }

}
