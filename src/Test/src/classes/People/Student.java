package Test.src.classes.People;

import Test.src.enums.Degree;
import Test.src.enums.Specialty;

public class Student extends Person {
    public Degree degree;
    public Specialty specialty;
    public int number_course;

    public Student(Degree degree) {
        this.degree = degree;
    }

    public Student(String name, String last_name, int old, Degree degree, Specialty specialty,int number_course) {
        super(name, last_name, old);
        this.degree = degree;
        this.specialty = specialty;
        this.number_course=number_course;
    }
    @Override
    public String toString() {
        return "Name : "+name+
                "\nLast name : "+last_name +
                "\nOld : "+old +
                "\nDegree : "+degree+
                "\nSpecialty : "+specialty+
                "\nNumber Course : "+number_course;
    }
}
