package com.company;

public class Validator {
    int upperCaseCounter;
    int lowerCaseCounter;
    int digitCounter;
    int specialSymbolCounter;
    int dd;
    int mm;
    int year;

    public Validator(){
        upperCaseCounter = 0;
        lowerCaseCounter = 0;
        digitCounter = 0;
        specialSymbolCounter = 0;
        dd = 0;
        mm = 0;
        year = 0;
    }
    public boolean checkAge(int age){
        if(age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkPassword(String password){
        if(password.length() < 8) {
            return false;
        }
        for(int i = 0; i < password.length(); i++){
            int letter = password.charAt(i);
            if(letter >= 97 && letter <= 122){
                lowerCaseCounter++;
            } else if(letter >= 65 && letter <= 90) {
                upperCaseCounter++;
            } else if(letter >= 47 && letter <= 57){
                digitCounter++;
            } else if(letter == 64 || letter == 36 || letter == 33 || letter == 94){
                specialSymbolCounter++;
            } else {
                return false;
            }
        }
        return (upperCaseCounter >= 1 && lowerCaseCounter >= 1 && digitCounter >= 1 && specialSymbolCounter >= 1);
    }
    public boolean checkDate(String Date){
        String[] splitDate = Date.split("/");
        if(splitDate.length == 3){
            for(int i = 0; i < splitDate.length; i++){
                int toInt = Integer.parseInt(splitDate[i]);
                if(i == 0) {
                    dd = toInt;
                }
                if(i == 1){
                    mm = toInt;
                }
                if(i == 2) {
                    year = toInt;
                }
            }
        } else {
            return false;
        }
        if(dd >= 1 && dd <= 31 && mm >= 1 && mm <= 12){
            if(dd <= 29 && mm == 2 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
                return true;
            } else if (dd <= 28 && mm == 2) {
                return true;
            } else if (dd >= 1 && dd <= 30 && mm != 2 && (mm == 4 || mm == 6 || mm == 9 || mm == 11)){
                return true;
            } else if (dd >= 1 && dd <= 31 && mm != 2 && (mm != 4 || mm != 6 || mm != 9 || mm != 11)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
