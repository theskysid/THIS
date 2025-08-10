package com.theskysid.student;

import com.theskysid.student.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/x")
public class StudentController {
   @Autowired
   StudentService studentService;

   @PostMapping("/savestudent")
   public Student createStudent(@RequestBody Student student) {
      return studentService.SaveStudent(student);
   }

}
