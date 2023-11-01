package com.ubl.studentweb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubl.studentweb.domain.Student;

@RestController
public class StudentController {
    
    @GetMapping("/hello")
    public String hello (){
        return "Welcome UBL Student";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<>();
        Student student1 = new Student();
        student1.setFullName("wasilah");
        student1.setAddress("TangerangSelatan");
        student1.setDateOfBirth(LocalDate.of(2002, 6, 4));
        student1.setNim("2112500406");

        Student student2 = new Student();
        student2.setFullName("silah");
        student2.setAddress("TangerangSelatan");
        student2.setDateOfBirth(LocalDate.of(2002, 6, 4));
        student2.setNim("2112500406");

        Student student3 = new Student();
        student3.setFullName("wasilah ulul azmi ");
        student3.setAddress("TangerangSelatan");
        student3.setDateOfBirth(LocalDate.of(2002, 6, 4));
        student3.setNim("2112500406");

        studentsList.addAll(List.of(student1, student2, student3));
        return studentsList;

    }
}
