package com.ssmsim.model;

public class Teacher {
    private String teacherId;
    private String teacherName;
    private String positionalTitle;
    private String teacherOffice;
    private boolean isAdviser;
    private String teacherPhone;
    private String password;
    private String state;

    public Teacher() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPositionalTitle() {
        return positionalTitle;
    }

    public void setPositionalTitle(String positionalTitle) {
        this.positionalTitle = positionalTitle;
    }

    public String getTeacherOffice() {
        return teacherOffice;
    }

    public void setTeacherOffice(String teacherOffice) {
        this.teacherOffice = teacherOffice;
    }

    public boolean isAdviser() {
        return isAdviser;
    }

    public void setAdviser(boolean adviser) {
        isAdviser = adviser;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
