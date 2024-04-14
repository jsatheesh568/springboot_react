package com.satheeshtech.studentsystem.controller;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping ("/student-management/v1/api")
@org.springframework.web.bind.annotation.CrossOrigin
public class StudentController {
    @org.springframework.beans.factory.annotation.Autowired
    private com.satheeshtech.studentsystem.service.StudentService studentService;

    @org.springframework.web.bind.annotation.PostMapping ("/add")
    public String add(@org.springframework.web.bind.annotation.RequestBody com.satheeshtech.studentsystem.model.Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @org.springframework.web.bind.annotation.GetMapping ("/getAll")
    public java.util.List < com.satheeshtech.studentsystem.model.Student > list(){
        return studentService.getAllStudents();
    }
}
