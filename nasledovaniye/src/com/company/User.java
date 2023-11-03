package com.company;

public class User {
protected  int id;
protected  String login;
protected String password;
protected  String name;
protected  String surname;

    public User() {
    }

    public User(int id, String login, String password, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public String getData() {
        return "User: " +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' ;
    }
}
