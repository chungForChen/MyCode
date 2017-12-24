package com.ssmsim.dao;

import com.ssmsim.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ITeacherDaoTest {

    @Autowired
    ITeacherDao dao;

    @Test
    public void testSelectTeacherById(){
        System.out.println(dao.selectTeacherById("2015001146").getTeacherName());
    }

    @Test
    public void testSelectFakeClassById(){
        List<FakeClass> test = dao.selectFakeClassById("2015001146");
        for (FakeClass e: test) {
            System.out.println(e.getClassId());
        }
    }

    @Test
    public void testSelectFakeStudentById(){
        List<FakeStudent> test = dao.selectFakeStudentById("20150003");
        for(FakeStudent e: test){
            System.out.println(e.getStudentName());
        }
    }

    @Test
    public void testSelectClassNameById(){
        System.out.println(dao.selectClassNameById("20140001"));
    }

    @Test
    public void testSelectAddressBookById(){
        List<AddressBook> test = dao.selectAddressBookById("20150003");
        for(AddressBook e: test){
            System.out.println(e.getStudentName() + "  "
                    + e.getPersonalPhoneNumber() + " " + e.getHomeNumber());
        }
    }

    @Test
    public void testSelectStudentGradeById(){
        List<StudentGrade> test = dao.selectStudentGradeById("20150001","2015001146");
        for(StudentGrade e: test){
            System.out.println(e.getStudentId() + " " + e.getStudentName() + " " +e.getGrade());
        }
    }

    @Test
    public void testSelectStudentTitle(){
        List<StudentTitle> test = dao.selectStudentTitleById("20150003");
        for(StudentTitle e: test){
            System.out.println(e.getStudentName() + " " + e.getTitleName());
        }
    }

    @Test
    public void testSelectClassReportById(){
        Report test = dao.selectClassReportById("20150003");
        System.out.println(test.getBoysNumber() + " " + test.getGirlsNumber() + " A " + test.getAGradeNumber()
                + " B " + test.getBGradeNumber());

    }

    @Test
    public void updateStudentGrade(){
        dao.updateStudentGrade("201530611227",93);
    }

    @Test
    public void testSelectStudentById(){
        Student test = dao.selectStudentById("201530611227");
        System.out.println(test.getStudentName() + "  ");
    }
}
