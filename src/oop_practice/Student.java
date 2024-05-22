package oop_practice;

public class Student extends Person{
    public Student(String name, int age, char gender) {
        super(name, age, gender);
    }
    public void study(){
        System.out.println(name+ " is study");
    }
}
