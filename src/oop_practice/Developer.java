package oop_practice;

public class Developer extends Employee{

    private String language;
    private boolean isFullTime;

    public Developer() {
        super();
    }

    public Developer(String name, int age, char gender, String email, String state, String id, String jobTitle, double salary, String language, boolean b) {
        super(name, age, gender, email, state, id, jobTitle, salary);
        this.language = language;
    }

    public Developer(String language, boolean isFullTime) {
        this.language = language;
        this.isFullTime = isFullTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public void code(){
        System.out.println(name+ " is coding ");
    }

}
