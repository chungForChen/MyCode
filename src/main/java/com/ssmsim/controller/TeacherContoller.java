package com.ssmsim.controller;

import com.ssmsim.model.*;
import com.ssmsim.service.ITeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value ="/teacher")
public class TeacherContoller {

    @Resource
    private ITeacherService teacherService;

    //登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Teacher loginTeacher(@RequestParam("userName")String userName
            , @RequestParam("pwd")String password, HttpSession session){
        Teacher loginTeacher = teacherService.teacherLogin(userName, password);
        if(loginTeacher.getState().equals("success")){
            session.setAttribute("teacherId", loginTeacher.getTeacherId());
        }
        return loginTeacher;
    }

    //注销
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    @ResponseBody
    public Boolean teacherLogout(HttpSession session){
        session.removeAttribute("teacherId");
        return true;
    }

    //获得任课老师的班级列表
    @RequestMapping(value = "/classList", method = RequestMethod.POST)
    @ResponseBody
    public List<FakeClass> getFakeClassList(HttpSession session){
        String teacherId = (String) session.getAttribute("teacherId");
        return teacherService.getFakeClassListById(teacherId);
    }

    //获得某个某班的情况
    @RequestMapping(value = "/classInfo",method = RequestMethod.POST)
    @ResponseBody
    public ClassInfo getClassInfo(@RequestBody String classId, HttpSession session){
        session.setAttribute("classId", classId);
        return teacherService.getClassInfoById(classId);
    }

    //获得某班学生的通讯录
    @RequestMapping(value = "/addressBook", method = RequestMethod.POST)
    @ResponseBody
    public List<AddressBook> getAddressBook(HttpSession session){
        String classId = (String) session.getAttribute("classId");
        return teacherService.getAddressBookById(classId);
    }

    //获取某班成绩记录
    @RequestMapping(value = "/grade", method = RequestMethod.POST)
    @ResponseBody
    public List<StudentGrade> getStudentGrade(HttpSession session){
        String classId = (String) session.getAttribute("classId");
        String teacherId = (String) session.getAttribute("teacherId");
        return teacherService.getStudentGradeById(classId,teacherId);
    }

    @RequestMapping(value = "/title", method = RequestMethod.POST)
    @ResponseBody
    public List<StudentTitle> getStudentTitle(HttpSession session){
        String classId = (String) session.getAttribute("classId");
        return teacherService.getStudentTitleById(classId);
    }

    @RequestMapping(value = "/report", method = RequestMethod.POST)
    @ResponseBody
    public Report getClassReport(HttpSession session){
        String classId = (String) session.getAttribute("classId");
        return teacherService.getClassReportById(classId);
    }

    @RequestMapping(value = "/modifyGrade", method = RequestMethod.POST)
    @ResponseBody
    public boolean gradeModify(@RequestBody List<StudentGrade> gradeModifyList){
        return teacherService.gradeModify(gradeModifyList);
    }

    @RequestMapping(value = "/studentProfile", method = RequestMethod.GET)
    @ResponseBody
    public StudentInfo getStudentInfo(@RequestParam("studentId")String studentId){
        return teacherService.getStudentInfoById(studentId);
    }
}
