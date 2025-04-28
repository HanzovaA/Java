package helloworld;

public class Teacher extends Person implements clovek {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void slovo() {
        System.out.println( "Mas za 5!" );

    }
}
