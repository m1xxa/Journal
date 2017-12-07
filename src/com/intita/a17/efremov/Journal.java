package com.intita.a17.efremov;

import java.util.List;

public class Journal {
    private Lesson[] lessons = new Lesson[500];

    public int getLessons_count() {
        return lessons_count;
    }

    private int lessons_count = 0;

    public void addLesson(Lesson lesson){
        lessons[lessons_count] = lesson;
        lessons_count++;
    }

    public Lesson[] getAllLessons(){
        return lessons;
    }

    public int getStudentPresentCount(String firstName, String lastName){
        int count = 0;
        Lesson[] allLessons = getAllLessons();
        for (int i = 0; i < lessons_count; i++) {
            List<Student> allStudents = allLessons[i].getStudents();
            for(Student currentStudent : allStudents){
                if(currentStudent == allLessons[i].getGroup().getStudent(firstName, lastName)) count++;
            }
        }
        return count;
    }
}
