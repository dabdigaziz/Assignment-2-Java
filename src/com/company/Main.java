package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User person = new User();
        Validator checker = new Validator();

        while(person.getFirstName().length() == 0){
            System.out.println("Enter your first name (must to contain at least one character): ");
            person.setFirstName(sc.nextLine());
        }

        while(person.getSecondName().length() == 0){
            System.out.println("Enter your second name (must to contain at least one character): ");
            person.setSecondName(sc.nextLine());
        }

        while(person.getAge() == 0){
            System.out.println("Enter your age: ");
            person.setAge(sc.nextInt());
        }
        sc.nextLine();
        while(person.getGender().length() == 0){
            System.out.println("Enter your gender (for example: male or female): ");
            person.setGender(sc.nextLine());
        }
        while(person.getPassword().length() == 0) {
            System.out.println("Your password must to contain 1 uppercase (A-Z), 1 lowercase (a-z), 1 digit (0-9), 1 special symbol(@,$,!,^) and length more or equal to 8\nEnter your password: ");
            person.setPassword(sc.nextLine());
        }
        while(person.getDateOfBirth().length() == 0){
            System.out.println("Enter your birthday date in data format (dd/mm/yyyy): ");
            person.setDateOfBirth(sc.nextLine());
        }
        person.printUserInfo();
        System.out.println("Checking your data:");
        if(checker.checkAge(person.getAge())){
            System.out.println("You are a full 18 years old.");
        } else {
            System.out.println("You are under the age of 18!");
        }
        if(checker.checkPassword(person.getPassword())){
            System.out.println("Your password is correct.");
        } else {
            System.out.println("Your password is INcorrect.");
        }
        if(checker.checkDate(person.getDateOfBirth())){
            System.out.println("Your birthday date is correct.");
        } else {
            System.out.println("Your birthday date is INcorrect.");
        }
    }
}
