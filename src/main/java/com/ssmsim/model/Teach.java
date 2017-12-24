package com.ssmsim.model;

public class Teach {
    private String sectionId;
    private String sectionSemester;
    private String courseId;
    private String teacherId;
    private String classId;

    public Teach() {
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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
