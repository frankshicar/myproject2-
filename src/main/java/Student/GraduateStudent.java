package Student;

public class GraduateStudent extends Student{
    int thesis;
    public GraduateStudent(String name,
                           int math ,
                           int english ,
                           int thesie){
//        this.name = name;
//        this.english = english;
//        this.math = math;
        super( name, english, math);
        this.thesis = thesie;
    }
//    @Override
//    public void print() {
//        System.out.println(name+"\t"+english+"\t"+
//                math + "\t" + getAverage() +
//                "\t" + thesis);
//    }
}
