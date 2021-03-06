package com.Student;

public class Student implements Printable{
        String name;
        int english;
        int math;
        public Student(String name){
               this.name = name;
        }
        public Student(String name , int english, int math){
//                this.name = name;
                this(name);
                this.english = english;
                this.math =math;
        }
        public Student(){
                this("Jone Doe", -1,-1);
//                name = "Jone Doe";
//                english = -1;
//                math = -1;
        }

        public void print(){
                System.out.print(name +
                        "\t" + english + "\t" +
                        math +"\t" + getAverage());
                if (getAverage() < 60){
                        System.out.print("*");
                }
                System.out.println();
        }
//        public void print() {
//                System.out.print(name +
//                        "\t" + english + "\t" +
//                        math +"\t" + getAverage());
//                if (getAverage() < 60){
//                        System.out.print("*");
//                }
//                System.out.println();
//        }
        public int getAverage() {
                return (english+math)/2;
        }
}
