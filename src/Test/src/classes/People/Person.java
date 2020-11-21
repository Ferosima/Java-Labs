package Test.src.classes.People;

public class Person {
    public String name;
    public String last_name;
    public int old;

    public Person() {
        this.name = "Ivan";
        this.last_name = "Ivanov";
        this.old = 26;
    }

    public Person(String name, String last_name, int old) {
        this.name = name;
        this.last_name = last_name;
        this.old = old;
    }

    @Override
    public String toString() {
        return "Name : "+name+"\nLast name : "+last_name +"\nOld : "+old;
    }
}
