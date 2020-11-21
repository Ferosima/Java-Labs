package Test;

import Test.src.classes.List.ListPerson;
import Test.src.classes.People.Teacher;
import Test.src.enums.Degree;
import Test.src.enums.Subject;
import com.google.gson.Gson;



public class App {
    public static void main(String[] args) {
        Teacher vasa=new Teacher(Degree.PhD, Subject.Language);
        System.out.println(vasa.toString());
        ListPerson list=new ListPerson();
        list.add(vasa);
        System.out.println(list.toString());
        Gson g = new Gson();
        System.out.println("GSON"+g.toJson(vasa));
    }
}
