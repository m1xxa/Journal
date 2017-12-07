package com.intita.a17.efremov;

import java.util.*;

public class Group {
    private int groupId;
    private String groupName;
    private List<Student> students;
    private Journal journal;

    Group(int groupId, String groupName, Journal journal){
        students = new ArrayList<Student>();
        this.groupId = groupId;
        this.groupName = groupName;
        this.journal = journal;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student curr : students) {
            if(curr.getFirstName().equals(firstName) && curr.getSecondName().equals(lastName)){
                return curr;
            }
        }
        return null;
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public void addNewLesson(Lesson lesson){
        this.journal.addLesson(lesson);
    }
}
