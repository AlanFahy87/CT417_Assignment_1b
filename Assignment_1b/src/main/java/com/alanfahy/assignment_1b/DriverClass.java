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
        Student s1, s2, s3, s4, s5, s6, s7, s8, s9;
        s1 = new Student("John Doe", "1234", 23, "21/10/1997", "CS&IT", "SoftEng");
        s2 = new Student("Joe James", "4567", 25, "21/10/1994", "CS&IT", "SoftEng");
        s3 = new Student("Tim Baker", "7890", 23, "21/10/1997", "CS&IT", "SoftEng");
        s4 = new Student("Simon Shoe", "9876", 23, "21/10/1997", "CS&IT", "ProSkills");
        s5 = new Student("Sarah Shop", "9976", 22, "26/12/1998", "CS&IT", "ProSkills");

        s6 = new Student("Rick Price", "9996", 27, "21/11/1995", "EE", "Maths");
        s7 = new Student("Rob Prince", "9926", 30, "10/109/1993", "EE", "Maths");

        s8 = new Student("Ann Ice", "996", 22, "21/11/1995", "EE", "Engineering");
        s9 = new Student("Dot Rince", "926", 33, "10/109/1993", "EE", "Engineering");

        ArrayList<Student> softEngStudends = new ArrayList<>();
        softEngStudends.add(s1);
        softEngStudends.add(s2);
        softEngStudends.add(s3);

        ArrayList<Student> proSills = new ArrayList<>();
        proSills.add(s4);
        proSills.add(s5);

        Modules m1 = new Modules("SoftEng", softEngStudends);
        Modules m2 = new Modules("ProSkills", proSills);

        ArrayList<Modules> csModule = new ArrayList<>();
        csModule.add(m1);
        csModule.add(m2);

        ArrayList<Student> maths = new ArrayList<>();
        maths.add(s6);
        maths.add(s7);

        ArrayList<Student> engineering = new ArrayList<>();
        engineering.add(s8);
        engineering.add(s9);

        Modules m3 = new Modules("Maths", maths);
        Modules m4 = new Modules("Engineering", engineering);
        
        ArrayList<Modules> eeModule = new ArrayList<>();
        eeModule.add(m3);
        eeModule.add(m4);

        Course course1 = new Course("CS&IT", csModule, new DateTime(2004, 12, 25, 12, 0), new DateTime(2011, 12, 25, 12, 0));
        Course course2 = new Course("Electronic Engineering",eeModule,new DateTime(2005, 12, 25, 12, 0), new DateTime(2012, 12, 25, 12, 0));
        ArrayList<Course> courseArray = new ArrayList<>();
        courseArray.add(course1);
        courseArray.add(course2);
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
