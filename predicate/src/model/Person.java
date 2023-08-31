package model;

public class Person {

    private static final int ADULT_AGE = 18;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= ADULT_AGE;
    }

    public boolean nonAdult() {
        return age < ADULT_AGE;
    }

}
