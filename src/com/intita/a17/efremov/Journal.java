package com.intita.a17.efremov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<Student> getStudentsByCountOfPresent(int count){
        List<Student> listOfStudents = new ArrayList<>();
        HashMap<Student, Integer> studentsMap = new HashMap<Student, Integer>();

        for (int i = 0; i < lessons_count; i++) {
            for(Student currentStudent : lessons[i].getStudents()){
                if(studentsMap.containsKey(currentStudent)){
                    int c = studentsMap.get(currentStudent);
                    studentsMap.put(currentStudent, ++c);
                }
                else {
                    studentsMap.put(currentStudent, 1);
                }
            }
        }

        for(Map.Entry entry : studentsMap.entrySet()){
            int value = (int)entry.getValue();
            Student student = (Student)entry.getKey();

            if(value >= count){
                listOfStudents.add(student);
            }

        }

        return listOfStudents;
    }
}
