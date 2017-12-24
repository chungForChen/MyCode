package com.ssmsim.model;

import java.lang.ref.PhantomReference;
import java.util.List;

public class ClassInfo {

    private String className;
    private int studentNumber;
    private List<FakeStudent> fakeStudentList;

    public ClassInfo() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public List<FakeStudent> getFakeStudentList() {
        return fakeStudentList;
    }

    public void setFakeStudentList(List<FakeStudent> fakeStudentList) {
        this.fakeStudentList = fakeStudentList;
    }
}
