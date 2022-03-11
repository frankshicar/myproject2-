package com;

public class Student {
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
                int average = ((math +english)/2);
                System.out.print(name + "\t" + english + "\t" + math+ "\t" + average);
                if( average <= 45){
                        System.out.println("*");
                }
                System.out.println();
        }
}
