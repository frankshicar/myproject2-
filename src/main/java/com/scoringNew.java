package com;

public class scoringNew {
    public static void main(String[] args) {
        Student jack = new Student("jack");
//        jack.name = "Jack";
        jack.english = 70;
        jack.math = 88;
        Student hack = new Student("Hank",60,30);
        Student s = new Student();
        GraduateStudent jane = new GraduateStudent("Jane", 70, 80, 60);
        jane.name = "Jane";
        jane.print();
        jack.print();
        hack.print();
    }
}
