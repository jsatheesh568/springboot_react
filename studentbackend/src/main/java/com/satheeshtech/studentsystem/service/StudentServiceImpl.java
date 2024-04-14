package com.satheeshtech.studentsystem.service;

@org.springframework.stereotype.Service
public class StudentServiceImpl implements StudentService {

    @org.springframework.beans.factory.annotation.Autowired
    private com.satheeshtech.studentsystem.repository.StudentRepository studentRepository;

    @Override
    public com.satheeshtech.studentsystem.model.Student saveStudent( com.satheeshtech.studentsystem.model.Student student) {
        return studentRepository.save(student);
    }

    @Override
    public java.util.List < com.satheeshtech.studentsystem.model.Student > getAllStudents() {
        return studentRepository.findAll();
    }
}
