package ClassDiagrams.UniversityAndStudent;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Student> students;
}

/*
University
- name: String

<---------------
               *

Student:
- name: String
- studentID: String
 */
