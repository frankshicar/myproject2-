package com;

public class Student {
        String name;
        int english;
        int math;
        public Student(String name){
               this.name = name;
        }
        public Student(String name , int english, int math){
                this.name = name;
                this.english = english;
                this.math =math;
        }
        public Student(){

        }
        public void print(){
                System.out.println(name + "\t" + english + "\t" + math);
        }
}
