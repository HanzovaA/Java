package helloworld;

interface clovek {
    public void slovo ();

}




public class Person{

    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return name + " věk: " + age;
       // return name ;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }


}
