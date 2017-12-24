package com.ssmsim.model;

import java.util.Date;

public class Student {
    private String studentId;
    private Date studentBirth;
    private String studentName;
    private String studentSex;
    private String classId;
    private String studentCity;
    private String studentPhoto;
    private String studentProfile;

    public Student(String studentId, Date studentBirth, String studentName, String studentSex, String classId, String studentCity, String studentPhoto, String studentProfile) {
        this.studentId = studentId;
        this.studentBirth = studentBirth;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.classId = classId;
        this.studentCity = studentCity;
        this.studentPhoto = studentPhoto;
        this.studentProfile = studentProfile;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getStudentBirth() {
        return studentBirth;
    }

    public void setStudentBirth(Date studentBirth) {
        this.studentBirth = studentBirth;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(String studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public String getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(String studentProfile) {
        this.studentProfile = studentProfile;
    }
}
