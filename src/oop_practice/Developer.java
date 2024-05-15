package oop_practice;

public class Developer {

    private String language;
    private boolean isFullTime;

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
}
