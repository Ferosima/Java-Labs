package Test.src.classes.List;

import Test.src.classes.People.Person;

import java.util.ArrayList;

public class ListPerson {
    public ArrayList<Person> list;

    public ArrayList<Person> getList() {
        return list;
    }

    public ListPerson() {
        list = new ArrayList<Person>();
    }

    public ListPerson(ArrayList<Person> list) {
        this.list = list;
    }

    public void add(Person person) {
        list.add(person);
    }

    public void remove(Person person) {
        list.remove(person);
    }

    public ListPerson filterName(String name) {
        ListPerson listFilter = new ListPerson();
        list.forEach(person -> {
            if (person.name == name)
                listFilter.add(person);
        });
        return listFilter;
    }

    @Override
    public String toString() {
        String string_list = "";
        for (Person person : list) {
            string_list += person.toString() + "\n \n";
        }
        return string_list;
    }
}
