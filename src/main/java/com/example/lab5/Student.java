package com.example.lab5;

public class Student {
    String name;

    String year;

    String major;

    public Student(String newName, String newMajor, String newYear){
        name = newName;
        year = newYear;
        major = newMajor;
    }

    public String toString(){
        return name + " is a " + major + " major, They are in year " + year + ".";
    }
}

