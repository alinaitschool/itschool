package com.github.alina.session_8_array_linkedlist.challenge;
/*Create
2 empty ArrayLists: studentList and graduateStudentList
populate studentList with 10 students
copy values from studentList to graduateStudentList
iterate through graduateStudentList and print each graduated student
*/

import java.util.ArrayList;

public class Challenge_03 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Student1");
        studentList.add("Student2");
        studentList.add("Student3");
        studentList.add("Student4");
        studentList.add("Student5");
        studentList.add("Student6");
        studentList.add("Student7");
        studentList.add("Student8");
        studentList.add("Student9");
        studentList.add("Student10");
        ArrayList<String> graduateStudentList = (ArrayList<String>) studentList.clone();
        for (String student : graduateStudentList) {
            System.out.println(student);
        }
    }
}
//https://stackoverflow.com/questions/8441664/how-do-i-copy-the-contents-of-one-arraylist-into-another