package com.example.universityinformation.model;

import java.util.List;

public class Student {
    private int id;
    private String fullname;
    private String faculty;
    private String group;
    private List<Integer> marks;

    public Student(int id, String fullname, String faculty, String group, List<Integer> marks) {
        this.id = id;
        this.fullname = fullname;
        this.faculty = faculty;
        this.group = group;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getFullname() {
        return fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
}
