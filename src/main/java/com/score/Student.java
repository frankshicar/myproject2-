package com.score;

import com.score.Printable;

public class Student implements Printable {
    public String name;
    protected int english;
    protected int math;
    public Student(String name) { //Constructor
        this.name = name;
    }
    public Student(String name, int english, int math) { //Constructor
        this(name);
//        this.namex = name;
        this.english = english;
        this.math = math;
//        System.out.println("Test");
    }
    public Student() { //Default constructor

    }

    @Override
    public void print() {
        System.out.print(name + "\t" + english +
                "\t" + math + "\t" + getAverage());
        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
    }
/*    public void print() {
        System.out.print(name + "\t" + english +
                "\t" + math + "\t" + getAverage());
        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
    }*/

    public int getAverage() {
        return (english+math)/2;
    }
}
