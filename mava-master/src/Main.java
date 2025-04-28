import helloworld.*;

import static helloworld.Helper.*;

public class Main {
    public static void main(String[] args) {


        //System.out.println("Hello, World!");

        Person Osoba = new Person("franta",48);

        Student Zak = new Student("marie",15, 4);
        Student Zak2 = new Student("jakub",16);

        Teacher Ucitel = new Teacher("Jan",100);
        odsazeni();
        Zak.slovo();
        Ucitel.slovo();
        odsazeni();


        System.out.println(Osoba);
        System.out.println(Zak);
        System.out.println(Zak2);

        System.out.println(Zak2.getAge());
/*
        Helper helper = new Helper();
        helper.odsazeni();
*/
        odsazeni();
        System.out.println( pozdrav );
        odsazeni();
        //-----------

        School skola = new School("skolakrizik");
        skola.addPerson(Zak);
        skola.addPerson(Zak2);
        skola.addPerson(new Student("zdenek",15));
        System.out.println( skola.getPeople() );
        odsazeni();
        System.out.println( skola.searchPerson("jakub") );




    }
}