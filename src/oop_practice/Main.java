package oop_practice;

public class Main {
    public static void main(String[] args) {

        Student lena = new Student("Lena",34,'F');
        Employee suzy = new Employee();
        suzy.name = "Suzy";
        Developer john = new Developer("John",42,'M',"jhondf@gmail.com","CA","W123","Developer",150.000,"Java",true);
        System.out.println(john);

        Developer lina = new Developer();
        lina.name = "Lina";
        lina.age = 46;
        lina.gender = 'F';
        System.out.println(lina);

        Person sasha = new Developer();
        sasha.name = "Sasha";
        sasha.age = 37;
        sasha.gender = 'F';
        System.out.println(sasha);


    }
}
