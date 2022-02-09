package com.company;
public class User {
    private static int idCounter = 0;
    private String firstName;
    private String secondName;
    private int id;
    private int age;
    private String gender;
    private String password;
    private String dateOfBirth;

    public User(){
        id = idCounter++;
        firstName = "";
        secondName = "";
        age = 0;
        gender = "";
        password = "";
        dateOfBirth = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void printUserInfo(){
        System.out.println("user ID: " + getId());
        System.out.println("firstName: " + getFirstName());
        System.out.println("secondName: " + getSecondName());
        System.out.println("age: " + getAge());
        System.out.println("gender: " + getGender());
        System.out.println("password: " + getPassword());
        System.out.println("birthday date: " + getDateOfBirth() + "\n");
    }
}
