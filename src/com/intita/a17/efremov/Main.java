package com.intita.a17.efremov;

public class Main {

    public static void main(String[] args) {
        Group groupA17 = new Group(1, "A17", new Journal());
        Team team1 = new Team(1, "Super Team");
        Student student1 = new Student("Vasiliy", "Savitskiy", team1);
        Student student2 = new Student("Ivan", "Ivanov", team1);
        Student student3 = new Student("Petro", "Petrov", team1);
        groupA17.addStudent(student1);
        groupA17.addStudent(student2);
        groupA17.addStudent(student3);

        String[][] array = new String[][] {{"Vasiliy", "Ivan"},
                {"Savitskiy", "Ivanov"}};

        Lesson javalesson = new Lesson("28.11.2017", "Java", "Magenta Room", groupA17);
        javalesson.addSeveralStudent(array);
        groupA17.addNewLesson(javalesson);

        Lesson cSharpLesson = new Lesson("29.11.2017", "C#", "Magenta Room", groupA17);
        cSharpLesson.addSeveralStudent(array);
        groupA17.addNewLesson(cSharpLesson);

        System.out.println(groupA17.getJournal().getStudentPresentCount("Vasiliy", "Savitskiy"));
    }
}
