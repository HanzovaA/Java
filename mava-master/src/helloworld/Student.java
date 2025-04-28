package helloworld;


public class Student extends Person implements clovek{

    private int rocnik;

    public Student(String name, int age, int rocnik) {
        super(name, age);
        this.rocnik = rocnik;
    }

    public Student(String name, int age) {
        super(name, age);
        this.rocnik = rocnik;
    }

    @Override
    public void slovo() {
        System.out.println( "Muzu to odevzdat zitra?" );

    }
}
