package com.satheeshtech.studentsystem.service;

public interface StudentService {
    public com.satheeshtech.studentsystem.model.Student saveStudent( com.satheeshtech.studentsystem.model.Student student);
    public java.util.List < com.satheeshtech.studentsystem.model.Student > getAllStudents();
}
