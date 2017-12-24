package com.ssmsim.dao;

import com.ssmsim.model.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ITeacherDao {

    //测试成功
    Teacher selectTeacherById(String id);

    //测试成功
    List<FakeClass> selectFakeClassById(String teacherId);

    //测试成功
    List<FakeStudent> selectFakeStudentById(String classId);
    //测试成功
    String selectClassNameById(String classId);

    //测试成功
    List<AddressBook> selectAddressBookById(String classId);

    //测试成功
    List<StudentGrade> selectStudentGradeById(@Param("classId") String classId, @Param("teacherId") String teacherId);

    //测试成功， 但是title表中字段tile应该为title吧？
    List<StudentTitle> selectStudentTitleById(String classId);

    //测试成功
    Report selectClassReportById(String classId);

    //测试成功
    void updateStudentGrade(@Param("studentId") String studentId, @Param("grade") int grade);

    //测试成功
    Student selectStudentById(String studentId);

}
