package com.company;

public class Student extends  User{
    String name;
    String surname;
    String group;
    double gpa;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    @Override
    public String getUserData() {
        return id+")"+"Login: "+login+" password: "+password+" Name: "+name+" Surname: "+surname+" group: "+group+
                " gpa: "+gpa;
    }
}
