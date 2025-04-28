package helloworld;

import java.util.ArrayList;

public class School {

    private String name;
    private ArrayList<Person> people;


    public School(String name) {
        this.name = name;
        this.people = new ArrayList<>();
    }
    public String getName(){
        return name;
    }

    public ArrayList<Person> getPeople(){
        return people;

    }
    public void addPerson(Person person){
        people.add(person);
    }

    public Person searchPerson(String name){
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null; // Nenalezeno
    }




}
