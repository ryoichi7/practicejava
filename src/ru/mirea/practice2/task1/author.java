package ru.mirea.practice2.task1;

public class author {

    author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    private final String name;
    private String email;
    private final char gender;
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
