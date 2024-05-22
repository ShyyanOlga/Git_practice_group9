package oop_practice;

public class Main {
    public static void main(String[] args) {

        Student lena = new Student("Lena",34,'F');
        Employee suzy = new Employee();
        suzy.name = "Suzy";
        Developer john = new Developer("John",42,'M',"jhondf@gmail.com","CA","W123","Developer",150.000,"Java",true);
        System.out.println(john);


    }
}
