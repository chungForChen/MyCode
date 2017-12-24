package com.ssmsim.service;


import com.ssmsim.model.*;
import com.ssmsim.service.ITeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ITeacherServiceTest {

    @Autowired
    private ITeacherService teacherService;

    @Test
    public void  testGetFakeClassList(){
        List<FakeClass> test = teacherService.getFakeClassListById("2015001146");
        for(FakeClass e: test){
            System.out.println(e.getClassId() + " " + e.getClassName());
        }
    }

    @Test
    public void testGetClassInfo(){
        ClassInfo test = teacherService.getClassInfoById("20150003");
        System.out.println(test.getClassName() + " " + test.getStudentNumber());
        for(FakeStudent e: test.getFakeStudentList()){
            System.out.println(e.getStudentName());
        }
    }

    @Test
    public void testGetAddressBookById(){
        List<AddressBook> test = teacherService.getAddressBookById("20150003");
        for(AddressBook e: test){
            System.out.println(e.getStudentId() + " " + e.getStudentName() + " "
                + e.getPersonalPhoneNumber() + " " + e.getHomeNumber());
        }
    }

    @Test
    public void testGetStudentGradeById(){
        List<StudentGrade> test = teacherService.getStudentGradeById("20150001","2015001146");
        for(StudentGrade e: test){
            System.out.println(e.getStudentId() + " " + e.getStudentName() + " " + e.getGrade());
        }
    }

    @Test
    public void testGetStudentTitleById(){
        List<StudentTitle> test = teacherService.getStudentTitleById("20150003");
        for(StudentTitle e: test){
            System.out.println(e.getStudentName() + " " + e.getTitleName());
        }
    }

    @Test
    public void testGetClassReportById(){
        Report test = teacherService.getClassReportById("20150003");
        System.out.println(test.getBoysNumber() + " " + test.getGirlsNumber() +
            " " + test.getBGradeNumber());
    }

    @Test
    public void testGradeModify(){
        List<StudentGrade> test = new ArrayList();
        StudentGrade t = new StudentGrade();
        t.setStudentId("201530611227");
        t.setGrade(84);
        test.add(t);
        System.out.println(teacherService.gradeModify(test));
    }

    @Test
    public void testGetStudentInfoById(){
        StudentInfo test = teacherService.getStudentInfoById("201530611227");
        System.out.println(test.getClassName() + " " + test.getStudent().getStudentName());
    }


}
