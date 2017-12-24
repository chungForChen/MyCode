package com.ssmsim.service.impl;

import com.ssmsim.dao.ITeacherDao;
import com.ssmsim.model.*;
import com.ssmsim.service.ITeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "teacherService")
public class TeacherService implements ITeacherService {

    @Resource
    private ITeacherDao teacherDao;


    @Override
    public Teacher teacherLogin(String teacherId, String password) {
        Teacher teacher = teacherDao.selectTeacherById(teacherId);
        if(teacher != null){
            if(teacher.getPassword().equals(password)){
                teacher.setState("success");
            }else{
                teacher.setState("wrongPwd");
            }
        }else{
            teacher = new Teacher();
            teacher.setState("notExist");
        }
        return teacher;
    }

    //测试成功
    @Override
    public List<FakeClass> getFakeClassListById(String teacherId) {
        return teacherDao.selectFakeClassById(teacherId);
    }

    //测试成功
    @Override
    public ClassInfo getClassInfoById(String classId) {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClassName(teacherDao.selectClassNameById(classId));
        classInfo.setFakeStudentList(teacherDao.selectFakeStudentById(classId));
        classInfo.setStudentNumber(classInfo.getFakeStudentList().size());

        return classInfo;
    }

    //测试成功
    @Override
    public List<AddressBook> getAddressBookById(String classId) {
        return teacherDao.selectAddressBookById(classId);
    }

    //测试成功
    @Override
    public List<StudentGrade> getStudentGradeById(String classId, String teacherId) {
        return teacherDao.selectStudentGradeById(classId, teacherId);
    }

    //测试成功
    @Override
    public List<StudentTitle> getStudentTitleById(String classId) {
        return teacherDao.selectStudentTitleById(classId);
    }

    //测试成功
    @Override
    public Report getClassReportById(String classId) {
        return teacherDao.selectClassReportById(classId);
    }

    //测试成功
    @Override
    public boolean gradeModify(List<StudentGrade> gradeModifyList) {
        for(StudentGrade e: gradeModifyList){
            teacherDao.updateStudentGrade(e.getStudentId(), e.getGrade());
        }
        return true;
    }

    //测试成功
    @Override
    public StudentInfo getStudentInfoById(String studentId) {
        Student student = teacherDao.selectStudentById(studentId);
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStudent(student);
        studentInfo.setClassName(teacherDao.selectClassNameById(student.getClassId()));
        return studentInfo;
    }


}
