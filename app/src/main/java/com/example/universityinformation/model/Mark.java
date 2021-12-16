package com.example.universityinformation.model;

public class Mark {
    private int id;
    private String discipline;
    private int mark;

    public Mark(int id, String discipline) {
        this.id = id;
        this.discipline = discipline;
    }

    public int getId() {
        return id;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getMark() {
        return mark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
