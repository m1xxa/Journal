package com.intita.a17.efremov;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String date;
    private List<Student> students;
    private String subject;
    private String classRoom;

    public Group getGroup() {
        return group;
    }

    private Group group;

    Lesson(String date, String subject, String classRoom, Group group){
        students = new ArrayList<Student>();
        this.date = date;
        this.subject = subject;
        this.classRoom = classRoom;
        this.group = group;
    }

    public void checkStudent(String firstName, String lastName){
        if(group.getStudent(firstName, lastName) != null){
            students.add(group.getStudent(firstName, lastName));
        }
    }

    public void addSeveralStudent(String[][] arrayOfStudent){
        for(int j = 0; j < arrayOfStudent[0].length; j++){
            checkStudent(arrayOfStudent[0][j], arrayOfStudent[1][j]);
        }
    }

    //дз -> метод принимает на вход студента, и возвращает колличество его посещений

    public List<Student> getStudents() {
        return students;
    }

    public void printStudents(){
        for(Student curr : this.getStudents()){
            System.out.print(curr.getFirstName());
            System.out.print(" ");
            System.out.println(curr.getSecondName());
        }
    }

}
