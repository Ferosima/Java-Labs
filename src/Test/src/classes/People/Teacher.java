package Test.src.classes.People;

import Test.src.enums.Degree;
import Test.src.enums.Subject;

public class Teacher extends Person {
    public Subject subject;
    public Degree degree;

    public Teacher(Degree degree, Subject subject) {
        this.degree = degree;
        this.subject=subject;
    }

    public Teacher(String name, String last_name, int old, Degree degree, Subject subject) {
        super(name, last_name, old);
        this.degree = degree;
        this.subject=subject;
    }
    @Override
    public String toString() {
        return "Name : "+name+
                "\nLast name : "+last_name +
                "\nOld : "+old +
                "\nDegree : "+degree+
                "\nSubject : "+subject;
    }
}
