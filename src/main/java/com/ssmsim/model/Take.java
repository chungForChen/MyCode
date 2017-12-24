package com.ssmsim.model;

public class Take {
    private String sectionId;
    private String sectionSemester;
    private String sectionYear;
    private String courseId;
    private String studentId;
    private String grade;

    public Take() {
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionSemester() {
        return sectionSemester;
    }

    public void setSectionSemester(String sectionSemester) {
        this.sectionSemester = sectionSemester;
    }

    public String getSectionYear() {
        return sectionYear;
    }

    public void setSectionYear(String sectionYear) {
        this.sectionYear = sectionYear;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
