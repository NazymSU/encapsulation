package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher extends  User{
    String nickName;
    String status;
    List<String> subjects = new ArrayList<>();
    int sizeOfSubjects=0;

    public Teacher(String nickName, String status, List<String> subjects, int sizeOfSubjects) {
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;

    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void  addSubject(String subject){
        subjects.add(subject);
    }
    @Override
    public String getUserData() {
        return "Teacher:"+nickName+" status: "+status+" "+ subjects;
    }
}
