package oop_practice;

public class Employee extends Person{

    private String email;
    private String state;
    private String id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String email, String state, String id, String jobTitle, double salary) {
        super(name, age, gender);
        this.email = email;
        this.state = state;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee() {
        super();  // for easy object instantiation no-args constructor
    }

    public Employee(String id, String jobTitle) {
        super();
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+" is working");
    }
}
