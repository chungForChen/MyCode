package com.ssmsim.model;

public class Section {
    String sectionId;
    private String sectionSemester;
    private String sectionYear;
    private String courseId;

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

    public Section() {

    }
}
