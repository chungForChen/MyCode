package com.ssmsim.service;

import com.ssmsim.model.*;

import java.util.List;

public interface ITeacherService {
    public Teacher teacherLogin(String teacherId, String password);

    public List<FakeClass> getFakeClassListById(String teacherId);

    public ClassInfo getClassInfoById(String classId);

    public List<AddressBook> getAddressBookById(String classId);

    List<StudentGrade> getStudentGradeById(String classId, String teacherId);

    List<StudentTitle> getStudentTitleById(String classId);

    Report getClassReportById(String classId);

    boolean gradeModify(List<StudentGrade> gradeModifyList);

    StudentInfo getStudentInfoById(String studentId);
}
